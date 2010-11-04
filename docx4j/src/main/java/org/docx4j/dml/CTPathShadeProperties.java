/*
 *  Copyright 2007-2008, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */


package org.docx4j.dml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CT_PathShadeProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_PathShadeProperties">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fillToRect" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_RelativeRect" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="path" type="{http://schemas.openxmlformats.org/drawingml/2006/main}ST_PathShadeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_PathShadeProperties", propOrder = {
    "fillToRect"
})
public class CTPathShadeProperties {

    protected CTRelativeRect fillToRect;
    @XmlAttribute
    protected STPathShadeType path;

    /**
     * Gets the value of the fillToRect property.
     * 
     * @return
     *     possible object is
     *     {@link CTRelativeRect }
     *     
     */
    public CTRelativeRect getFillToRect() {
        return fillToRect;
    }

    /**
     * Sets the value of the fillToRect property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTRelativeRect }
     *     
     */
    public void setFillToRect(CTRelativeRect value) {
        this.fillToRect = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link STPathShadeType }
     *     
     */
    public STPathShadeType getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link STPathShadeType }
     *     
     */
    public void setPath(STPathShadeType value) {
        this.path = value;
    }

}