
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v6  Built on : Sep 07, 2012 (05:58:23 PDT)
 */

        
            package org.blogs.ejemplos.serviciosaxis2;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://serviciosaxis2.ejemplos.blogs.org".equals(namespaceURI) &&
                  "Persona".equals(typeName)){
                   
                            return  org.blogs.ejemplos.serviciosaxis2.Persona.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://serviciosaxis2.ejemplos.blogs.org".equals(namespaceURI) &&
                  "PersonaRespuesta".equals(typeName)){
                   
                            return  org.blogs.ejemplos.serviciosaxis2.PersonaRespuesta.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    