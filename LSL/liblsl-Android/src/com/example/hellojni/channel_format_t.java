/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public final class channel_format_t {
  public final static channel_format_t cf_float32 = new channel_format_t("cf_float32", lslAndroidJNI.cf_float32_get());
  public final static channel_format_t cf_double64 = new channel_format_t("cf_double64", lslAndroidJNI.cf_double64_get());
  public final static channel_format_t cf_string = new channel_format_t("cf_string", lslAndroidJNI.cf_string_get());
  public final static channel_format_t cf_int32 = new channel_format_t("cf_int32", lslAndroidJNI.cf_int32_get());
  public final static channel_format_t cf_int16 = new channel_format_t("cf_int16", lslAndroidJNI.cf_int16_get());
  public final static channel_format_t cf_int8 = new channel_format_t("cf_int8", lslAndroidJNI.cf_int8_get());
  public final static channel_format_t cf_int64 = new channel_format_t("cf_int64", lslAndroidJNI.cf_int64_get());
  public final static channel_format_t cf_undefined = new channel_format_t("cf_undefined", lslAndroidJNI.cf_undefined_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static channel_format_t swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + channel_format_t.class + " with value " + swigValue);
  }

  private channel_format_t(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private channel_format_t(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private channel_format_t(String swigName, channel_format_t swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static channel_format_t[] swigValues = { cf_float32, cf_double64, cf_string, cf_int32, cf_int16, cf_int8, cf_int64, cf_undefined };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

