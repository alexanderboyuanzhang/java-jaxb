//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.10.11 alle 01:55:52 PM CEST 
//


package com.soprasteria.jaxbtest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="addressLine1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="addressLine2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="zip" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="assestsAllocated" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
    "id",
    "name",
    "address",
    "assestsAllocated"
})
@XmlRootElement(name = "employee")
public class Employee {

    protected byte id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected Employee.Address address;
    protected List<String> assestsAllocated;

    /**
     * Recupera il valore della propriet� id.
     * 
     */
    public byte getId() {
        return id;
    }

    /**
     * Imposta il valore della propriet� id.
     * 
     */
    public void setId(byte value) {
        this.id = value;
    }

    /**
     * Recupera il valore della propriet� name.
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
     * Imposta il valore della propriet� name.
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
     * Recupera il valore della propriet� address.
     * 
     * @return
     *     possible object is
     *     {@link Employee.Address }
     *     
     */
    public Employee.Address getAddress() {
        return address;
    }

    /**
     * Imposta il valore della propriet� address.
     * 
     * @param value
     *     allowed object is
     *     {@link Employee.Address }
     *     
     */
    public void setAddress(Employee.Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the assestsAllocated property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assestsAllocated property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssestsAllocated().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAssestsAllocated() {
        if (assestsAllocated == null) {
            assestsAllocated = new ArrayList<String>();
        }
        return this.assestsAllocated;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="addressLine1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="addressLine2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="zip" type="{http://www.w3.org/2001/XMLSchema}short"/>
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
        "addressLine1",
        "addressLine2",
        "country",
        "state",
        "zip"
    })
    public static class Address {

        @XmlElement(required = true)
        protected String addressLine1;
        @XmlElement(required = true)
        protected String addressLine2;
        @XmlElement(required = true)
        protected String country;
        @XmlElement(required = true)
        protected String state;
        protected short zip;

        /**
         * Recupera il valore della propriet� addressLine1.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddressLine1() {
            return addressLine1;
        }

        /**
         * Imposta il valore della propriet� addressLine1.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddressLine1(String value) {
            this.addressLine1 = value;
        }

        /**
         * Recupera il valore della propriet� addressLine2.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddressLine2() {
            return addressLine2;
        }

        /**
         * Imposta il valore della propriet� addressLine2.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddressLine2(String value) {
            this.addressLine2 = value;
        }

        /**
         * Recupera il valore della propriet� country.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountry() {
            return country;
        }

        /**
         * Imposta il valore della propriet� country.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountry(String value) {
            this.country = value;
        }

        /**
         * Recupera il valore della propriet� state.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getState() {
            return state;
        }

        /**
         * Imposta il valore della propriet� state.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setState(String value) {
            this.state = value;
        }

        /**
         * Recupera il valore della propriet� zip.
         * 
         */
        public short getZip() {
            return zip;
        }

        /**
         * Imposta il valore della propriet� zip.
         * 
         */
        public void setZip(short value) {
            this.zip = value;
        }

    }

}
