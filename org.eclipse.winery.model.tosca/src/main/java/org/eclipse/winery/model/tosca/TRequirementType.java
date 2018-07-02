/*******************************************************************************
 * Copyright (c) 2013-2017 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0, or the Apache Software License 2.0
 * which is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0
 *******************************************************************************/

package org.eclipse.winery.model.tosca;

import org.eclipse.jdt.annotation.Nullable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import java.util.Objects;


/**
 * <p>Java class for tRequirementType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="tRequirementType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/tosca/ns/2011/12}tEntityType">
 *       &lt;attribute name="requiredCapabilityType" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tRequirementType")
public class TRequirementType extends TEntityType {
    @XmlAttribute(name = "requiredCapabilityType")
    protected QName requiredCapabilityType;

    public TRequirementType() {
    }

    public TRequirementType(Builder builder) {
        super(builder);
        this.requiredCapabilityType = builder.requiredCapabilityType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TRequirementType)) return false;
        if (!super.equals(o)) return false;
        TRequirementType that = (TRequirementType) o;
        return Objects.equals(requiredCapabilityType, that.requiredCapabilityType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), requiredCapabilityType);
    }

    /**
     * Gets the value of the requiredCapabilityType property.
     *
     * @return possible object is {@link QName }
     */
    @Nullable
    public QName getRequiredCapabilityType() {
        return requiredCapabilityType;
    }

    /**
     * Sets the value of the requiredCapabilityType property.
     *
     * @param value allowed object is {@link QName }
     */
    public void setRequiredCapabilityType(QName value) {
        this.requiredCapabilityType = value;
    }

    public static class Builder extends TEntityType.Builder<Builder> {
        private QName requiredCapabilityType;

        public Builder(String name) {
            super(name);
        }

        public Builder(TEntityType entityType) {
            super(entityType);
        }

        public Builder setRequiredCapabilityType(QName requiredCapabilityType) {
            this.requiredCapabilityType = requiredCapabilityType;
            return this;
        }

        @Override
        public Builder self() {
            return this;
        }

        public TRequirementType build() {
            return new TRequirementType(this);
        }
    }
}
