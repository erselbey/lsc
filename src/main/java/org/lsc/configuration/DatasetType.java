//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.06 at 09:17:48 AM CET 
//


package org.lsc.configuration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datasetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datasetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="policy" type="{http://lsc-project.org/XSD/lsc-core-2.0.xsd}policyType" minOccurs="0"/>
 *         &lt;element name="defaultValues" type="{http://lsc-project.org/XSD/lsc-core-2.0.xsd}valuesType" minOccurs="0"/>
 *         &lt;element name="forceValues" type="{http://lsc-project.org/XSD/lsc-core-2.0.xsd}valuesType" minOccurs="0"/>
 *         &lt;element name="createValues" type="{http://lsc-project.org/XSD/lsc-core-2.0.xsd}valuesType" minOccurs="0"/>
 *         &lt;element name="delimiter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datasetType", namespace = "http://lsc-project.org/XSD/lsc-core-2.0.xsd", propOrder = {
    "name",
    "policy",
    "defaultValues",
    "forceValues",
    "createValues",
    "delimiter"
})
public class DatasetType {

    @XmlElement(namespace = "http://lsc-project.org/XSD/lsc-core-2.0.xsd", required = true)
    protected String name;
    @XmlElement(namespace = "http://lsc-project.org/XSD/lsc-core-2.0.xsd")
    protected PolicyType policy;
    @XmlElement(namespace = "http://lsc-project.org/XSD/lsc-core-2.0.xsd")
    protected ValuesType defaultValues;
    @XmlElement(namespace = "http://lsc-project.org/XSD/lsc-core-2.0.xsd")
    protected ValuesType forceValues;
    @XmlElement(namespace = "http://lsc-project.org/XSD/lsc-core-2.0.xsd")
    protected ValuesType createValues;
    @XmlElement(namespace = "http://lsc-project.org/XSD/lsc-core-2.0.xsd")
    protected String delimiter;
    @XmlAttribute
    protected String id;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the policy property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyType }
     *     
     */
    public PolicyType getPolicy() {
        return policy;
    }

    /**
     * Sets the value of the policy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyType }
     *     
     */
    public void setPolicy(PolicyType value) {
        this.policy = value;
    }

    /**
     * Gets the value of the defaultValues property.
     * 
     * @return
     *     possible object is
     *     {@link ValuesType }
     *     
     */
    public ValuesType getDefaultValues() {
        return defaultValues;
    }

    /**
     * Sets the value of the defaultValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuesType }
     *     
     */
    public void setDefaultValues(ValuesType value) {
        this.defaultValues = value;
    }

    /**
     * Gets the value of the forceValues property.
     * 
     * @return
     *     possible object is
     *     {@link ValuesType }
     *     
     */
    public ValuesType getForceValues() {
        return forceValues;
    }

    /**
     * Sets the value of the forceValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuesType }
     *     
     */
    public void setForceValues(ValuesType value) {
        this.forceValues = value;
    }

    /**
     * Gets the value of the createValues property.
     * 
     * @return
     *     possible object is
     *     {@link ValuesType }
     *     
     */
    public ValuesType getCreateValues() {
        return createValues;
    }

    /**
     * Sets the value of the createValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuesType }
     *     
     */
    public void setCreateValues(ValuesType value) {
        this.createValues = value;
    }

    /**
     * Gets the value of the delimiter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * Sets the value of the delimiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelimiter(String value) {
        this.delimiter = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
