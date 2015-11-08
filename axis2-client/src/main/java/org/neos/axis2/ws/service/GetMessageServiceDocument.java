/*
 * An XML document type.
 * Localname: getMessageService
 * Namespace: http://service.ws.axis2.neos.org
 * Java type: org.neos.axis2.ws.service.GetMessageServiceDocument
 *
 * Automatically generated - do not modify.
 */
package org.neos.axis2.ws.service;


/**
 * A document containing one getMessageService(@http://service.ws.axis2.neos.org) element.
 *
 * This is a complex type.
 */
public interface GetMessageServiceDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetMessageServiceDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5450B04D8E6073607A93BD67FD7EC213").resolveHandle("getmessageserviceb8cadoctype");
    
    /**
     * Gets the "getMessageService" element
     */
    org.neos.axis2.ws.service.GetMessageServiceDocument.GetMessageService getGetMessageService();
    
    /**
     * Sets the "getMessageService" element
     */
    void setGetMessageService(org.neos.axis2.ws.service.GetMessageServiceDocument.GetMessageService getMessageService);
    
    /**
     * Appends and returns a new empty "getMessageService" element
     */
    org.neos.axis2.ws.service.GetMessageServiceDocument.GetMessageService addNewGetMessageService();
    
    /**
     * An XML getMessageService(@http://service.ws.axis2.neos.org).
     *
     * This is a complex type.
     */
    public interface GetMessageService extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetMessageService.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5450B04D8E6073607A93BD67FD7EC213").resolveHandle("getmessageservice02baelemtype");
        
        /**
         * Gets the "name" element
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" element
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * Tests for nil "name" element
         */
        boolean isNilName();
        
        /**
         * True if has "name" element
         */
        boolean isSetName();
        
        /**
         * Sets the "name" element
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" element
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Nils the "name" element
         */
        void setNilName();
        
        /**
         * Unsets the "name" element
         */
        void unsetName();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.neos.axis2.ws.service.GetMessageServiceDocument.GetMessageService newInstance() {
              return (org.neos.axis2.ws.service.GetMessageServiceDocument.GetMessageService) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.neos.axis2.ws.service.GetMessageServiceDocument.GetMessageService newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.neos.axis2.ws.service.GetMessageServiceDocument.GetMessageService) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.neos.axis2.ws.service.GetMessageServiceDocument newInstance() {
          return (org.neos.axis2.ws.service.GetMessageServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.neos.axis2.ws.service.GetMessageServiceDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.neos.axis2.ws.service.GetMessageServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.neos.axis2.ws.service.GetMessageServiceDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.neos.axis2.ws.service.GetMessageServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.neos.axis2.ws.service.GetMessageServiceDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.neos.axis2.ws.service.GetMessageServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.neos.axis2.ws.service.GetMessageServiceDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.neos.axis2.ws.service.GetMessageServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.neos.axis2.ws.service.GetMessageServiceDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.neos.axis2.ws.service.GetMessageServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.neos.axis2.ws.service.GetMessageServiceDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.neos.axis2.ws.service.GetMessageServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.neos.axis2.ws.service.GetMessageServiceDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.neos.axis2.ws.service.GetMessageServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.neos.axis2.ws.service.GetMessageServiceDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.neos.axis2.ws.service.GetMessageServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.neos.axis2.ws.service.GetMessageServiceDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.neos.axis2.ws.service.GetMessageServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.neos.axis2.ws.service.GetMessageServiceDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.neos.axis2.ws.service.GetMessageServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.neos.axis2.ws.service.GetMessageServiceDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.neos.axis2.ws.service.GetMessageServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.neos.axis2.ws.service.GetMessageServiceDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.neos.axis2.ws.service.GetMessageServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.neos.axis2.ws.service.GetMessageServiceDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.neos.axis2.ws.service.GetMessageServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.neos.axis2.ws.service.GetMessageServiceDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.neos.axis2.ws.service.GetMessageServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.neos.axis2.ws.service.GetMessageServiceDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.neos.axis2.ws.service.GetMessageServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.neos.axis2.ws.service.GetMessageServiceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.neos.axis2.ws.service.GetMessageServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.neos.axis2.ws.service.GetMessageServiceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.neos.axis2.ws.service.GetMessageServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
