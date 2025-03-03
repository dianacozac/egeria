/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.accessservices.assetmanager.rest;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.odpi.openmetadata.accessservices.assetmanager.properties.ExternalReferenceProperties;
import org.odpi.openmetadata.accessservices.assetmanager.properties.MetadataCorrelationProperties;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;


/**
 * ExternalReferenceRequestBody describes the request body used to create/update external reference properties.
 */
@JsonAutoDetect(getterVisibility=PUBLIC_ONLY, setterVisibility=PUBLIC_ONLY, fieldVisibility=NONE)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
public class ExternalReferenceRequestBody extends UpdateRequestBody
{
    @Serial
    private static final long serialVersionUID = 1L;

    private ExternalReferenceProperties   elementProperties = null;
    private String                        anchorGUID = null;


    /**
     * Default constructor
     */
    public ExternalReferenceRequestBody()
    {
        super();
    }


    /**
     * Copy/clone constructor.
     *
     * @param template object to copy
     */
    public ExternalReferenceRequestBody(ExternalReferenceRequestBody template)
    {
        super (template);

        if (template != null)
        {
            elementProperties = template.getElementProperties();
            anchorGUID = template.getAnchorGUID();
        }
    }


    /**
     * Return the properties for the element.
     *
     * @return properties object
     */
    public ExternalReferenceProperties getElementProperties()
    {
        return elementProperties;
    }


    /**
     * Set up the properties for the element.
     *
     * @param elementProperties properties object
     */
    public void setElementProperties(ExternalReferenceProperties elementProperties)
    {
        this.elementProperties = elementProperties;
    }


    /**
     * Set up an optional anchor GUID for the new external reference.  The assumption is that the external reference
     * will be linked to this element.
     *
     * @return string guid
     */
    public String getAnchorGUID()
    {
        return anchorGUID;
    }


    /**
     * Set up an optional anchor GUID for the new external reference.  The assumption is that the external reference
     * will be linked to this element.
     *
     * @param anchorGUID string guid
     */
    public void setAnchorGUID(String anchorGUID)
    {
        this.anchorGUID = anchorGUID;
    }


    /**
     * JSON-style toString
     *
     * @return return string containing the property names and values
     */
    @Override
    public String toString()
    {
        return "ExternalReferenceRequestBody{" +
                       "elementProperties=" + elementProperties +
                       ", anchorGUID='" + anchorGUID + '\'' +
                       ", metadataCorrelationProperties=" + getMetadataCorrelationProperties() +
                       ", effectiveTime=" + getEffectiveTime() +
                       '}';
    }


    /**
     * Return comparison result based on the content of the properties.
     *
     * @param objectToCompare test object
     * @return result of comparison
     */
    @Override
    public boolean equals(Object objectToCompare)
    {
        if (this == objectToCompare)
        {
            return true;
        }
        if (objectToCompare == null || getClass() != objectToCompare.getClass())
        {
            return false;
        }
        if (! super.equals(objectToCompare))
        {
            return false;
        }
        ExternalReferenceRequestBody that = (ExternalReferenceRequestBody) objectToCompare;
        return Objects.equals(elementProperties, that.elementProperties) && Objects.equals(anchorGUID, that.anchorGUID);
    }


    /**
     * Return hash code for this object
     *
     * @return int hash code
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(super.hashCode(), anchorGUID, elementProperties);
    }
}
