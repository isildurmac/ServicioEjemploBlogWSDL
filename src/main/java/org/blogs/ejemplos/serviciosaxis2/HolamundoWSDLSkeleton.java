/**
 * HolamundoWSDLSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v6  Built on : Sep 07, 2012 (05:58:14 PDT)
 */
package org.blogs.ejemplos.serviciosaxis2;

/**
 * HolamundoWSDLSkeleton java skeleton for the axisService
 */
public class HolamundoWSDLSkeleton {

	/**
	 * Auto generated method signature
	 * 
	 * @param holaati
	 * @return holaatiResponse
	 */

	public org.blogs.ejemplos.serviciosaxis2.HolaatiResponse holaati(
			org.blogs.ejemplos.serviciosaxis2.Holaati holaati) {

		String respuesta = "Saludos: " + holaati.getPersona().getNombre()
				+ "  " + holaati.getPersona().getApellidos()
				+ " y gracias por pasarte por el blog";

		PersonaRespuesta param = new PersonaRespuesta();

		param.setSaludo(respuesta);

		HolaatiResponse response = new HolaatiResponse();

		response.set_return(param);

		return response;
	}

}
