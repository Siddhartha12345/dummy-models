
package com.domain.user.schema.commercial;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;


/**
 * PersonalUser
 * <p>
 * Schema definition of a personal user
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "commercialUserId",
    "commercialUserFirstName",
    "commercialUserLastName",
    "commercialUserAge",
    "commercialUserAddress"
})
public class CommercialUser {

    /**
     * CommercialUserId
     * <p>
     * Identifier for a commercial user
     * (Required)
     * 
     */
    @JsonProperty("commercialUserId")
    @JsonPropertyDescription("Identifier for a commercial user")
    @NotNull
    private String commercialUserId;
    /**
     * CommercialUserFirstName
     * <p>
     * First name for the commercial user
     * (Required)
     * 
     */
    @JsonProperty("commercialUserFirstName")
    @JsonPropertyDescription("First name for the commercial user")
    @NotNull
    private String commercialUserFirstName;
    /**
     * CommercialUserLastName
     * <p>
     * Last name for the commercial user
     * (Required)
     * 
     */
    @JsonProperty("commercialUserLastName")
    @JsonPropertyDescription("Last name for the commercial user")
    @NotNull
    private String commercialUserLastName;
    /**
     * CommercialUserAge
     * <p>
     * Age of the commercial user
     * 
     */
    @JsonProperty("commercialUserAge")
    @JsonPropertyDescription("Age of the commercial user")
    private Integer commercialUserAge;
    /**
     * CommercialUserAddress
     * <p>
     * Address schema definition of a commercial user
     * 
     */
    @JsonProperty("commercialUserAddress")
    @JsonPropertyDescription("Address schema definition of a commercial user")
    @Valid
    private CommercialUserAddress commercialUserAddress;

    /**
     * CommercialUserId
     * <p>
     * Identifier for a commercial user
     * (Required)
     * 
     */
    @JsonProperty("commercialUserId")
    public String getCommercialUserId() {
        return commercialUserId;
    }

    /**
     * CommercialUserId
     * <p>
     * Identifier for a commercial user
     * (Required)
     * 
     */
    @JsonProperty("commercialUserId")
    public void setCommercialUserId(String commercialUserId) {
        this.commercialUserId = commercialUserId;
    }

    /**
     * CommercialUserFirstName
     * <p>
     * First name for the commercial user
     * (Required)
     * 
     */
    @JsonProperty("commercialUserFirstName")
    public String getCommercialUserFirstName() {
        return commercialUserFirstName;
    }

    /**
     * CommercialUserFirstName
     * <p>
     * First name for the commercial user
     * (Required)
     * 
     */
    @JsonProperty("commercialUserFirstName")
    public void setCommercialUserFirstName(String commercialUserFirstName) {
        this.commercialUserFirstName = commercialUserFirstName;
    }

    /**
     * CommercialUserLastName
     * <p>
     * Last name for the commercial user
     * (Required)
     * 
     */
    @JsonProperty("commercialUserLastName")
    public String getCommercialUserLastName() {
        return commercialUserLastName;
    }

    /**
     * CommercialUserLastName
     * <p>
     * Last name for the commercial user
     * (Required)
     * 
     */
    @JsonProperty("commercialUserLastName")
    public void setCommercialUserLastName(String commercialUserLastName) {
        this.commercialUserLastName = commercialUserLastName;
    }

    /**
     * CommercialUserAge
     * <p>
     * Age of the commercial user
     * 
     */
    @JsonProperty("commercialUserAge")
    public Integer getCommercialUserAge() {
        return commercialUserAge;
    }

    /**
     * CommercialUserAge
     * <p>
     * Age of the commercial user
     * 
     */
    @JsonProperty("commercialUserAge")
    public void setCommercialUserAge(Integer commercialUserAge) {
        this.commercialUserAge = commercialUserAge;
    }

    /**
     * CommercialUserAddress
     * <p>
     * Address schema definition of a commercial user
     * 
     */
    @JsonProperty("commercialUserAddress")
    public CommercialUserAddress getCommercialUserAddress() {
        return commercialUserAddress;
    }

    /**
     * CommercialUserAddress
     * <p>
     * Address schema definition of a commercial user
     * 
     */
    @JsonProperty("commercialUserAddress")
    public void setCommercialUserAddress(CommercialUserAddress commercialUserAddress) {
        this.commercialUserAddress = commercialUserAddress;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CommercialUser.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("commercialUserId");
        sb.append('=');
        sb.append(((this.commercialUserId == null)?"<null>":this.commercialUserId));
        sb.append(',');
        sb.append("commercialUserFirstName");
        sb.append('=');
        sb.append(((this.commercialUserFirstName == null)?"<null>":this.commercialUserFirstName));
        sb.append(',');
        sb.append("commercialUserLastName");
        sb.append('=');
        sb.append(((this.commercialUserLastName == null)?"<null>":this.commercialUserLastName));
        sb.append(',');
        sb.append("commercialUserAge");
        sb.append('=');
        sb.append(((this.commercialUserAge == null)?"<null>":this.commercialUserAge));
        sb.append(',');
        sb.append("commercialUserAddress");
        sb.append('=');
        sb.append(((this.commercialUserAddress == null)?"<null>":this.commercialUserAddress));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.commercialUserLastName == null)? 0 :this.commercialUserLastName.hashCode()));
        result = ((result* 31)+((this.commercialUserAge == null)? 0 :this.commercialUserAge.hashCode()));
        result = ((result* 31)+((this.commercialUserFirstName == null)? 0 :this.commercialUserFirstName.hashCode()));
        result = ((result* 31)+((this.commercialUserId == null)? 0 :this.commercialUserId.hashCode()));
        result = ((result* 31)+((this.commercialUserAddress == null)? 0 :this.commercialUserAddress.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CommercialUser) == false) {
            return false;
        }
        CommercialUser rhs = ((CommercialUser) other);
        return ((((((this.commercialUserLastName == rhs.commercialUserLastName)||((this.commercialUserLastName!= null)&&this.commercialUserLastName.equals(rhs.commercialUserLastName)))&&((this.commercialUserAge == rhs.commercialUserAge)||((this.commercialUserAge!= null)&&this.commercialUserAge.equals(rhs.commercialUserAge))))&&((this.commercialUserFirstName == rhs.commercialUserFirstName)||((this.commercialUserFirstName!= null)&&this.commercialUserFirstName.equals(rhs.commercialUserFirstName))))&&((this.commercialUserId == rhs.commercialUserId)||((this.commercialUserId!= null)&&this.commercialUserId.equals(rhs.commercialUserId))))&&((this.commercialUserAddress == rhs.commercialUserAddress)||((this.commercialUserAddress!= null)&&this.commercialUserAddress.equals(rhs.commercialUserAddress))));
    }

}
