/*
 * An XML document type.
 * Localname: factorial
 * Namespace: http://service.ws.axis2.neos.org
 * Java type: org.neos.axis2.ws.service.FactorialDocument
 *
 * Automatically generated - do not modify.
 */
package org.neos.axis2.ws.service.impl;
/**
 * A document containing one factorial(@http://service.ws.axis2.neos.org) element.
 *
 * This is a complex type.
 */
public class FactorialDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.neos.axis2.ws.service.FactorialDocument
{
    
    public FactorialDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FACTORIAL$0 = 
        new javax.xml.namespace.QName("http://service.ws.axis2.neos.org", "factorial");
    
    
    /**
     * Gets the "factorial" element
     */
    public org.neos.axis2.ws.service.FactorialDocument.Factorial getFactorial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.neos.axis2.ws.service.FactorialDocument.Factorial target = null;
            target = (org.neos.axis2.ws.service.FactorialDocument.Factorial)get_store().find_element_user(FACTORIAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "factorial" element
     */
    public void setFactorial(org.neos.axis2.ws.service.FactorialDocument.Factorial factorial)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.neos.axis2.ws.service.FactorialDocument.Factorial target = null;
            target = (org.neos.axis2.ws.service.FactorialDocument.Factorial)get_store().find_element_user(FACTORIAL$0, 0);
            if (target == null)
            {
                target = (org.neos.axis2.ws.service.FactorialDocument.Factorial)get_store().add_element_user(FACTORIAL$0);
            }
            target.set(factorial);
        }
    }
    
    /**
     * Appends and returns a new empty "factorial" element
     */
    public org.neos.axis2.ws.service.FactorialDocument.Factorial addNewFactorial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.neos.axis2.ws.service.FactorialDocument.Factorial target = null;
            target = (org.neos.axis2.ws.service.FactorialDocument.Factorial)get_store().add_element_user(FACTORIAL$0);
            return target;
        }
    }
    /**
     * An XML factorial(@http://service.ws.axis2.neos.org).
     *
     * This is a complex type.
     */
    public static class FactorialImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.neos.axis2.ws.service.FactorialDocument.Factorial
    {
        
        public FactorialImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NUMBER$0 = 
            new javax.xml.namespace.QName("http://service.ws.axis2.neos.org", "number");
        
        
        /**
         * Gets the "number" element
         */
        public int getNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "number" element
         */
        public org.apache.xmlbeans.XmlInt xgetNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBER$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "number" element
         */
        public void setNumber(int number)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBER$0);
                }
                target.setIntValue(number);
            }
        }
        
        /**
         * Sets (as xml) the "number" element
         */
        public void xsetNumber(org.apache.xmlbeans.XmlInt number)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMBER$0);
                }
                target.set(number);
            }
        }
    }
}
