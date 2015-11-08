/*
 * An XML document type.
 * Localname: celsiusToFarenheitResponse
 * Namespace: http://service.ws.axis2.neos.org
 * Java type: org.neos.axis2.ws.service.CelsiusToFarenheitResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.neos.axis2.ws.service.impl;
/**
 * A document containing one celsiusToFarenheitResponse(@http://service.ws.axis2.neos.org) element.
 *
 * This is a complex type.
 */
public class CelsiusToFarenheitResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.neos.axis2.ws.service.CelsiusToFarenheitResponseDocument
{
    
    public CelsiusToFarenheitResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CELSIUSTOFARENHEITRESPONSE$0 = 
        new javax.xml.namespace.QName("http://service.ws.axis2.neos.org", "celsiusToFarenheitResponse");
    
    
    /**
     * Gets the "celsiusToFarenheitResponse" element
     */
    public org.neos.axis2.ws.service.CelsiusToFarenheitResponseDocument.CelsiusToFarenheitResponse getCelsiusToFarenheitResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.neos.axis2.ws.service.CelsiusToFarenheitResponseDocument.CelsiusToFarenheitResponse target = null;
            target = (org.neos.axis2.ws.service.CelsiusToFarenheitResponseDocument.CelsiusToFarenheitResponse)get_store().find_element_user(CELSIUSTOFARENHEITRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "celsiusToFarenheitResponse" element
     */
    public void setCelsiusToFarenheitResponse(org.neos.axis2.ws.service.CelsiusToFarenheitResponseDocument.CelsiusToFarenheitResponse celsiusToFarenheitResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.neos.axis2.ws.service.CelsiusToFarenheitResponseDocument.CelsiusToFarenheitResponse target = null;
            target = (org.neos.axis2.ws.service.CelsiusToFarenheitResponseDocument.CelsiusToFarenheitResponse)get_store().find_element_user(CELSIUSTOFARENHEITRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.neos.axis2.ws.service.CelsiusToFarenheitResponseDocument.CelsiusToFarenheitResponse)get_store().add_element_user(CELSIUSTOFARENHEITRESPONSE$0);
            }
            target.set(celsiusToFarenheitResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "celsiusToFarenheitResponse" element
     */
    public org.neos.axis2.ws.service.CelsiusToFarenheitResponseDocument.CelsiusToFarenheitResponse addNewCelsiusToFarenheitResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.neos.axis2.ws.service.CelsiusToFarenheitResponseDocument.CelsiusToFarenheitResponse target = null;
            target = (org.neos.axis2.ws.service.CelsiusToFarenheitResponseDocument.CelsiusToFarenheitResponse)get_store().add_element_user(CELSIUSTOFARENHEITRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML celsiusToFarenheitResponse(@http://service.ws.axis2.neos.org).
     *
     * This is a complex type.
     */
    public static class CelsiusToFarenheitResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.neos.axis2.ws.service.CelsiusToFarenheitResponseDocument.CelsiusToFarenheitResponse
    {
        
        public CelsiusToFarenheitResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
