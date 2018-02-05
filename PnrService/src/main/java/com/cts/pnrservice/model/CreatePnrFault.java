package com.cts.pnrservice.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.cts.pnrservice.model.CreatePnrFaultDetail;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreatePnrFault
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-16T07:29:02.569Z")

public class CreatePnrFault   {
  @JsonProperty("faultcode")
  private String faultcode = null;

  @JsonProperty("faultstring")
  private String faultstring = null;

  @JsonProperty("faultactor")
  private String faultactor = null;

  @JsonProperty("detail")
  private CreatePnrFaultDetail detail = null;

  public CreatePnrFault faultcode(String faultcode) {
    this.faultcode = faultcode;
    return this;
  }

   /**
   * Get faultcode
   * @return faultcode
  **/
  @ApiModelProperty(value = "")


  public String getFaultcode() {
    return faultcode;
  }

  public void setFaultcode(String faultcode) {
    this.faultcode = faultcode;
  }

  public CreatePnrFault faultstring(String faultstring) {
    this.faultstring = faultstring;
    return this;
  }

   /**
   * Get faultstring
   * @return faultstring
  **/
  @ApiModelProperty(value = "")


  public String getFaultstring() {
    return faultstring;
  }

  public void setFaultstring(String faultstring) {
    this.faultstring = faultstring;
  }

  public CreatePnrFault faultactor(String faultactor) {
    this.faultactor = faultactor;
    return this;
  }

   /**
   * Get faultactor
   * @return faultactor
  **/
  @ApiModelProperty(value = "")


  public String getFaultactor() {
    return faultactor;
  }

  public void setFaultactor(String faultactor) {
    this.faultactor = faultactor;
  }

  public CreatePnrFault detail(CreatePnrFaultDetail detail) {
    this.detail = detail;
    return this;
  }

   /**
   * Get detail
   * @return detail
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CreatePnrFaultDetail getDetail() {
    return detail;
  }

  public void setDetail(CreatePnrFaultDetail detail) {
    this.detail = detail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePnrFault createPnrFault = (CreatePnrFault) o;
    return Objects.equals(this.faultcode, createPnrFault.faultcode) &&
        Objects.equals(this.faultstring, createPnrFault.faultstring) &&
        Objects.equals(this.faultactor, createPnrFault.faultactor) &&
        Objects.equals(this.detail, createPnrFault.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(faultcode, faultstring, faultactor, detail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePnrFault {\n");
    
    sb.append("    faultcode: ").append(toIndentedString(faultcode)).append("\n");
    sb.append("    faultstring: ").append(toIndentedString(faultstring)).append("\n");
    sb.append("    faultactor: ").append(toIndentedString(faultactor)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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

