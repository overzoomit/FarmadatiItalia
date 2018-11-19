
package org.datacontract.schemas._2004._07.fdiwebservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSetDati complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSetDati">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SetDati" type="{http://schemas.datacontract.org/2004/07/FDIWebServices}SetDati" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSetDati", propOrder = {
    "setDati"
})
public class ArrayOfSetDati {

    @XmlElement(name = "SetDati", nillable = true)
    protected List<SetDati> setDati;

    /**
     * Gets the value of the setDati property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the setDati property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSetDati().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SetDati }
     * 
     * 
     */
    public List<SetDati> getSetDati() {
        if (setDati == null) {
            setDati = new ArrayList<SetDati>();
        }
        return this.setDati;
    }

}
