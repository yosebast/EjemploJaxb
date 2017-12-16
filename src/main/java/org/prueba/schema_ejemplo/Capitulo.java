//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.04.11 a las 12:50:40 PM CEST 
//


package org.prueba.schema_ejemplo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Capitulo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Capitulo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isbn_libro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numero_paginas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idx" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Capitulo", propOrder = {
    "isbnLibro",
    "titulo",
    "numeroPaginas",
    "idx"
})
public class Capitulo {

    @XmlElement(name = "isbn_libro", required = true)
    protected String isbnLibro;
    @XmlElement(required = true)
    protected String titulo;
    @XmlElement(name = "numero_paginas")
    protected int numeroPaginas;
    @XmlElement(required = true)
    protected String idx;

    /**
     * Obtiene el valor de la propiedad isbnLibro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsbnLibro() {
        return isbnLibro;
    }

    /**
     * Define el valor de la propiedad isbnLibro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsbnLibro(String value) {
        this.isbnLibro = value;
    }

    /**
     * Obtiene el valor de la propiedad titulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define el valor de la propiedad titulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulo(String value) {
        this.titulo = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroPaginas.
     * 
     */
    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    /**
     * Define el valor de la propiedad numeroPaginas.
     * 
     */
    public void setNumeroPaginas(int value) {
        this.numeroPaginas = value;
    }

    /**
     * Obtiene el valor de la propiedad idx.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdx() {
        return idx;
    }

    /**
     * Define el valor de la propiedad idx.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdx(String value) {
        this.idx = value;
    }

}
