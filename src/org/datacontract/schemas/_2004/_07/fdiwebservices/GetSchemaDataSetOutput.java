
package org.datacontract.schemas._2004._07.fdiwebservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSchemaDataSet_Output complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSchemaDataSet_Output">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodEsito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescEsito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fields" type="{http://schemas.datacontract.org/2004/07/FDIWebServices}ArrayOfField" minOccurs="0"/>
 *         &lt;element name="SchemaCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSchemaDataSet_Output", propOrder = {
    "codEsito",
    "descEsito",
    "fields",
    "schemaCode"
})
public class GetSchemaDataSetOutput {

    @XmlElementRef(name = "CodEsito", namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codEsito;
    @XmlElementRef(name = "DescEsito", namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descEsito;
    @XmlElementRef(name = "Fields", namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfField> fields;
    @XmlElement(name = "SchemaCode")
    protected Integer schemaCode;

    /**
     * Gets the value of the codEsito property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodEsito() {
        return codEsito;
    }

    /**
     * Sets the value of the codEsito property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodEsito(JAXBElement<String> value) {
        this.codEsito = value;
    }

    /**
     * Gets the value of the descEsito property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescEsito() {
        return descEsito;
    }

    /**
     * Sets the value of the descEsito property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescEsito(JAXBElement<String> value) {
        this.descEsito = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfField }{@code >}
     *     
     */
    public JAXBElement<ArrayOfField> getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfField }{@code >}
     *     
     */
    public void setFields(JAXBElement<ArrayOfField> value) {
        this.fields = value;
    }

    /**
     * Gets the value of the schemaCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSchemaCode() {
        return schemaCode;
    }

    /**
     * Sets the value of the schemaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSchemaCode(Integer value) {
        this.schemaCode = value;
    }

}
