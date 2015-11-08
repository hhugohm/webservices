/**
 * WservicesCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package org.neos.axis2.ws.stub;


/**
 *  WservicesCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class WservicesCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public WservicesCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public WservicesCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for getMessageService method
     * override this method for handling normal response from getMessageService operation
     */
    public void receiveResultgetMessageService(
        org.neos.axis2.ws.stub.WservicesStub.GetMessageServiceResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getMessageService operation
     */
    public void receiveErrorgetMessageService(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for celsiusToFarenheit method
     * override this method for handling normal response from celsiusToFarenheit operation
     */
    public void receiveResultcelsiusToFarenheit(
        org.neos.axis2.ws.stub.WservicesStub.CelsiusToFarenheitResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from celsiusToFarenheit operation
     */
    public void receiveErrorcelsiusToFarenheit(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for farenheitToCelsius method
     * override this method for handling normal response from farenheitToCelsius operation
     */
    public void receiveResultfarenheitToCelsius(
        org.neos.axis2.ws.stub.WservicesStub.FarenheitToCelsiusResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from farenheitToCelsius operation
     */
    public void receiveErrorfarenheitToCelsius(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for factorial method
     * override this method for handling normal response from factorial operation
     */
    public void receiveResultfactorial(
        org.neos.axis2.ws.stub.WservicesStub.FactorialResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from factorial operation
     */
    public void receiveErrorfactorial(java.lang.Exception e) {
    }
}
