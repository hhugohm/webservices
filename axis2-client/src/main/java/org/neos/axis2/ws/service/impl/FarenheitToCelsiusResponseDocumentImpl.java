/*
 * An XML document type.
 * Localname: farenheitToCelsiusResponse
 * Namespace: http://service.ws.axis2.neos.org
 * Java type: org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.neos.axis2.ws.service.impl;
/**
 * A document containing one farenheitToCelsiusResponse(@http://service.ws.axis2.neos.org) element.
 *
 * This is a complex type.
 */
public class FarenheitToCelsiusResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument
{
    
    public FarenheitToCelsiusResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FARENHEITTOCELSIUSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://service.ws.axis2.neos.org", "farenheitToCelsiusResponse");
    
    
    /**
     * Gets the "farenheitToCelsiusResponse" element
     */
    public org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument.FarenheitToCelsiusResponse getFarenheitToCelsiusResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument.FarenheitToCelsiusResponse target = null;
            target = (org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument.FarenheitToCelsiusResponse)get_store().find_element_user(FARENHEITTOCELSIUSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "farenheitToCelsiusResponse" element
     */
    public void setFarenheitToCelsiusResponse(org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument.FarenheitToCelsiusResponse farenheitToCelsiusResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument.FarenheitToCelsiusResponse target = null;
            target = (org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument.FarenheitToCelsiusResponse)get_store().find_element_user(FARENHEITTOCELSIUSRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument.FarenheitToCelsiusResponse)get_store().add_element_user(FARENHEITTOCELSIUSRESPONSE$0);
            }
            target.set(farenheitToCelsiusResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "farenheitToCelsiusResponse" element
     */
    public org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument.FarenheitToCelsiusResponse addNewFarenheitToCelsiusResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument.FarenheitToCelsiusResponse target = null;
            target = (org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument.FarenheitToCelsiusResponse)get_store().add_element_user(FARENHEITTOCELSIUSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML farenheitToCelsiusResponse(@http://service.ws.axis2.neos.org).
     *
     * This is a complex type.
     */
    public static class FarenheitToCelsiusResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument.FarenheitToCelsiusResponse
    {
        
        public FarenheitToCelsiusResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("http://service.ws.axis2.neos.org", "return");
        
        
        /**
         * Gets the "return" element
         */
        public float getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    return 0.0f;
                }
                return target.getFloatValue();
            }
        }
        
        /**
         * Gets (as xml) the "return" element
         */
        public org.apache.xmlbeans.XmlFloat xgetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(RETURN$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(float xreturn)
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
                target.setFloatValue(xreturn);
            }
        }
        
        /**
         * Sets (as xml) the "return" element
         */
        public void xsetReturn(org.apache.xmlbeans.XmlFloat xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(RETURN$0);
                }
                target.set(xreturn);
            }
        }
    }
}
