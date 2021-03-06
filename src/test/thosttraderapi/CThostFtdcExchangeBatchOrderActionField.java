/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thosttraderapi;

public class CThostFtdcExchangeBatchOrderActionField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcExchangeBatchOrderActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeBatchOrderActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttradeapiJNI.delete_CThostFtdcExchangeBatchOrderActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    thosttradeapiJNI.CThostFtdcExchangeBatchOrderActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttradeapiJNI.CThostFtdcExchangeBatchOrderActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setActionDate(String value) {
    thosttradeapiJNI.CThostFtdcExchangeBatchOrderActionField_ActionDate_set(swigCPtr, this, value);
  }

  public String getActionDate() {
    return thosttradeapiJNI.CThostFtdcExchangeBatchOrderActionField_ActionDate_get(swigCPtr, this);
  }

  public void setActionTime(String value) {
    thosttradeapiJNI.CThostFtdcExchangeBatchOrderActionField_ActionTime_set(swigCPtr, this, value);
  }

  public String getActionTime() {
    return thosttradeapiJNI.CThostFtdcExchangeBatchOrderActionField_ActionTime_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    thosttradeapiJNI.CThostFtdcExchangeBatchOrderActionField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return thosttradeapiJNI.CThostFtdcExchangeBatchOrderActionField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    thosttradeapiJNI.CThostFtdcExchangeBatchOrderActionField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return thosttradeapiJNI.CThostFtdcExchangeBatchOrderActionField_InstallID_get(swigCPtr, this);
  }

  public void setActionLocalID(String value) {
    thosttradeapiJNI.CThostFtdcExchangeBatchOrderActionField_ActionLocalID_set(swigCPtr, this, value);
  }

  public String getActionLocalID() {
    return thosttradeapiJNI.CThostFtdcExchangeBatchOrderActionField_ActionLocalID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    thosttradeapiJNI.CThostFtdcExchangeBatchOrderActionField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return thosttradeapiJNI.CThostFtdcExchangeBatchOrderActionField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    thosttradeapiJNI.CThostFtdcExchangeBatchOrderActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return thosttradeapiJNI.CThostFtdcExchangeBatchOrderActionField_ClientID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    thosttradeapiJNI.CThostFtdcExchangeBatchOrderActionField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return thosttradeapiJNI.CThostFtdcExchangeBatchOrderActionField_BusinessUnit_get(swigCPtr, this);
  }

  public void setOrderActionStatus(char value) {
    thosttradeapiJNI.CThostFtdcExchangeBatchOrderActionField_OrderActionStatus_set(swigCPtr, this, value);
  }

  public char getOrderActionStatus() {
    return thosttradeapiJNI.CThostFtdcExchangeBatchOrderActionField_OrderActionStatus_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thosttradeapiJNI.CThostFtdcExchangeBatchOrderActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thosttradeapiJNI.CThostFtdcExchangeBatchOrderActionField_UserID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    thosttradeapiJNI.CThostFtdcExchangeBatchOrderActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return thosttradeapiJNI.CThostFtdcExchangeBatchOrderActionField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    thosttradeapiJNI.CThostFtdcExchangeBatchOrderActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return thosttradeapiJNI.CThostFtdcExchangeBatchOrderActionField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcExchangeBatchOrderActionField() {
    this(thosttradeapiJNI.new_CThostFtdcExchangeBatchOrderActionField(), true);
  }

}
