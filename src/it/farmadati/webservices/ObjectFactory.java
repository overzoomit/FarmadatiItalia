
package it.farmadati.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.fdiwebservices.GetDataSetChangesOutput;
import org.datacontract.schemas._2004._07.fdiwebservices.GetDataSetOutput;
import org.datacontract.schemas._2004._07.fdiwebservices.GetEnabledDataSetOutput;
import org.datacontract.schemas._2004._07.fdiwebservices.GetSchemaDataSetOutput;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.farmadati.webservices package. 
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

    private final static QName _GetSchemaDataSetCodiceSetDati_QNAME = new QName("http://webservices.farmadati.it", "CodiceSetDati");
    private final static QName _GetSchemaDataSetPassword_QNAME = new QName("http://webservices.farmadati.it", "Password");
    private final static QName _GetSchemaDataSetUsername_QNAME = new QName("http://webservices.farmadati.it", "Username");
    private final static QName _GetSchemaDataSetResponseGetSchemaDataSetResult_QNAME = new QName("http://webservices.farmadati.it", "GetSchemaDataSetResult");
    private final static QName _GetDataSetModalita_QNAME = new QName("http://webservices.farmadati.it", "Modalita");
    private final static QName _GetEnabledDataSetResponseGetEnabledDataSetResult_QNAME = new QName("http://webservices.farmadati.it", "GetEnabledDataSetResult");
    private final static QName _GetDataSetResponseGetDataSetResult_QNAME = new QName("http://webservices.farmadati.it", "GetDataSetResult");
    private final static QName _GetDataSetChangesResponseGetDataSetChangesResult_QNAME = new QName("http://webservices.farmadati.it", "GetDataSetChangesResult");
    private final static QName _GetDataSetChangesDataIstanza_QNAME = new QName("http://webservices.farmadati.it", "DataIstanza");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.farmadati.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSchemaDataSetResponse }
     * 
     */
    public GetSchemaDataSetResponse createGetSchemaDataSetResponse() {
        return new GetSchemaDataSetResponse();
    }

    /**
     * Create an instance of {@link GetDataSetChangesResponse }
     * 
     */
    public GetDataSetChangesResponse createGetDataSetChangesResponse() {
        return new GetDataSetChangesResponse();
    }

    /**
     * Create an instance of {@link GetDataSetChanges }
     * 
     */
    public GetDataSetChanges createGetDataSetChanges() {
        return new GetDataSetChanges();
    }

    /**
     * Create an instance of {@link GetEnabledDataSet }
     * 
     */
    public GetEnabledDataSet createGetEnabledDataSet() {
        return new GetEnabledDataSet();
    }

    /**
     * Create an instance of {@link GetDataSet }
     * 
     */
    public GetDataSet createGetDataSet() {
        return new GetDataSet();
    }

    /**
     * Create an instance of {@link GetDataSetResponse }
     * 
     */
    public GetDataSetResponse createGetDataSetResponse() {
        return new GetDataSetResponse();
    }

    /**
     * Create an instance of {@link GetEnabledDataSetResponse }
     * 
     */
    public GetEnabledDataSetResponse createGetEnabledDataSetResponse() {
        return new GetEnabledDataSetResponse();
    }

    /**
     * Create an instance of {@link GetSchemaDataSet }
     * 
     */
    public GetSchemaDataSet createGetSchemaDataSet() {
        return new GetSchemaDataSet();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.farmadati.it", name = "CodiceSetDati", scope = GetSchemaDataSet.class)
    public JAXBElement<String> createGetSchemaDataSetCodiceSetDati(String value) {
        return new JAXBElement<String>(_GetSchemaDataSetCodiceSetDati_QNAME, String.class, GetSchemaDataSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.farmadati.it", name = "Password", scope = GetSchemaDataSet.class)
    public JAXBElement<String> createGetSchemaDataSetPassword(String value) {
        return new JAXBElement<String>(_GetSchemaDataSetPassword_QNAME, String.class, GetSchemaDataSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.farmadati.it", name = "Username", scope = GetSchemaDataSet.class)
    public JAXBElement<String> createGetSchemaDataSetUsername(String value) {
        return new JAXBElement<String>(_GetSchemaDataSetUsername_QNAME, String.class, GetSchemaDataSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSchemaDataSetOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.farmadati.it", name = "GetSchemaDataSetResult", scope = GetSchemaDataSetResponse.class)
    public JAXBElement<GetSchemaDataSetOutput> createGetSchemaDataSetResponseGetSchemaDataSetResult(GetSchemaDataSetOutput value) {
        return new JAXBElement<GetSchemaDataSetOutput>(_GetSchemaDataSetResponseGetSchemaDataSetResult_QNAME, GetSchemaDataSetOutput.class, GetSchemaDataSetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.farmadati.it", name = "Password", scope = GetEnabledDataSet.class)
    public JAXBElement<String> createGetEnabledDataSetPassword(String value) {
        return new JAXBElement<String>(_GetSchemaDataSetPassword_QNAME, String.class, GetEnabledDataSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.farmadati.it", name = "Username", scope = GetEnabledDataSet.class)
    public JAXBElement<String> createGetEnabledDataSetUsername(String value) {
        return new JAXBElement<String>(_GetSchemaDataSetUsername_QNAME, String.class, GetEnabledDataSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.farmadati.it", name = "Modalita", scope = GetDataSet.class)
    public JAXBElement<String> createGetDataSetModalita(String value) {
        return new JAXBElement<String>(_GetDataSetModalita_QNAME, String.class, GetDataSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.farmadati.it", name = "CodiceSetDati", scope = GetDataSet.class)
    public JAXBElement<String> createGetDataSetCodiceSetDati(String value) {
        return new JAXBElement<String>(_GetSchemaDataSetCodiceSetDati_QNAME, String.class, GetDataSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.farmadati.it", name = "Password", scope = GetDataSet.class)
    public JAXBElement<String> createGetDataSetPassword(String value) {
        return new JAXBElement<String>(_GetSchemaDataSetPassword_QNAME, String.class, GetDataSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.farmadati.it", name = "Username", scope = GetDataSet.class)
    public JAXBElement<String> createGetDataSetUsername(String value) {
        return new JAXBElement<String>(_GetSchemaDataSetUsername_QNAME, String.class, GetDataSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEnabledDataSetOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.farmadati.it", name = "GetEnabledDataSetResult", scope = GetEnabledDataSetResponse.class)
    public JAXBElement<GetEnabledDataSetOutput> createGetEnabledDataSetResponseGetEnabledDataSetResult(GetEnabledDataSetOutput value) {
        return new JAXBElement<GetEnabledDataSetOutput>(_GetEnabledDataSetResponseGetEnabledDataSetResult_QNAME, GetEnabledDataSetOutput.class, GetEnabledDataSetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataSetOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.farmadati.it", name = "GetDataSetResult", scope = GetDataSetResponse.class)
    public JAXBElement<GetDataSetOutput> createGetDataSetResponseGetDataSetResult(GetDataSetOutput value) {
        return new JAXBElement<GetDataSetOutput>(_GetDataSetResponseGetDataSetResult_QNAME, GetDataSetOutput.class, GetDataSetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataSetChangesOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.farmadati.it", name = "GetDataSetChangesResult", scope = GetDataSetChangesResponse.class)
    public JAXBElement<GetDataSetChangesOutput> createGetDataSetChangesResponseGetDataSetChangesResult(GetDataSetChangesOutput value) {
        return new JAXBElement<GetDataSetChangesOutput>(_GetDataSetChangesResponseGetDataSetChangesResult_QNAME, GetDataSetChangesOutput.class, GetDataSetChangesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.farmadati.it", name = "Modalita", scope = GetDataSetChanges.class)
    public JAXBElement<String> createGetDataSetChangesModalita(String value) {
        return new JAXBElement<String>(_GetDataSetModalita_QNAME, String.class, GetDataSetChanges.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.farmadati.it", name = "CodiceSetDati", scope = GetDataSetChanges.class)
    public JAXBElement<String> createGetDataSetChangesCodiceSetDati(String value) {
        return new JAXBElement<String>(_GetSchemaDataSetCodiceSetDati_QNAME, String.class, GetDataSetChanges.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.farmadati.it", name = "DataIstanza", scope = GetDataSetChanges.class)
    public JAXBElement<String> createGetDataSetChangesDataIstanza(String value) {
        return new JAXBElement<String>(_GetDataSetChangesDataIstanza_QNAME, String.class, GetDataSetChanges.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.farmadati.it", name = "Password", scope = GetDataSetChanges.class)
    public JAXBElement<String> createGetDataSetChangesPassword(String value) {
        return new JAXBElement<String>(_GetSchemaDataSetPassword_QNAME, String.class, GetDataSetChanges.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.farmadati.it", name = "Username", scope = GetDataSetChanges.class)
    public JAXBElement<String> createGetDataSetChangesUsername(String value) {
        return new JAXBElement<String>(_GetSchemaDataSetUsername_QNAME, String.class, GetDataSetChanges.class, value);
    }

}
