
package org.datacontract.schemas._2004._07.fdiwebservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetEnabledDataSet_Output complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetEnabledDataSet_Output">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodEsito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescEsito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SetDatiAbilitati" type="{http://schemas.datacontract.org/2004/07/FDIWebServices}ArrayOfSetDati" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetEnabledDataSet_Output", propOrder = {
    "codEsito",
    "descEsito",
    "setDatiAbilitati"
})
public class GetEnabledDataSetOutput {

    @XmlElementRef(name = "CodEsito", namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codEsito;
    @XmlElementRef(name = "DescEsito", namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descEsito;
    @XmlElementRef(name = "SetDatiAbilitati", namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSetDati> setDatiAbilitati;

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
     * Gets the value of the setDatiAbilitati property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSetDati }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSetDati> getSetDatiAbilitati() {
        return setDatiAbilitati;
    }

    /**
     * Sets the value of the setDatiAbilitati property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSetDati }{@code >}
     *     
     */
    public void setSetDatiAbilitati(JAXBElement<ArrayOfSetDati> value) {
        this.setDatiAbilitati = value;
    }

}
