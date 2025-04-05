
package com.domain.user.schema.personal;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
    "personalUserId",
    "personalUserFirstName",
    "personalUserLastName",
    "personalUserAge",
    "personalUserHobbies"
})
public class PersonalUser {

    /**
     * PersonalUserId
     * <p>
     * Identifier for a personal user
     * (Required)
     * 
     */
    @JsonProperty("personalUserId")
    @JsonPropertyDescription("Identifier for a personal user")
    @NotNull
    private String personalUserId;
    /**
     * PersonalUserFirstName
     * <p>
     * First name for the personal user
     * (Required)
     * 
     */
    @JsonProperty("personalUserFirstName")
    @JsonPropertyDescription("First name for the personal user")
    @NotNull
    private String personalUserFirstName;
    /**
     * PersonalUserLastName
     * <p>
     * Last name for the personal user
     * (Required)
     * 
     */
    @JsonProperty("personalUserLastName")
    @JsonPropertyDescription("Last name for the personal user")
    @NotNull
    private String personalUserLastName;
    /**
     * PersonalUserAge
     * <p>
     * Age of the personal user
     * 
     */
    @JsonProperty("personalUserAge")
    @JsonPropertyDescription("Age of the personal user")
    private Integer personalUserAge;
    /**
     * PersonalUserHobbies
     * <p>
     * Set of hobbies for the personal user
     * 
     */
    @JsonProperty("personalUserHobbies")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Set of hobbies for the personal user")
    @Valid
    private Set<String> personalUserHobbies = new LinkedHashSet<String>();

    /**
     * PersonalUserId
     * <p>
     * Identifier for a personal user
     * (Required)
     * 
     */
    @JsonProperty("personalUserId")
    public String getPersonalUserId() {
        return personalUserId;
    }

    /**
     * PersonalUserId
     * <p>
     * Identifier for a personal user
     * (Required)
     * 
     */
    @JsonProperty("personalUserId")
    public void setPersonalUserId(String personalUserId) {
        this.personalUserId = personalUserId;
    }

    /**
     * PersonalUserFirstName
     * <p>
     * First name for the personal user
     * (Required)
     * 
     */
    @JsonProperty("personalUserFirstName")
    public String getPersonalUserFirstName() {
        return personalUserFirstName;
    }

    /**
     * PersonalUserFirstName
     * <p>
     * First name for the personal user
     * (Required)
     * 
     */
    @JsonProperty("personalUserFirstName")
    public void setPersonalUserFirstName(String personalUserFirstName) {
        this.personalUserFirstName = personalUserFirstName;
    }

    /**
     * PersonalUserLastName
     * <p>
     * Last name for the personal user
     * (Required)
     * 
     */
    @JsonProperty("personalUserLastName")
    public String getPersonalUserLastName() {
        return personalUserLastName;
    }

    /**
     * PersonalUserLastName
     * <p>
     * Last name for the personal user
     * (Required)
     * 
     */
    @JsonProperty("personalUserLastName")
    public void setPersonalUserLastName(String personalUserLastName) {
        this.personalUserLastName = personalUserLastName;
    }

    /**
     * PersonalUserAge
     * <p>
     * Age of the personal user
     * 
     */
    @JsonProperty("personalUserAge")
    public Integer getPersonalUserAge() {
        return personalUserAge;
    }

    /**
     * PersonalUserAge
     * <p>
     * Age of the personal user
     * 
     */
    @JsonProperty("personalUserAge")
    public void setPersonalUserAge(Integer personalUserAge) {
        this.personalUserAge = personalUserAge;
    }

    /**
     * PersonalUserHobbies
     * <p>
     * Set of hobbies for the personal user
     * 
     */
    @JsonProperty("personalUserHobbies")
    public Set<String> getPersonalUserHobbies() {
        return personalUserHobbies;
    }

    /**
     * PersonalUserHobbies
     * <p>
     * Set of hobbies for the personal user
     * 
     */
    @JsonProperty("personalUserHobbies")
    public void setPersonalUserHobbies(Set<String> personalUserHobbies) {
        this.personalUserHobbies = personalUserHobbies;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersonalUser.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("personalUserId");
        sb.append('=');
        sb.append(((this.personalUserId == null)?"<null>":this.personalUserId));
        sb.append(',');
        sb.append("personalUserFirstName");
        sb.append('=');
        sb.append(((this.personalUserFirstName == null)?"<null>":this.personalUserFirstName));
        sb.append(',');
        sb.append("personalUserLastName");
        sb.append('=');
        sb.append(((this.personalUserLastName == null)?"<null>":this.personalUserLastName));
        sb.append(',');
        sb.append("personalUserAge");
        sb.append('=');
        sb.append(((this.personalUserAge == null)?"<null>":this.personalUserAge));
        sb.append(',');
        sb.append("personalUserHobbies");
        sb.append('=');
        sb.append(((this.personalUserHobbies == null)?"<null>":this.personalUserHobbies));
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
        result = ((result* 31)+((this.personalUserFirstName == null)? 0 :this.personalUserFirstName.hashCode()));
        result = ((result* 31)+((this.personalUserAge == null)? 0 :this.personalUserAge.hashCode()));
        result = ((result* 31)+((this.personalUserHobbies == null)? 0 :this.personalUserHobbies.hashCode()));
        result = ((result* 31)+((this.personalUserId == null)? 0 :this.personalUserId.hashCode()));
        result = ((result* 31)+((this.personalUserLastName == null)? 0 :this.personalUserLastName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonalUser) == false) {
            return false;
        }
        PersonalUser rhs = ((PersonalUser) other);
        return ((((((this.personalUserFirstName == rhs.personalUserFirstName)||((this.personalUserFirstName!= null)&&this.personalUserFirstName.equals(rhs.personalUserFirstName)))&&((this.personalUserAge == rhs.personalUserAge)||((this.personalUserAge!= null)&&this.personalUserAge.equals(rhs.personalUserAge))))&&((this.personalUserHobbies == rhs.personalUserHobbies)||((this.personalUserHobbies!= null)&&this.personalUserHobbies.equals(rhs.personalUserHobbies))))&&((this.personalUserId == rhs.personalUserId)||((this.personalUserId!= null)&&this.personalUserId.equals(rhs.personalUserId))))&&((this.personalUserLastName == rhs.personalUserLastName)||((this.personalUserLastName!= null)&&this.personalUserLastName.equals(rhs.personalUserLastName))));
    }

}
