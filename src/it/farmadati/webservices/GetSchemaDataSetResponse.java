
package it.farmadati.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.fdiwebservices.GetSchemaDataSetOutput;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetSchemaDataSetResult" type="{http://schemas.datacontract.org/2004/07/FDIWebServices}GetSchemaDataSet_Output" minOccurs="0"/>
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
    "getSchemaDataSetResult"
})
@XmlRootElement(name = "GetSchemaDataSetResponse")
public class GetSchemaDataSetResponse {

    @XmlElementRef(name = "GetSchemaDataSetResult", namespace = "http://webservices.farmadati.it", type = JAXBElement.class, required = false)
    protected JAXBElement<GetSchemaDataSetOutput> getSchemaDataSetResult;

    /**
     * Gets the value of the getSchemaDataSetResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetSchemaDataSetOutput }{@code >}
     *     
     */
    public JAXBElement<GetSchemaDataSetOutput> getGetSchemaDataSetResult() {
        return getSchemaDataSetResult;
    }

    /**
     * Sets the value of the getSchemaDataSetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetSchemaDataSetOutput }{@code >}
     *     
     */
    public void setGetSchemaDataSetResult(JAXBElement<GetSchemaDataSetOutput> value) {
        this.getSchemaDataSetResult = value;
    }

}
