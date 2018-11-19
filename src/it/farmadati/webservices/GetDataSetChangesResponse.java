
package it.farmadati.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.fdiwebservices.GetDataSetChangesOutput;


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
 *         &lt;element name="GetDataSetChangesResult" type="{http://schemas.datacontract.org/2004/07/FDIWebServices}GetDataSetChanges_Output" minOccurs="0"/>
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
    "getDataSetChangesResult"
})
@XmlRootElement(name = "GetDataSetChangesResponse")
public class GetDataSetChangesResponse {

    @XmlElementRef(name = "GetDataSetChangesResult", namespace = "http://webservices.farmadati.it", type = JAXBElement.class, required = false)
    protected JAXBElement<GetDataSetChangesOutput> getDataSetChangesResult;

    /**
     * Gets the value of the getDataSetChangesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetDataSetChangesOutput }{@code >}
     *     
     */
    public JAXBElement<GetDataSetChangesOutput> getGetDataSetChangesResult() {
        return getDataSetChangesResult;
    }

    /**
     * Sets the value of the getDataSetChangesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetDataSetChangesOutput }{@code >}
     *     
     */
    public void setGetDataSetChangesResult(JAXBElement<GetDataSetChangesOutput> value) {
        this.getDataSetChangesResult = value;
    }

}
