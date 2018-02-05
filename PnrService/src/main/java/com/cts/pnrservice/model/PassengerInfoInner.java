package com.cts.pnrservice.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PassengerInfoInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-16T07:29:02.569Z")

public class PassengerInfoInner   {
  @JsonProperty("CustomerId")
  private String customerId = null;

  @JsonProperty("FirstName")
  private String firstName = null;

  @JsonProperty("LastName")
  private String lastName = null;

  @JsonProperty("PhoneNumber")
  private String phoneNumber = null;

  public PassengerInfoInner customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * \"Y\" or \"N\"
   * @return customerId
  **/
  @ApiModelProperty(value = "\"Y\" or \"N\"")


  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public PassengerInfoInner firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * \"Y\" or \"N\"
   * @return firstName
  **/
  @ApiModelProperty(value = "\"Y\" or \"N\"")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public PassengerInfoInner lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * \"Y\" or \"N\"
   * @return lastName
  **/
  @ApiModelProperty(value = "\"Y\" or \"N\"")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public PassengerInfoInner phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * \"Y\" or \"N\"
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "\"Y\" or \"N\"")


  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PassengerInfoInner passengerInfoInner = (PassengerInfoInner) o;
    return Objects.equals(this.customerId, passengerInfoInner.customerId) &&
        Objects.equals(this.firstName, passengerInfoInner.firstName) &&
        Objects.equals(this.lastName, passengerInfoInner.lastName) &&
        Objects.equals(this.phoneNumber, passengerInfoInner.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, firstName, lastName, phoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PassengerInfoInner {\n");
    
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

