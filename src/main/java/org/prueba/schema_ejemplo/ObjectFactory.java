//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.04.11 a las 12:50:40 PM CEST 
//


package org.prueba.schema_ejemplo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.prueba.schema_ejemplo package. 
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

    private final static QName _Capitulo_QNAME = new QName("http://www.example.org/Schema-ejemplo", "Capitulo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.prueba.schema_ejemplo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Capitulo }
     * 
     */
    public Capitulo createCapitulo() {
        return new Capitulo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Capitulo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Schema-ejemplo", name = "Capitulo")
    public JAXBElement<Capitulo> createCapitulo(Capitulo value) {
        return new JAXBElement<Capitulo>(_Capitulo_QNAME, Capitulo.class, null, value);
    }

}
