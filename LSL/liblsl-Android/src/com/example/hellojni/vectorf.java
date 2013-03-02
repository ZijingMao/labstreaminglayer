/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class vectorf {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected vectorf(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(vectorf obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        lslAndroidJNI.delete_vectorf(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public vectorf() {
    this(lslAndroidJNI.new_vectorf__SWIG_0(), true);
  }

  public vectorf(long n) {
    this(lslAndroidJNI.new_vectorf__SWIG_1(n), true);
  }

  public long size() {
    return lslAndroidJNI.vectorf_size(swigCPtr, this);
  }

  public long capacity() {
    return lslAndroidJNI.vectorf_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    lslAndroidJNI.vectorf_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return lslAndroidJNI.vectorf_isEmpty(swigCPtr, this);
  }

  public void clear() {
    lslAndroidJNI.vectorf_clear(swigCPtr, this);
  }

  public void add(float x) {
    lslAndroidJNI.vectorf_add(swigCPtr, this, x);
  }

  public float get(int i) {
    return lslAndroidJNI.vectorf_get(swigCPtr, this, i);
  }

  public void set(int i, float val) {
    lslAndroidJNI.vectorf_set(swigCPtr, this, i, val);
  }

}
