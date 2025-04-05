
package com.domain.user.schema.commercial;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.NotNull;


/**
 * CommercialUserAddress
 * <p>
 * Address schema definition of a commercial user
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "houseNo",
    "street",
    "city",
    "state",
    "zipCode"
})
public class CommercialUserAddress {

    /**
     * HouseNumber
     * <p>
     * House number for the commercial user
     * (Required)
     * 
     */
    @JsonProperty("houseNo")
    @JsonPropertyDescription("House number for the commercial user")
    @NotNull
    private String houseNo;
    /**
     * Street
     * <p>
     * Street info for the commercial user
     * (Required)
     * 
     */
    @JsonProperty("street")
    @JsonPropertyDescription("Street info for the commercial user")
    @NotNull
    private String street;
    /**
     * City
     * <p>
     * City info for the commercial user
     * (Required)
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("City info for the commercial user")
    @NotNull
    private String city;
    /**
     * State
     * <p>
     * State info for the commercial user
     * (Required)
     * 
     */
    @JsonProperty("state")
    @JsonPropertyDescription("State info for the commercial user")
    @NotNull
    private String state;
    /**
     * ZipCode
     * <p>
     * Zip code info for the commercial user
     * (Required)
     * 
     */
    @JsonProperty("zipCode")
    @JsonPropertyDescription("Zip code info for the commercial user")
    @NotNull
    private String zipCode;

    /**
     * HouseNumber
     * <p>
     * House number for the commercial user
     * (Required)
     * 
     */
    @JsonProperty("houseNo")
    public String getHouseNo() {
        return houseNo;
    }

    /**
     * HouseNumber
     * <p>
     * House number for the commercial user
     * (Required)
     * 
     */
    @JsonProperty("houseNo")
    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    /**
     * Street
     * <p>
     * Street info for the commercial user
     * (Required)
     * 
     */
    @JsonProperty("street")
    public String getStreet() {
        return street;
    }

    /**
     * Street
     * <p>
     * Street info for the commercial user
     * (Required)
     * 
     */
    @JsonProperty("street")
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * City
     * <p>
     * City info for the commercial user
     * (Required)
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * City
     * <p>
     * City info for the commercial user
     * (Required)
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * State
     * <p>
     * State info for the commercial user
     * (Required)
     * 
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * State
     * <p>
     * State info for the commercial user
     * (Required)
     * 
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * ZipCode
     * <p>
     * Zip code info for the commercial user
     * (Required)
     * 
     */
    @JsonProperty("zipCode")
    public String getZipCode() {
        return zipCode;
    }

    /**
     * ZipCode
     * <p>
     * Zip code info for the commercial user
     * (Required)
     * 
     */
    @JsonProperty("zipCode")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CommercialUserAddress.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("houseNo");
        sb.append('=');
        sb.append(((this.houseNo == null)?"<null>":this.houseNo));
        sb.append(',');
        sb.append("street");
        sb.append('=');
        sb.append(((this.street == null)?"<null>":this.street));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("zipCode");
        sb.append('=');
        sb.append(((this.zipCode == null)?"<null>":this.zipCode));
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
        result = ((result* 31)+((this.houseNo == null)? 0 :this.houseNo.hashCode()));
        result = ((result* 31)+((this.zipCode == null)? 0 :this.zipCode.hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.street == null)? 0 :this.street.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CommercialUserAddress) == false) {
            return false;
        }
        CommercialUserAddress rhs = ((CommercialUserAddress) other);
        return ((((((this.houseNo == rhs.houseNo)||((this.houseNo!= null)&&this.houseNo.equals(rhs.houseNo)))&&((this.zipCode == rhs.zipCode)||((this.zipCode!= null)&&this.zipCode.equals(rhs.zipCode))))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.street == rhs.street)||((this.street!= null)&&this.street.equals(rhs.street))));
    }

}
