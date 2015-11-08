/*
 * An XML document type.
 * Localname: celsiusToFarenheit
 * Namespace: http://service.ws.axis2.neos.org
 * Java type: org.neos.axis2.ws.service.CelsiusToFarenheitDocument
 *
 * Automatically generated - do not modify.
 */
package org.neos.axis2.ws.service.impl;
/**
 * A document containing one celsiusToFarenheit(@http://service.ws.axis2.neos.org) element.
 *
 * This is a complex type.
 */
public class CelsiusToFarenheitDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.neos.axis2.ws.service.CelsiusToFarenheitDocument
{
    
    public CelsiusToFarenheitDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CELSIUSTOFARENHEIT$0 = 
        new javax.xml.namespace.QName("http://service.ws.axis2.neos.org", "celsiusToFarenheit");
    
    
    /**
     * Gets the "celsiusToFarenheit" element
     */
    public org.neos.axis2.ws.service.CelsiusToFarenheitDocument.CelsiusToFarenheit getCelsiusToFarenheit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.neos.axis2.ws.service.CelsiusToFarenheitDocument.CelsiusToFarenheit target = null;
            target = (org.neos.axis2.ws.service.CelsiusToFarenheitDocument.CelsiusToFarenheit)get_store().find_element_user(CELSIUSTOFARENHEIT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "celsiusToFarenheit" element
     */
    public void setCelsiusToFarenheit(org.neos.axis2.ws.service.CelsiusToFarenheitDocument.CelsiusToFarenheit celsiusToFarenheit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.neos.axis2.ws.service.CelsiusToFarenheitDocument.CelsiusToFarenheit target = null;
            target = (org.neos.axis2.ws.service.CelsiusToFarenheitDocument.CelsiusToFarenheit)get_store().find_element_user(CELSIUSTOFARENHEIT$0, 0);
            if (target == null)
            {
                target = (org.neos.axis2.ws.service.CelsiusToFarenheitDocument.CelsiusToFarenheit)get_store().add_element_user(CELSIUSTOFARENHEIT$0);
            }
            target.set(celsiusToFarenheit);
        }
    }
    
    /**
     * Appends and returns a new empty "celsiusToFarenheit" element
     */
    public org.neos.axis2.ws.service.CelsiusToFarenheitDocument.CelsiusToFarenheit addNewCelsiusToFarenheit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.neos.axis2.ws.service.CelsiusToFarenheitDocument.CelsiusToFarenheit target = null;
            target = (org.neos.axis2.ws.service.CelsiusToFarenheitDocument.CelsiusToFarenheit)get_store().add_element_user(CELSIUSTOFARENHEIT$0);
            return target;
        }
    }
    /**
     * An XML celsiusToFarenheit(@http://service.ws.axis2.neos.org).
     *
     * This is a complex type.
     */
    public static class CelsiusToFarenheitImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.neos.axis2.ws.service.CelsiusToFarenheitDocument.CelsiusToFarenheit
    {
        
        public CelsiusToFarenheitImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CELSIUS$0 = 
            new javax.xml.namespace.QName("http://service.ws.axis2.neos.org", "celsius");
        
        
        /**
         * Gets the "celsius" element
         */
        public float getCelsius()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CELSIUS$0, 0);
                if (target == null)
                {
                    return 0.0f;
                }
                return target.getFloatValue();
            }
        }
        
        /**
         * Gets (as xml) the "celsius" element
         */
        public org.apache.xmlbeans.XmlFloat xgetCelsius()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(CELSIUS$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "celsius" element
         */
        public void setCelsius(float celsius)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CELSIUS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CELSIUS$0);
                }
                target.setFloatValue(celsius);
            }
        }
        
        /**
         * Sets (as xml) the "celsius" element
         */
        public void xsetCelsius(org.apache.xmlbeans.XmlFloat celsius)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(CELSIUS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(CELSIUS$0);
                }
                target.set(celsius);
            }
        }
    }
}
