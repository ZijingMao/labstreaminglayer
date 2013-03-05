/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.example.hellojni;

public class stream_inlet {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected stream_inlet(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(stream_inlet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        lslAndroidJNI.delete_stream_inlet(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public stream_inlet(stream_info info, int max_buflen, int max_chunklen, boolean recover) {
    this(lslAndroidJNI.new_stream_inlet__SWIG_0(stream_info.getCPtr(info), info, max_buflen, max_chunklen, recover), true);
  }

  public stream_inlet(stream_info info, int max_buflen, int max_chunklen) {
    this(lslAndroidJNI.new_stream_inlet__SWIG_1(stream_info.getCPtr(info), info, max_buflen, max_chunklen), true);
  }

  public stream_inlet(stream_info info, int max_buflen) {
    this(lslAndroidJNI.new_stream_inlet__SWIG_2(stream_info.getCPtr(info), info, max_buflen), true);
  }

  public stream_inlet(stream_info info) {
    this(lslAndroidJNI.new_stream_inlet__SWIG_3(stream_info.getCPtr(info), info), true);
  }

  public stream_info info(double timeout) {
    return new stream_info(lslAndroidJNI.stream_inlet_info__SWIG_0(swigCPtr, this, timeout), true);
  }

  public stream_info info() {
    return new stream_info(lslAndroidJNI.stream_inlet_info__SWIG_1(swigCPtr, this), true);
  }

  public void open_stream(double timeout) {
    lslAndroidJNI.stream_inlet_open_stream__SWIG_0(swigCPtr, this, timeout);
  }

  public void open_stream() {
    lslAndroidJNI.stream_inlet_open_stream__SWIG_1(swigCPtr, this);
  }

  public void close_stream() {
    lslAndroidJNI.stream_inlet_close_stream(swigCPtr, this);
  }

  public double time_correction(double timeout) {
    return lslAndroidJNI.stream_inlet_time_correction__SWIG_0(swigCPtr, this, timeout);
  }

  public double time_correction() {
    return lslAndroidJNI.stream_inlet_time_correction__SWIG_1(swigCPtr, this);
  }

  public double pull_sample(vectorf sample, double timeout) {
    return lslAndroidJNI.stream_inlet_pull_sample__SWIG_2(swigCPtr, this, vectorf.getCPtr(sample), sample, timeout);
  }

  public double pull_sample(vectorf sample) {
    return lslAndroidJNI.stream_inlet_pull_sample__SWIG_3(swigCPtr, this, vectorf.getCPtr(sample), sample);
  }

  public double pull_sample(vectord sample, double timeout) {
    return lslAndroidJNI.stream_inlet_pull_sample__SWIG_4(swigCPtr, this, vectord.getCPtr(sample), sample, timeout);
  }

  public double pull_sample(vectord sample) {
    return lslAndroidJNI.stream_inlet_pull_sample__SWIG_5(swigCPtr, this, vectord.getCPtr(sample), sample);
  }

  public double pull_sample(vectorl sample, double timeout) {
    return lslAndroidJNI.stream_inlet_pull_sample__SWIG_6(swigCPtr, this, vectorl.getCPtr(sample), sample, timeout);
  }

  public double pull_sample(vectorl sample) {
    return lslAndroidJNI.stream_inlet_pull_sample__SWIG_7(swigCPtr, this, vectorl.getCPtr(sample), sample);
  }

  public double pull_sample(vectori sample, double timeout) {
    return lslAndroidJNI.stream_inlet_pull_sample__SWIG_8(swigCPtr, this, vectori.getCPtr(sample), sample, timeout);
  }

  public double pull_sample(vectori sample) {
    return lslAndroidJNI.stream_inlet_pull_sample__SWIG_9(swigCPtr, this, vectori.getCPtr(sample), sample);
  }

  public double pull_sample(vectors sample, double timeout) {
    return lslAndroidJNI.stream_inlet_pull_sample__SWIG_10(swigCPtr, this, vectors.getCPtr(sample), sample, timeout);
  }

  public double pull_sample(vectors sample) {
    return lslAndroidJNI.stream_inlet_pull_sample__SWIG_11(swigCPtr, this, vectors.getCPtr(sample), sample);
  }

  public double pull_sample(SWIGTYPE_p_std__vectorT_char_t sample, double timeout) {
    return lslAndroidJNI.stream_inlet_pull_sample__SWIG_12(swigCPtr, this, SWIGTYPE_p_std__vectorT_char_t.getCPtr(sample), timeout);
  }

  public double pull_sample(SWIGTYPE_p_std__vectorT_char_t sample) {
    return lslAndroidJNI.stream_inlet_pull_sample__SWIG_13(swigCPtr, this, SWIGTYPE_p_std__vectorT_char_t.getCPtr(sample));
  }

  public double pull_sample(vectorstr sample, double timeout) {
    return lslAndroidJNI.stream_inlet_pull_sample__SWIG_14(swigCPtr, this, vectorstr.getCPtr(sample), sample, timeout);
  }

  public double pull_sample(vectorstr sample) {
    return lslAndroidJNI.stream_inlet_pull_sample__SWIG_15(swigCPtr, this, vectorstr.getCPtr(sample), sample);
  }

  public double pull_sample(SWIGTYPE_p_float buffer, int buffer_elements, double timeout) {
    return lslAndroidJNI.stream_inlet_pull_sample__SWIG_16(swigCPtr, this, SWIGTYPE_p_float.getCPtr(buffer), buffer_elements, timeout);
  }

  public double pull_sample(SWIGTYPE_p_float buffer, int buffer_elements) {
    return lslAndroidJNI.stream_inlet_pull_sample__SWIG_17(swigCPtr, this, SWIGTYPE_p_float.getCPtr(buffer), buffer_elements);
  }

  public double pull_sample(SWIGTYPE_p_double buffer, int buffer_elements, double timeout) {
    return lslAndroidJNI.stream_inlet_pull_sample__SWIG_18(swigCPtr, this, SWIGTYPE_p_double.getCPtr(buffer), buffer_elements, timeout);
  }

  public double pull_sample(SWIGTYPE_p_double buffer, int buffer_elements) {
    return lslAndroidJNI.stream_inlet_pull_sample__SWIG_19(swigCPtr, this, SWIGTYPE_p_double.getCPtr(buffer), buffer_elements);
  }

  public double pull_sample(SWIGTYPE_p_long buffer, int buffer_elements, double timeout) {
    return lslAndroidJNI.stream_inlet_pull_sample__SWIG_20(swigCPtr, this, SWIGTYPE_p_long.getCPtr(buffer), buffer_elements, timeout);
  }

  public double pull_sample(SWIGTYPE_p_long buffer, int buffer_elements) {
    return lslAndroidJNI.stream_inlet_pull_sample__SWIG_21(swigCPtr, this, SWIGTYPE_p_long.getCPtr(buffer), buffer_elements);
  }

  public double pull_sample(SWIGTYPE_p_int buffer, int buffer_elements, double timeout) {
    return lslAndroidJNI.stream_inlet_pull_sample__SWIG_22(swigCPtr, this, SWIGTYPE_p_int.getCPtr(buffer), buffer_elements, timeout);
  }

  public double pull_sample(SWIGTYPE_p_int buffer, int buffer_elements) {
    return lslAndroidJNI.stream_inlet_pull_sample__SWIG_23(swigCPtr, this, SWIGTYPE_p_int.getCPtr(buffer), buffer_elements);
  }

  public double pull_sample(SWIGTYPE_p_short buffer, int buffer_elements, double timeout) {
    return lslAndroidJNI.stream_inlet_pull_sample__SWIG_24(swigCPtr, this, SWIGTYPE_p_short.getCPtr(buffer), buffer_elements, timeout);
  }

  public double pull_sample(SWIGTYPE_p_short buffer, int buffer_elements) {
    return lslAndroidJNI.stream_inlet_pull_sample__SWIG_25(swigCPtr, this, SWIGTYPE_p_short.getCPtr(buffer), buffer_elements);
  }

  public double pull_sample(String buffer, int buffer_elements, double timeout) {
    return lslAndroidJNI.stream_inlet_pull_sample__SWIG_26(swigCPtr, this, buffer, buffer_elements, timeout);
  }

  public double pull_sample(String buffer, int buffer_elements) {
    return lslAndroidJNI.stream_inlet_pull_sample__SWIG_27(swigCPtr, this, buffer, buffer_elements);
  }

  public double pull_sample(SWIGTYPE_p_std__string buffer, int buffer_elements, double timeout) {
    return lslAndroidJNI.stream_inlet_pull_sample__SWIG_28(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(buffer), buffer_elements, timeout);
  }

  public double pull_sample(SWIGTYPE_p_std__string buffer, int buffer_elements) {
    return lslAndroidJNI.stream_inlet_pull_sample__SWIG_29(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(buffer), buffer_elements);
  }

  public double pull_numeric_raw(SWIGTYPE_p_void sample, int buffer_bytes, double timeout) {
    return lslAndroidJNI.stream_inlet_pull_numeric_raw__SWIG_0(swigCPtr, this, SWIGTYPE_p_void.getCPtr(sample), buffer_bytes, timeout);
  }

  public double pull_numeric_raw(SWIGTYPE_p_void sample, int buffer_bytes) {
    return lslAndroidJNI.stream_inlet_pull_numeric_raw__SWIG_1(swigCPtr, this, SWIGTYPE_p_void.getCPtr(sample), buffer_bytes);
  }

  public long samples_available() {
    return lslAndroidJNI.stream_inlet_samples_available(swigCPtr, this);
  }

}
