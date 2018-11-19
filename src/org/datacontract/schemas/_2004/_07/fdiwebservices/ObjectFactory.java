
package org.datacontract.schemas._2004._07.fdiwebservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.fdiwebservices package. 
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

    private final static QName _ArrayOfSetDati_QNAME = new QName("http://schemas.datacontract.org/2004/07/FDIWebServices", "ArrayOfSetDati");
    private final static QName _Field_QNAME = new QName("http://schemas.datacontract.org/2004/07/FDIWebServices", "Field");
    private final static QName _GetDataSetOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/FDIWebServices", "GetDataSet_Output");
    private final static QName _ArrayOfField_QNAME = new QName("http://schemas.datacontract.org/2004/07/FDIWebServices", "ArrayOfField");
    private final static QName _GetEnabledDataSetOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/FDIWebServices", "GetEnabledDataSet_Output");
    private final static QName _GetDataSetChangesOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/FDIWebServices", "GetDataSetChanges_Output");
    private final static QName _GetSchemaDataSetOutput_QNAME = new QName("http://schemas.datacontract.org/2004/07/FDIWebServices", "GetSchemaDataSet_Output");
    private final static QName _SetDati_QNAME = new QName("http://schemas.datacontract.org/2004/07/FDIWebServices", "SetDati");
    private final static QName _GetSchemaDataSetOutputCodEsito_QNAME = new QName("http://schemas.datacontract.org/2004/07/FDIWebServices", "CodEsito");
    private final static QName _GetSchemaDataSetOutputFields_QNAME = new QName("http://schemas.datacontract.org/2004/07/FDIWebServices", "Fields");
    private final static QName _GetSchemaDataSetOutputDescEsito_QNAME = new QName("http://schemas.datacontract.org/2004/07/FDIWebServices", "DescEsito");
    private final static QName _FieldDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/FDIWebServices", "Description");
    private final static QName _FieldKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/FDIWebServices", "Key");
    private final static QName _FieldType_QNAME = new QName("http://schemas.datacontract.org/2004/07/FDIWebServices", "Type");
    private final static QName _FieldLength_QNAME = new QName("http://schemas.datacontract.org/2004/07/FDIWebServices", "Length");
    private final static QName _SetDatiUrlNews_QNAME = new QName("http://schemas.datacontract.org/2004/07/FDIWebServices", "UrlNews");
    private final static QName _GetDataSetChangesOutputByteListFile_QNAME = new QName("http://schemas.datacontract.org/2004/07/FDIWebServices", "ByteListFile");
    private final static QName _GetDataSetChangesOutputOutputValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/FDIWebServices", "OutputValue");
    private final static QName _GetEnabledDataSetOutputSetDatiAbilitati_QNAME = new QName("http://schemas.datacontract.org/2004/07/FDIWebServices", "SetDatiAbilitati");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.fdiwebservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSchemaDataSetOutput }
     * 
     */
    public GetSchemaDataSetOutput createGetSchemaDataSetOutput() {
        return new GetSchemaDataSetOutput();
    }

    /**
     * Create an instance of {@link GetDataSetChangesOutput }
     * 
     */
    public GetDataSetChangesOutput createGetDataSetChangesOutput() {
        return new GetDataSetChangesOutput();
    }

    /**
     * Create an instance of {@link GetDataSetOutput }
     * 
     */
    public GetDataSetOutput createGetDataSetOutput() {
        return new GetDataSetOutput();
    }

    /**
     * Create an instance of {@link GetEnabledDataSetOutput }
     * 
     */
    public GetEnabledDataSetOutput createGetEnabledDataSetOutput() {
        return new GetEnabledDataSetOutput();
    }

    /**
     * Create an instance of {@link ArrayOfSetDati }
     * 
     */
    public ArrayOfSetDati createArrayOfSetDati() {
        return new ArrayOfSetDati();
    }

    /**
     * Create an instance of {@link Field }
     * 
     */
    public Field createField() {
        return new Field();
    }

    /**
     * Create an instance of {@link ArrayOfField }
     * 
     */
    public ArrayOfField createArrayOfField() {
        return new ArrayOfField();
    }

    /**
     * Create an instance of {@link SetDati }
     * 
     */
    public SetDati createSetDati() {
        return new SetDati();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSetDati }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", name = "ArrayOfSetDati")
    public JAXBElement<ArrayOfSetDati> createArrayOfSetDati(ArrayOfSetDati value) {
        return new JAXBElement<ArrayOfSetDati>(_ArrayOfSetDati_QNAME, ArrayOfSetDati.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Field }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", name = "Field")
    public JAXBElement<Field> createField(Field value) {
        return new JAXBElement<Field>(_Field_QNAME, Field.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataSetOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", name = "GetDataSet_Output")
    public JAXBElement<GetDataSetOutput> createGetDataSetOutput(GetDataSetOutput value) {
        return new JAXBElement<GetDataSetOutput>(_GetDataSetOutput_QNAME, GetDataSetOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", name = "ArrayOfField")
    public JAXBElement<ArrayOfField> createArrayOfField(ArrayOfField value) {
        return new JAXBElement<ArrayOfField>(_ArrayOfField_QNAME, ArrayOfField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEnabledDataSetOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", name = "GetEnabledDataSet_Output")
    public JAXBElement<GetEnabledDataSetOutput> createGetEnabledDataSetOutput(GetEnabledDataSetOutput value) {
        return new JAXBElement<GetEnabledDataSetOutput>(_GetEnabledDataSetOutput_QNAME, GetEnabledDataSetOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataSetChangesOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", name = "GetDataSetChanges_Output")
    public JAXBElement<GetDataSetChangesOutput> createGetDataSetChangesOutput(GetDataSetChangesOutput value) {
        return new JAXBElement<GetDataSetChangesOutput>(_GetDataSetChangesOutput_QNAME, GetDataSetChangesOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSchemaDataSetOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", name = "GetSchemaDataSet_Output")
    public JAXBElement<GetSchemaDataSetOutput> createGetSchemaDataSetOutput(GetSchemaDataSetOutput value) {
        return new JAXBElement<GetSchemaDataSetOutput>(_GetSchemaDataSetOutput_QNAME, GetSchemaDataSetOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDati }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", name = "SetDati")
    public JAXBElement<SetDati> createSetDati(SetDati value) {
        return new JAXBElement<SetDati>(_SetDati_QNAME, SetDati.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", name = "CodEsito", scope = GetSchemaDataSetOutput.class)
    public JAXBElement<String> createGetSchemaDataSetOutputCodEsito(String value) {
        return new JAXBElement<String>(_GetSchemaDataSetOutputCodEsito_QNAME, String.class, GetSchemaDataSetOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", name = "Fields", scope = GetSchemaDataSetOutput.class)
    public JAXBElement<ArrayOfField> createGetSchemaDataSetOutputFields(ArrayOfField value) {
        return new JAXBElement<ArrayOfField>(_GetSchemaDataSetOutputFields_QNAME, ArrayOfField.class, GetSchemaDataSetOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", name = "DescEsito", scope = GetSchemaDataSetOutput.class)
    public JAXBElement<String> createGetSchemaDataSetOutputDescEsito(String value) {
        return new JAXBElement<String>(_GetSchemaDataSetOutputDescEsito_QNAME, String.class, GetSchemaDataSetOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", name = "Description", scope = Field.class)
    public JAXBElement<String> createFieldDescription(String value) {
        return new JAXBElement<String>(_FieldDescription_QNAME, String.class, Field.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", name = "Key", scope = Field.class)
    public JAXBElement<String> createFieldKey(String value) {
        return new JAXBElement<String>(_FieldKey_QNAME, String.class, Field.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", name = "Type", scope = Field.class)
    public JAXBElement<String> createFieldType(String value) {
        return new JAXBElement<String>(_FieldType_QNAME, String.class, Field.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", name = "Length", scope = Field.class)
    public JAXBElement<String> createFieldLength(String value) {
        return new JAXBElement<String>(_FieldLength_QNAME, String.class, Field.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", name = "Description", scope = SetDati.class)
    public JAXBElement<String> createSetDatiDescription(String value) {
        return new JAXBElement<String>(_FieldDescription_QNAME, String.class, SetDati.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", name = "Key", scope = SetDati.class)
    public JAXBElement<String> createSetDatiKey(String value) {
        return new JAXBElement<String>(_FieldKey_QNAME, String.class, SetDati.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", name = "UrlNews", scope = SetDati.class)
    public JAXBElement<String> createSetDatiUrlNews(String value) {
        return new JAXBElement<String>(_SetDatiUrlNews_QNAME, String.class, SetDati.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", name = "ByteListFile", scope = GetDataSetChangesOutput.class)
    public JAXBElement<byte[]> createGetDataSetChangesOutputByteListFile(byte[] value) {
        return new JAXBElement<byte[]>(_GetDataSetChangesOutputByteListFile_QNAME, byte[].class, GetDataSetChangesOutput.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", name = "CodEsito", scope = GetDataSetChangesOutput.class)
    public JAXBElement<String> createGetDataSetChangesOutputCodEsito(String value) {
        return new JAXBElement<String>(_GetSchemaDataSetOutputCodEsito_QNAME, String.class, GetDataSetChangesOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", name = "OutputValue", scope = GetDataSetChangesOutput.class)
    public JAXBElement<String> createGetDataSetChangesOutputOutputValue(String value) {
        return new JAXBElement<String>(_GetDataSetChangesOutputOutputValue_QNAME, String.class, GetDataSetChangesOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", name = "DescEsito", scope = GetDataSetChangesOutput.class)
    public JAXBElement<String> createGetDataSetChangesOutputDescEsito(String value) {
        return new JAXBElement<String>(_GetSchemaDataSetOutputDescEsito_QNAME, String.class, GetDataSetChangesOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", name = "ByteListFile", scope = GetDataSetOutput.class)
    public JAXBElement<byte[]> createGetDataSetOutputByteListFile(byte[] value) {
        return new JAXBElement<byte[]>(_GetDataSetChangesOutputByteListFile_QNAME, byte[].class, GetDataSetOutput.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", name = "CodEsito", scope = GetDataSetOutput.class)
    public JAXBElement<String> createGetDataSetOutputCodEsito(String value) {
        return new JAXBElement<String>(_GetSchemaDataSetOutputCodEsito_QNAME, String.class, GetDataSetOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", name = "OutputValue", scope = GetDataSetOutput.class)
    public JAXBElement<String> createGetDataSetOutputOutputValue(String value) {
        return new JAXBElement<String>(_GetDataSetChangesOutputOutputValue_QNAME, String.class, GetDataSetOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", name = "DescEsito", scope = GetDataSetOutput.class)
    public JAXBElement<String> createGetDataSetOutputDescEsito(String value) {
        return new JAXBElement<String>(_GetSchemaDataSetOutputDescEsito_QNAME, String.class, GetDataSetOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSetDati }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", name = "SetDatiAbilitati", scope = GetEnabledDataSetOutput.class)
    public JAXBElement<ArrayOfSetDati> createGetEnabledDataSetOutputSetDatiAbilitati(ArrayOfSetDati value) {
        return new JAXBElement<ArrayOfSetDati>(_GetEnabledDataSetOutputSetDatiAbilitati_QNAME, ArrayOfSetDati.class, GetEnabledDataSetOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", name = "CodEsito", scope = GetEnabledDataSetOutput.class)
    public JAXBElement<String> createGetEnabledDataSetOutputCodEsito(String value) {
        return new JAXBElement<String>(_GetSchemaDataSetOutputCodEsito_QNAME, String.class, GetEnabledDataSetOutput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FDIWebServices", name = "DescEsito", scope = GetEnabledDataSetOutput.class)
    public JAXBElement<String> createGetEnabledDataSetOutputDescEsito(String value) {
        return new JAXBElement<String>(_GetSchemaDataSetOutputDescEsito_QNAME, String.class, GetEnabledDataSetOutput.class, value);
    }

}
