
package com.domain.user.schema.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.NotNull;


/**
 * CommonUser
 * <p>
 * General definition schema of a User
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "userId",
    "userFirstName",
    "userLastName",
    "userAge"
})
public class CommonUser {

    /**
     * CommonUserId
     * <p>
     * Identifier for a common user
     * (Required)
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Identifier for a common user")
    @NotNull
    private String userId;
    /**
     * UserFirstName
     * <p>
     * First name for the common user
     * (Required)
     * 
     */
    @JsonProperty("userFirstName")
    @JsonPropertyDescription("First name for the common user")
    @NotNull
    private String userFirstName;
    /**
     * UserLastName
     * <p>
     * Last name for the common user
     * (Required)
     * 
     */
    @JsonProperty("userLastName")
    @JsonPropertyDescription("Last name for the common user")
    @NotNull
    private String userLastName;
    /**
     * UserAge
     * <p>
     * Age of the common user
     * 
     */
    @JsonProperty("userAge")
    @JsonPropertyDescription("Age of the common user")
    private Integer userAge;

    /**
     * CommonUserId
     * <p>
     * Identifier for a common user
     * (Required)
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * CommonUserId
     * <p>
     * Identifier for a common user
     * (Required)
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * UserFirstName
     * <p>
     * First name for the common user
     * (Required)
     * 
     */
    @JsonProperty("userFirstName")
    public String getUserFirstName() {
        return userFirstName;
    }

    /**
     * UserFirstName
     * <p>
     * First name for the common user
     * (Required)
     * 
     */
    @JsonProperty("userFirstName")
    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    /**
     * UserLastName
     * <p>
     * Last name for the common user
     * (Required)
     * 
     */
    @JsonProperty("userLastName")
    public String getUserLastName() {
        return userLastName;
    }

    /**
     * UserLastName
     * <p>
     * Last name for the common user
     * (Required)
     * 
     */
    @JsonProperty("userLastName")
    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    /**
     * UserAge
     * <p>
     * Age of the common user
     * 
     */
    @JsonProperty("userAge")
    public Integer getUserAge() {
        return userAge;
    }

    /**
     * UserAge
     * <p>
     * Age of the common user
     * 
     */
    @JsonProperty("userAge")
    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CommonUser.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("userFirstName");
        sb.append('=');
        sb.append(((this.userFirstName == null)?"<null>":this.userFirstName));
        sb.append(',');
        sb.append("userLastName");
        sb.append('=');
        sb.append(((this.userLastName == null)?"<null>":this.userLastName));
        sb.append(',');
        sb.append("userAge");
        sb.append('=');
        sb.append(((this.userAge == null)?"<null>":this.userAge));
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
        result = ((result* 31)+((this.userFirstName == null)? 0 :this.userFirstName.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.userLastName == null)? 0 :this.userLastName.hashCode()));
        result = ((result* 31)+((this.userAge == null)? 0 :this.userAge.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CommonUser) == false) {
            return false;
        }
        CommonUser rhs = ((CommonUser) other);
        return (((((this.userFirstName == rhs.userFirstName)||((this.userFirstName!= null)&&this.userFirstName.equals(rhs.userFirstName)))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.userLastName == rhs.userLastName)||((this.userLastName!= null)&&this.userLastName.equals(rhs.userLastName))))&&((this.userAge == rhs.userAge)||((this.userAge!= null)&&this.userAge.equals(rhs.userAge))));
    }

}
