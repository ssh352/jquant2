/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcQryCommRateModelField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQryCommRateModelField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryCommRateModelField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcQryCommRateModelField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcQryCommRateModelField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcQryCommRateModelField_BrokerID_get(swigCPtr, this);
  }

  public void setCommModelID(String value) {
    thostmdapiJNI.CThostFtdcQryCommRateModelField_CommModelID_set(swigCPtr, this, value);
  }

  public String getCommModelID() {
    return thostmdapiJNI.CThostFtdcQryCommRateModelField_CommModelID_get(swigCPtr, this);
  }

  public CThostFtdcQryCommRateModelField() {
    this(thostmdapiJNI.new_CThostFtdcQryCommRateModelField(), true);
  }

}
