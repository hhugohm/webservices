/*
 * An XML document type.
 * Localname: farenheitToCelsius
 * Namespace: http://service.ws.axis2.neos.org
 * Java type: org.neos.axis2.ws.service.FarenheitToCelsiusDocument
 *
 * Automatically generated - do not modify.
 */
package org.neos.axis2.ws.service.impl;
/**
 * A document containing one farenheitToCelsius(@http://service.ws.axis2.neos.org) element.
 *
 * This is a complex type.
 */
public class FarenheitToCelsiusDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.neos.axis2.ws.service.FarenheitToCelsiusDocument
{
    
    public FarenheitToCelsiusDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FARENHEITTOCELSIUS$0 = 
        new javax.xml.namespace.QName("http://service.ws.axis2.neos.org", "farenheitToCelsius");
    
    
    /**
     * Gets the "farenheitToCelsius" element
     */
    public org.neos.axis2.ws.service.FarenheitToCelsiusDocument.FarenheitToCelsius getFarenheitToCelsius()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.neos.axis2.ws.service.FarenheitToCelsiusDocument.FarenheitToCelsius target = null;
            target = (org.neos.axis2.ws.service.FarenheitToCelsiusDocument.FarenheitToCelsius)get_store().find_element_user(FARENHEITTOCELSIUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "farenheitToCelsius" element
     */
    public void setFarenheitToCelsius(org.neos.axis2.ws.service.FarenheitToCelsiusDocument.FarenheitToCelsius farenheitToCelsius)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.neos.axis2.ws.service.FarenheitToCelsiusDocument.FarenheitToCelsius target = null;
            target = (org.neos.axis2.ws.service.FarenheitToCelsiusDocument.FarenheitToCelsius)get_store().find_element_user(FARENHEITTOCELSIUS$0, 0);
            if (target == null)
            {
                target = (org.neos.axis2.ws.service.FarenheitToCelsiusDocument.FarenheitToCelsius)get_store().add_element_user(FARENHEITTOCELSIUS$0);
            }
            target.set(farenheitToCelsius);
        }
    }
    
    /**
     * Appends and returns a new empty "farenheitToCelsius" element
     */
    public org.neos.axis2.ws.service.FarenheitToCelsiusDocument.FarenheitToCelsius addNewFarenheitToCelsius()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.neos.axis2.ws.service.FarenheitToCelsiusDocument.FarenheitToCelsius target = null;
            target = (org.neos.axis2.ws.service.FarenheitToCelsiusDocument.FarenheitToCelsius)get_store().add_element_user(FARENHEITTOCELSIUS$0);
            return target;
        }
    }
    /**
     * An XML farenheitToCelsius(@http://service.ws.axis2.neos.org).
     *
     * This is a complex type.
     */
    public static class FarenheitToCelsiusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.neos.axis2.ws.service.FarenheitToCelsiusDocument.FarenheitToCelsius
    {
        
        public FarenheitToCelsiusImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FARENHEIT$0 = 
            new javax.xml.namespace.QName("http://service.ws.axis2.neos.org", "farenheit");
        
        
        /**
         * Gets the "farenheit" element
         */
        public float getFarenheit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FARENHEIT$0, 0);
                if (target == null)
                {
                    return 0.0f;
                }
                return target.getFloatValue();
            }
        }
        
        /**
         * Gets (as xml) the "farenheit" element
         */
        public org.apache.xmlbeans.XmlFloat xgetFarenheit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(FARENHEIT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "farenheit" element
         */
        public void setFarenheit(float farenheit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FARENHEIT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FARENHEIT$0);
                }
                target.setFloatValue(farenheit);
            }
        }
        
        /**
         * Sets (as xml) the "farenheit" element
         */
        public void xsetFarenheit(org.apache.xmlbeans.XmlFloat farenheit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(FARENHEIT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(FARENHEIT$0);
                }
                target.set(farenheit);
            }
        }
    }
}
