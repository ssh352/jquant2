/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcQryTransferBankField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQryTransferBankField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryTransferBankField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcQryTransferBankField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBankID(String value) {
    thostmdapiJNI.CThostFtdcQryTransferBankField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return thostmdapiJNI.CThostFtdcQryTransferBankField_BankID_get(swigCPtr, this);
  }

  public void setBankBrchID(String value) {
    thostmdapiJNI.CThostFtdcQryTransferBankField_BankBrchID_set(swigCPtr, this, value);
  }

  public String getBankBrchID() {
    return thostmdapiJNI.CThostFtdcQryTransferBankField_BankBrchID_get(swigCPtr, this);
  }

  public CThostFtdcQryTransferBankField() {
    this(thostmdapiJNI.new_CThostFtdcQryTransferBankField(), true);
  }

}