
package org.datacontract.schemas._2004._07.fdiwebservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDataSetChanges_Output complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDataSetChanges_Output">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ByteListFile" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="CodEsito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescEsito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumRecords" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OutputValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDataSetChanges_Output", propOrder = {
    "byteListFile",
    "codEsito",
    "descEsito",
    "numRecords",
    "outputValue"
})
public class GetDataSetChangesOutput {

    @XmlElementRef(name = "ByteListFile", namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> byteListFile;
    @XmlElementRef(name = "CodEsito", namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codEsito;
    @XmlElementRef(name = "DescEsito", namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descEsito;
    @XmlElement(name = "NumRecords")
    protected Integer numRecords;
    @XmlElementRef(name = "OutputValue", namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> outputValue;

    /**
     * Gets the value of the byteListFile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getByteListFile() {
        return byteListFile;
    }

    /**
     * Sets the value of the byteListFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setByteListFile(JAXBElement<byte[]> value) {
        this.byteListFile = value;
    }

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
     * Gets the value of the numRecords property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumRecords() {
        return numRecords;
    }

    /**
     * Sets the value of the numRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumRecords(Integer value) {
        this.numRecords = value;
    }

    /**
     * Gets the value of the outputValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutputValue() {
        return outputValue;
    }

    /**
     * Sets the value of the outputValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutputValue(JAXBElement<String> value) {
        this.outputValue = value;
    }

}
