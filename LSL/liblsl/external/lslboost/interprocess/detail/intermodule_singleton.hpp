//////////////////////////////////////////////////////////////////////////////
//
// (C) Copyright Ion Gaztanaga 2009-2011. Distributed under the Boost
// Software License, Version 1.0. (See accompanying file
// LICENSE_1_0.txt or copy at http://www.lslboost.org/LICENSE_1_0.txt)
//
// See http://www.lslboost.org/libs/interprocess for documentation.
//
//////////////////////////////////////////////////////////////////////////////

#ifndef BOOST_INTERPROCESS_INTERMODULE_SINGLETON_HPP
#define BOOST_INTERPROCESS_INTERMODULE_SINGLETON_HPP

#if defined(_MSC_VER)&&(_MSC_VER>=1200)
#pragma once
#endif

#include <lslboost/interprocess/detail/config_begin.hpp>
#include <lslboost/interprocess/detail/workaround.hpp>

#ifdef BOOST_INTERPROCESS_WINDOWS
   #include <lslboost/interprocess/detail/windows_intermodule_singleton.hpp>
#endif
#include <lslboost/interprocess/detail/portable_intermodule_singleton.hpp>

namespace lslboost{
namespace interprocess{
namespace ipcdetail{

//Now this class is a singleton, initializing the singleton in
//the first get() function call if LazyInit is false. If true
//then the singleton will be initialized when loading the module.
template<typename C, bool LazyInit = true, bool Phoenix = true>
class intermodule_singleton
   #ifdef BOOST_INTERPROCESS_WINDOWS
   : public windows_intermodule_singleton<C, LazyInit, Phoenix>
   #else
   : public portable_intermodule_singleton<C, LazyInit, Phoenix>
   #endif
{};

}  //namespace ipcdetail{
}  //namespace interprocess{
}  //namespace lslboost{

#include <lslboost/interprocess/detail/config_end.hpp>

#endif