//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.04.01 a las 09:09:26 PM CST 
//


package org.example.calculadora;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="edad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ingresoMensual" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Cancer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="respuesta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nombre",
    "edad",
    "ingresoMensual",
    "cancer",
    "respuesta"
})
@XmlRootElement(name = "DatosResponse")
public class DatosResponse {

    @XmlElement(required = true)
    protected String nombre;
    @XmlElement(required = true)
    protected String edad;
    @XmlElement(required = true)
    protected String ingresoMensual;
    @XmlElement(name = "Cancer", required = true)
    protected String cancer;
    @XmlElement(required = true)
    protected String respuesta;

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad edad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdad() {
        return edad;
    }

    /**
     * Define el valor de la propiedad edad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdad(String value) {
        this.edad = value;
    }

    /**
     * Obtiene el valor de la propiedad ingresoMensual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIngresoMensual() {
        return ingresoMensual;
    }

    /**
     * Define el valor de la propiedad ingresoMensual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIngresoMensual(String value) {
        this.ingresoMensual = value;
    }

    /**
     * Obtiene el valor de la propiedad cancer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancer() {
        return cancer;
    }

    /**
     * Define el valor de la propiedad cancer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancer(String value) {
        this.cancer = value;
    }

    /**
     * Obtiene el valor de la propiedad respuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * Define el valor de la propiedad respuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespuesta(String value) {
        this.respuesta = value;
    }

}
