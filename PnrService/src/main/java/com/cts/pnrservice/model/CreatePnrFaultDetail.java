package com.cts.pnrservice.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.cts.pnrservice.model.BusinessFault;
import com.cts.pnrservice.model.SystemFault;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreatePnrFaultDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-16T07:29:02.569Z")

public class CreatePnrFaultDetail   {
  @JsonProperty("businessFault")
  private BusinessFault businessFault = null;

  @JsonProperty("systemFault")
  private SystemFault systemFault = null;

  public CreatePnrFaultDetail businessFault(BusinessFault businessFault) {
    this.businessFault = businessFault;
    return this;
  }

   /**
   * Get businessFault
   * @return businessFault
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BusinessFault getBusinessFault() {
    return businessFault;
  }

  public void setBusinessFault(BusinessFault businessFault) {
    this.businessFault = businessFault;
  }

  public CreatePnrFaultDetail systemFault(SystemFault systemFault) {
    this.systemFault = systemFault;
    return this;
  }

   /**
   * Get systemFault
   * @return systemFault
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SystemFault getSystemFault() {
    return systemFault;
  }

  public void setSystemFault(SystemFault systemFault) {
    this.systemFault = systemFault;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePnrFaultDetail createPnrFaultDetail = (CreatePnrFaultDetail) o;
    return Objects.equals(this.businessFault, createPnrFaultDetail.businessFault) &&
        Objects.equals(this.systemFault, createPnrFaultDetail.systemFault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessFault, systemFault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePnrFaultDetail {\n");
    
    sb.append("    businessFault: ").append(toIndentedString(businessFault)).append("\n");
    sb.append("    systemFault: ").append(toIndentedString(systemFault)).append("\n");
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

