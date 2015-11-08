/*
 * An XML document type.
 * Localname: factorialResponse
 * Namespace: http://service.ws.axis2.neos.org
 * Java type: org.neos.axis2.ws.service.FactorialResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.neos.axis2.ws.service.impl;
/**
 * A document containing one factorialResponse(@http://service.ws.axis2.neos.org) element.
 *
 * This is a complex type.
 */
public class FactorialResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.neos.axis2.ws.service.FactorialResponseDocument
{
    
    public FactorialResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FACTORIALRESPONSE$0 = 
        new javax.xml.namespace.QName("http://service.ws.axis2.neos.org", "factorialResponse");
    
    
    /**
     * Gets the "factorialResponse" element
     */
    public org.neos.axis2.ws.service.FactorialResponseDocument.FactorialResponse getFactorialResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.neos.axis2.ws.service.FactorialResponseDocument.FactorialResponse target = null;
            target = (org.neos.axis2.ws.service.FactorialResponseDocument.FactorialResponse)get_store().find_element_user(FACTORIALRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "factorialResponse" element
     */
    public void setFactorialResponse(org.neos.axis2.ws.service.FactorialResponseDocument.FactorialResponse factorialResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.neos.axis2.ws.service.FactorialResponseDocument.FactorialResponse target = null;
            target = (org.neos.axis2.ws.service.FactorialResponseDocument.FactorialResponse)get_store().find_element_user(FACTORIALRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.neos.axis2.ws.service.FactorialResponseDocument.FactorialResponse)get_store().add_element_user(FACTORIALRESPONSE$0);
            }
            target.set(factorialResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "factorialResponse" element
     */
    public org.neos.axis2.ws.service.FactorialResponseDocument.FactorialResponse addNewFactorialResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.neos.axis2.ws.service.FactorialResponseDocument.FactorialResponse target = null;
            target = (org.neos.axis2.ws.service.FactorialResponseDocument.FactorialResponse)get_store().add_element_user(FACTORIALRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML factorialResponse(@http://service.ws.axis2.neos.org).
     *
     * This is a complex type.
     */
    public static class FactorialResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.neos.axis2.ws.service.FactorialResponseDocument.FactorialResponse
    {
        
        public FactorialResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("http://service.ws.axis2.neos.org", "return");
        
        
        /**
         * Gets the "return" element
         */
        public double getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "return" element
         */
        public org.apache.xmlbeans.XmlDouble xgetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(RETURN$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(double xreturn)
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
                target.setDoubleValue(xreturn);
            }
        }
        
        /**
         * Sets (as xml) the "return" element
         */
        public void xsetReturn(org.apache.xmlbeans.XmlDouble xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(RETURN$0);
                }
                target.set(xreturn);
            }
        }
    }
}
