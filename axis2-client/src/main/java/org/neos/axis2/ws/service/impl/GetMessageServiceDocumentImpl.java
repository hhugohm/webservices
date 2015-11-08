/*
 * An XML document type.
 * Localname: getMessageService
 * Namespace: http://service.ws.axis2.neos.org
 * Java type: org.neos.axis2.ws.service.GetMessageServiceDocument
 *
 * Automatically generated - do not modify.
 */
package org.neos.axis2.ws.service.impl;
/**
 * A document containing one getMessageService(@http://service.ws.axis2.neos.org) element.
 *
 * This is a complex type.
 */
public class GetMessageServiceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.neos.axis2.ws.service.GetMessageServiceDocument
{
    
    public GetMessageServiceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMESSAGESERVICE$0 = 
        new javax.xml.namespace.QName("http://service.ws.axis2.neos.org", "getMessageService");
    
    
    /**
     * Gets the "getMessageService" element
     */
    public org.neos.axis2.ws.service.GetMessageServiceDocument.GetMessageService getGetMessageService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.neos.axis2.ws.service.GetMessageServiceDocument.GetMessageService target = null;
            target = (org.neos.axis2.ws.service.GetMessageServiceDocument.GetMessageService)get_store().find_element_user(GETMESSAGESERVICE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getMessageService" element
     */
    public void setGetMessageService(org.neos.axis2.ws.service.GetMessageServiceDocument.GetMessageService getMessageService)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.neos.axis2.ws.service.GetMessageServiceDocument.GetMessageService target = null;
            target = (org.neos.axis2.ws.service.GetMessageServiceDocument.GetMessageService)get_store().find_element_user(GETMESSAGESERVICE$0, 0);
            if (target == null)
            {
                target = (org.neos.axis2.ws.service.GetMessageServiceDocument.GetMessageService)get_store().add_element_user(GETMESSAGESERVICE$0);
            }
            target.set(getMessageService);
        }
    }
    
    /**
     * Appends and returns a new empty "getMessageService" element
     */
    public org.neos.axis2.ws.service.GetMessageServiceDocument.GetMessageService addNewGetMessageService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.neos.axis2.ws.service.GetMessageServiceDocument.GetMessageService target = null;
            target = (org.neos.axis2.ws.service.GetMessageServiceDocument.GetMessageService)get_store().add_element_user(GETMESSAGESERVICE$0);
            return target;
        }
    }
    /**
     * An XML getMessageService(@http://service.ws.axis2.neos.org).
     *
     * This is a complex type.
     */
    public static class GetMessageServiceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.neos.axis2.ws.service.GetMessageServiceDocument.GetMessageService
    {
        
        public GetMessageServiceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://service.ws.axis2.neos.org", "name");
        
        
        /**
         * Gets the "name" element
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" element
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "name" element
         */
        public boolean isNilName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "name" element
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NAME$0) != 0;
            }
        }
        
        /**
         * Sets the "name" element
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" element
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Nils the "name" element
         */
        public void setNilName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "name" element
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NAME$0, 0);
            }
        }
    }
}
