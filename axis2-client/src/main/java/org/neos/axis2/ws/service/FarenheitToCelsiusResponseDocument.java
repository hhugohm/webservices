/*
 * An XML document type.
 * Localname: farenheitToCelsiusResponse
 * Namespace: http://service.ws.axis2.neos.org
 * Java type: org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.neos.axis2.ws.service;


/**
 * A document containing one farenheitToCelsiusResponse(@http://service.ws.axis2.neos.org) element.
 *
 * This is a complex type.
 */
public interface FarenheitToCelsiusResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FarenheitToCelsiusResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5450B04D8E6073607A93BD67FD7EC213").resolveHandle("farenheittocelsiusresponse3400doctype");
    
    /**
     * Gets the "farenheitToCelsiusResponse" element
     */
    org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument.FarenheitToCelsiusResponse getFarenheitToCelsiusResponse();
    
    /**
     * Sets the "farenheitToCelsiusResponse" element
     */
    void setFarenheitToCelsiusResponse(org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument.FarenheitToCelsiusResponse farenheitToCelsiusResponse);
    
    /**
     * Appends and returns a new empty "farenheitToCelsiusResponse" element
     */
    org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument.FarenheitToCelsiusResponse addNewFarenheitToCelsiusResponse();
    
    /**
     * An XML farenheitToCelsiusResponse(@http://service.ws.axis2.neos.org).
     *
     * This is a complex type.
     */
    public interface FarenheitToCelsiusResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FarenheitToCelsiusResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5450B04D8E6073607A93BD67FD7EC213").resolveHandle("farenheittocelsiusresponse35b8elemtype");
        
        /**
         * Gets the "return" element
         */
        float getReturn();
        
        /**
         * Gets (as xml) the "return" element
         */
        org.apache.xmlbeans.XmlFloat xgetReturn();
        
        /**
         * Sets the "return" element
         */
        void setReturn(float xreturn);
        
        /**
         * Sets (as xml) the "return" element
         */
        void xsetReturn(org.apache.xmlbeans.XmlFloat xreturn);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument.FarenheitToCelsiusResponse newInstance() {
              return (org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument.FarenheitToCelsiusResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument.FarenheitToCelsiusResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument.FarenheitToCelsiusResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument newInstance() {
          return (org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.neos.axis2.ws.service.FarenheitToCelsiusResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
