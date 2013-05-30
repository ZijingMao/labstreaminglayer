//////////////////////////////////////////////////////////////////////////////
//
// (C) Copyright Ion Gaztanaga 2005-2011. Distributed under the Boost
// Software License, Version 1.0. (See accompanying file
// LICENSE_1_0.txt or copy at http://www.lslboost.org/LICENSE_1_0.txt)
//
// See http://www.lslboost.org/libs/interprocess for documentation.
//
//////////////////////////////////////////////////////////////////////////////

#ifndef BOOST_INTERPROCESS_DETAIL_WINDOWS_SEMAPHORE_HPP
#define BOOST_INTERPROCESS_DETAIL_WINDOWS_SEMAPHORE_HPP

#if (defined _MSC_VER) && (_MSC_VER >= 1200)
#  pragma once
#endif

#include <lslboost/interprocess/detail/config_begin.hpp>
#include <lslboost/interprocess/detail/workaround.hpp>
#include <lslboost/interprocess/detail/posix_time_types_wrk.hpp>
#include <lslboost/interprocess/detail/win32_api.hpp>
#include <lslboost/interprocess/detail/windows_intermodule_singleton.hpp>
#include <lslboost/interprocess/sync/windows/sync_utils.hpp>
#include <lslboost/interprocess/sync/windows/winapi_semaphore_wrapper.hpp>
#include <lslboost/interprocess/exceptions.hpp>


namespace lslboost {
namespace interprocess {
namespace ipcdetail {

class windows_semaphore
{
   windows_semaphore(const windows_semaphore &);
   windows_semaphore &operator=(const windows_semaphore &);
   public:

   windows_semaphore(unsigned int initialCount);
   ~windows_semaphore();

   void post(long release_count = 1);
   void wait();
   bool try_wait();
   bool timed_wait(const lslboost::posix_time::ptime &abs_time);

   private:
   const sync_id id_;
};

inline windows_semaphore::windows_semaphore(unsigned int initialCount)
   : id_()
{
   sync_handles &handles =
      windows_intermodule_singleton<sync_handles>::get();
   //Force smeaphore creation with the initial count
   bool open_or_created;
   handles.obtain_semaphore(this->id_, initialCount, &open_or_created);
   //The semaphore must be created, never opened
   assert(open_or_created);
   assert(open_or_created && winapi::get_last_error() != winapi::error_already_exists);
   (void)open_or_created;
}

inline windows_semaphore::~windows_semaphore()
{
   sync_handles &handles =
      windows_intermodule_singleton<sync_handles>::get();
   handles.destroy_handle(this->id_);
}

inline void windows_semaphore::wait(void)
{
   sync_handles &handles =
      windows_intermodule_singleton<sync_handles>::get();
   //This can throw
   winapi_semaphore_functions sem(handles.obtain_semaphore(this->id_, 0));
   sem.wait();
}

inline bool windows_semaphore::try_wait(void)
{
   sync_handles &handles =
      windows_intermodule_singleton<sync_handles>::get();
   //This can throw
   winapi_semaphore_functions sem(handles.obtain_semaphore(this->id_, 0));
   return sem.try_wait();
}

inline bool windows_semaphore::timed_wait(const lslboost::posix_time::ptime &abs_time)
{
   sync_handles &handles =
      windows_intermodule_singleton<sync_handles>::get();
   //This can throw
   winapi_semaphore_functions sem(handles.obtain_semaphore(this->id_, 0));
   return sem.timed_wait(abs_time);
}

inline void windows_semaphore::post(long release_count)
{
   sync_handles &handles =
      windows_intermodule_singleton<sync_handles>::get();
   winapi_semaphore_functions sem(handles.obtain_semaphore(this->id_, 0));
   sem.post(release_count);
}

}  //namespace ipcdetail {
}  //namespace interprocess {
}  //namespace lslboost {

#include <lslboost/interprocess/detail/config_end.hpp>

#endif   //BOOST_INTERPROCESS_DETAIL_WINDOWS_SEMAPHORE_HPP
