//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.04.11 a las 05:53:20 PM CEST 
//


package org.prueba.servicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.prueba.servicios package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ObtenerTodosAlumnosResponse_QNAME = new QName("http://servicios.prueba.org/", "obtenerTodosAlumnosResponse");
    private final static QName _ObtenerTodosAlumnos_QNAME = new QName("http://servicios.prueba.org/", "obtenerTodosAlumnos");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.prueba.servicios
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerTodosAlumnos }
     * 
     */
    public ObtenerTodosAlumnos createObtenerTodosAlumnos() {
        return new ObtenerTodosAlumnos();
    }

    /**
     * Create an instance of {@link ObtenerTodosAlumnosResponse }
     * 
     */
    public ObtenerTodosAlumnosResponse createObtenerTodosAlumnosResponse() {
        return new ObtenerTodosAlumnosResponse();
    }

    /**
     * Create an instance of {@link AlumnoDTO }
     * 
     */
    public AlumnoDTO createAlumnoDTO() {
        return new AlumnoDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTodosAlumnosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.prueba.org/", name = "obtenerTodosAlumnosResponse")
    public JAXBElement<ObtenerTodosAlumnosResponse> createObtenerTodosAlumnosResponse(ObtenerTodosAlumnosResponse value) {
        return new JAXBElement<ObtenerTodosAlumnosResponse>(_ObtenerTodosAlumnosResponse_QNAME, ObtenerTodosAlumnosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTodosAlumnos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios.prueba.org/", name = "obtenerTodosAlumnos")
    public JAXBElement<ObtenerTodosAlumnos> createObtenerTodosAlumnos(ObtenerTodosAlumnos value) {
        return new JAXBElement<ObtenerTodosAlumnos>(_ObtenerTodosAlumnos_QNAME, ObtenerTodosAlumnos.class, null, value);
    }

}
