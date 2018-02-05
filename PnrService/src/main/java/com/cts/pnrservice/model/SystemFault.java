package com.cts.pnrservice.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.cts.pnrservice.model.FaultDetailedInfo;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SystemFault
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-16T07:29:02.569Z")

public class SystemFault   {
  @JsonProperty("FaultDetailedInfo")
  private FaultDetailedInfo faultDetailedInfo = null;

  public SystemFault faultDetailedInfo(FaultDetailedInfo faultDetailedInfo) {
    this.faultDetailedInfo = faultDetailedInfo;
    return this;
  }

   /**
   * Get faultDetailedInfo
   * @return faultDetailedInfo
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public FaultDetailedInfo getFaultDetailedInfo() {
    return faultDetailedInfo;
  }

  public void setFaultDetailedInfo(FaultDetailedInfo faultDetailedInfo) {
    this.faultDetailedInfo = faultDetailedInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemFault systemFault = (SystemFault) o;
    return Objects.equals(this.faultDetailedInfo, systemFault.faultDetailedInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(faultDetailedInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemFault {\n");
    
    sb.append("    faultDetailedInfo: ").append(toIndentedString(faultDetailedInfo)).append("\n");
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

