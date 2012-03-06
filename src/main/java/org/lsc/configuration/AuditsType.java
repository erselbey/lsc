//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.06 at 09:17:48 AM CET 
//


package org.lsc.configuration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for auditsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="auditsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="csvAudit" type="{http://lsc-project.org/XSD/lsc-core-2.0.xsd}csvAuditType" minOccurs="0"/>
 *           &lt;element name="ldifAudit" type="{http://lsc-project.org/XSD/lsc-core-2.0.xsd}ldifAuditType" minOccurs="0"/>
 *           &lt;element name="pluginAudit" type="{http://lsc-project.org/XSD/lsc-core-2.0.xsd}pluginAuditType"/>
 *         &lt;/choice>
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
@XmlType(name = "auditsType", namespace = "http://lsc-project.org/XSD/lsc-core-2.0.xsd", propOrder = {
    "csvAuditOrLdifAuditOrPluginAudit"
})
public class AuditsType {

    @XmlElements({
        @XmlElement(name = "ldifAudit", namespace = "http://lsc-project.org/XSD/lsc-core-2.0.xsd", type = LdifAuditType.class),
        @XmlElement(name = "pluginAudit", namespace = "http://lsc-project.org/XSD/lsc-core-2.0.xsd", type = PluginAuditType.class),
        @XmlElement(name = "csvAudit", namespace = "http://lsc-project.org/XSD/lsc-core-2.0.xsd", type = CsvAuditType.class)
    })
    protected List<AuditType> csvAuditOrLdifAuditOrPluginAudit;
    @XmlAttribute
    protected String id;

    /**
     * Gets the value of the csvAuditOrLdifAuditOrPluginAudit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the csvAuditOrLdifAuditOrPluginAudit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCsvAuditOrLdifAuditOrPluginAudit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LdifAuditType }
     * {@link PluginAuditType }
     * {@link CsvAuditType }
     * 
     * 
     */
    public List<AuditType> getCsvAuditOrLdifAuditOrPluginAudit() {
        if (csvAuditOrLdifAuditOrPluginAudit == null) {
            csvAuditOrLdifAuditOrPluginAudit = new ArrayList<AuditType>();
        }
        return this.csvAuditOrLdifAuditOrPluginAudit;
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
