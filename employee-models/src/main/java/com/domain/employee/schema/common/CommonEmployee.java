
package com.domain.employee.schema.common;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;


/**
 * CommonEmployee
 * <p>
 * Base definition for an employee
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "email",
    "phone",
    "dateOfJoining",
    "department",
    "status"
})
public class CommonEmployee {

    /**
     * CommonEmployeeId
     * <p>
     * Unique ID for the employee
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Unique ID for the employee")
    @NotNull
    private String id;
    /**
     * EmployeeName
     * <p>
     * Name of the employee
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the employee")
    @NotNull
    private String name;
    /**
     * EmployeeEmail
     * <p>
     * Email of the employee
     * (Required)
     * 
     */
    @Email
    @JsonProperty("email")
    @JsonPropertyDescription("Email of the employee")
    @NotNull
    private String email;
    /**
     * EmployeePhone
     * <p>
     * Phone number of the employee
     * 
     */
    @JsonProperty("phone")
    @JsonPropertyDescription("Phone number of the employee")
    private String phone;
    /**
     * DateOfJoining
     * <p>
     * Date of joining for the employee
     * 
     */
    @JsonProperty("dateOfJoining")
    @JsonPropertyDescription("Date of joining for the employee")
    private LocalDate dateOfJoining;
    /**
     * Department
     * <p>
     * Department of the employee
     * 
     */
    @JsonProperty("department")
    @JsonPropertyDescription("Department of the employee")
    private String department;
    /**
     * Status
     * <p>
     * Status of the employee
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Status of the employee")
    private CommonEmployee.Status status;

    /**
     * CommonEmployeeId
     * <p>
     * Unique ID for the employee
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * CommonEmployeeId
     * <p>
     * Unique ID for the employee
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * EmployeeName
     * <p>
     * Name of the employee
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * EmployeeName
     * <p>
     * Name of the employee
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * EmployeeEmail
     * <p>
     * Email of the employee
     * (Required)
     * 
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * EmployeeEmail
     * <p>
     * Email of the employee
     * (Required)
     * 
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * EmployeePhone
     * <p>
     * Phone number of the employee
     * 
     */
    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    /**
     * EmployeePhone
     * <p>
     * Phone number of the employee
     * 
     */
    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * DateOfJoining
     * <p>
     * Date of joining for the employee
     * 
     */
    @JsonProperty("dateOfJoining")
    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    /**
     * DateOfJoining
     * <p>
     * Date of joining for the employee
     * 
     */
    @JsonProperty("dateOfJoining")
    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    /**
     * Department
     * <p>
     * Department of the employee
     * 
     */
    @JsonProperty("department")
    public String getDepartment() {
        return department;
    }

    /**
     * Department
     * <p>
     * Department of the employee
     * 
     */
    @JsonProperty("department")
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Status
     * <p>
     * Status of the employee
     * 
     */
    @JsonProperty("status")
    public CommonEmployee.Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * Status of the employee
     * 
     */
    @JsonProperty("status")
    public void setStatus(CommonEmployee.Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CommonEmployee.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("phone");
        sb.append('=');
        sb.append(((this.phone == null)?"<null>":this.phone));
        sb.append(',');
        sb.append("dateOfJoining");
        sb.append('=');
        sb.append(((this.dateOfJoining == null)?"<null>":this.dateOfJoining));
        sb.append(',');
        sb.append("department");
        sb.append('=');
        sb.append(((this.department == null)?"<null>":this.department));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
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
        result = ((result* 31)+((this.dateOfJoining == null)? 0 :this.dateOfJoining.hashCode()));
        result = ((result* 31)+((this.phone == null)? 0 :this.phone.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.department == null)? 0 :this.department.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CommonEmployee) == false) {
            return false;
        }
        CommonEmployee rhs = ((CommonEmployee) other);
        return ((((((((this.dateOfJoining == rhs.dateOfJoining)||((this.dateOfJoining!= null)&&this.dateOfJoining.equals(rhs.dateOfJoining)))&&((this.phone == rhs.phone)||((this.phone!= null)&&this.phone.equals(rhs.phone))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.department == rhs.department)||((this.department!= null)&&this.department.equals(rhs.department))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * Status
     * <p>
     * Status of the employee
     * 
     */
    public enum Status {

        ACTIVE("ACTIVE"),
        INACTIVE("INACTIVE"),
        ON_LEAVE("ON_LEAVE");
        private final String value;
        private final static Map<String, CommonEmployee.Status> CONSTANTS = new HashMap<String, CommonEmployee.Status>();

        static {
            for (CommonEmployee.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Status(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static CommonEmployee.Status fromValue(String value) {
            CommonEmployee.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
