/*
 * An XML document type.
 * Localname: getMessageServiceResponse
 * Namespace: http://service.ws.axis2.neos.org
 * Java type: org.neos.axis2.ws.service.GetMessageServiceResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.neos.axis2.ws.service.impl;
/**
 * A document containing one getMessageServiceResponse(@http://service.ws.axis2.neos.org) element.
 *
 * This is a complex type.
 */
public class GetMessageServiceResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.neos.axis2.ws.service.GetMessageServiceResponseDocument
{
    
    public GetMessageServiceResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMESSAGESERVICERESPONSE$0 = 
        new javax.xml.namespace.QName("http://service.ws.axis2.neos.org", "getMessageServiceResponse");
    
    
    /**
     * Gets the "getMessageServiceResponse" element
     */
    public org.neos.axis2.ws.service.GetMessageServiceResponseDocument.GetMessageServiceResponse getGetMessageServiceResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.neos.axis2.ws.service.GetMessageServiceResponseDocument.GetMessageServiceResponse target = null;
            target = (org.neos.axis2.ws.service.GetMessageServiceResponseDocument.GetMessageServiceResponse)get_store().find_element_user(GETMESSAGESERVICERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getMessageServiceResponse" element
     */
    public void setGetMessageServiceResponse(org.neos.axis2.ws.service.GetMessageServiceResponseDocument.GetMessageServiceResponse getMessageServiceResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.neos.axis2.ws.service.GetMessageServiceResponseDocument.GetMessageServiceResponse target = null;
            target = (org.neos.axis2.ws.service.GetMessageServiceResponseDocument.GetMessageServiceResponse)get_store().find_element_user(GETMESSAGESERVICERESPONSE$0, 0);
            if (target == null)
            {
                target = (org.neos.axis2.ws.service.GetMessageServiceResponseDocument.GetMessageServiceResponse)get_store().add_element_user(GETMESSAGESERVICERESPONSE$0);
            }
            target.set(getMessageServiceResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getMessageServiceResponse" element
     */
    public org.neos.axis2.ws.service.GetMessageServiceResponseDocument.GetMessageServiceResponse addNewGetMessageServiceResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.neos.axis2.ws.service.GetMessageServiceResponseDocument.GetMessageServiceResponse target = null;
            target = (org.neos.axis2.ws.service.GetMessageServiceResponseDocument.GetMessageServiceResponse)get_store().add_element_user(GETMESSAGESERVICERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getMessageServiceResponse(@http://service.ws.axis2.neos.org).
     *
     * This is a complex type.
     */
    public static class GetMessageServiceResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.neos.axis2.ws.service.GetMessageServiceResponseDocument.GetMessageServiceResponse
    {
        
        public GetMessageServiceResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("http://service.ws.axis2.neos.org", "return");
        
        
        /**
         * Gets the "return" element
         */
        public java.lang.String getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "return" element
         */
        public org.apache.xmlbeans.XmlString xgetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "return" element
         */
        public boolean isNilReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "return" element
         */
        public boolean isSetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RETURN$0) != 0;
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(java.lang.String xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETURN$0);
                }
                target.setStringValue(xreturn);
            }
        }
        
        /**
         * Sets (as xml) the "return" element
         */
        public void xsetReturn(org.apache.xmlbeans.XmlString xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RETURN$0);
                }
                target.set(xreturn);
            }
        }
        
        /**
         * Nils the "return" element
         */
        public void setNilReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RETURN$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "return" element
         */
        public void unsetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RETURN$0, 0);
            }
        }
    }
}
