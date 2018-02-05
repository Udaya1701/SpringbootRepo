package com.cts.pnrservice.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FaultDetailedInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-16T07:29:02.569Z")

public class FaultDetailedInfo   {
  @JsonProperty("AdditionalInfo")
  private String additionalInfo = null;

  @JsonProperty("ErrorCode")
  private String errorCode = null;

  @JsonProperty("ErrorMessage")
  private String errorMessage = null;

  @JsonProperty("StackTraceInfo")
  private String stackTraceInfo = null;

  public FaultDetailedInfo additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

   /**
   * information such as backend request, timings, etc --      anything that would be helpful in determining the      cause of the error
   * @return additionalInfo
  **/
  @ApiModelProperty(value = "information such as backend request, timings, etc --      anything that would be helpful in determining the      cause of the error")


  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public FaultDetailedInfo errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * If there is no error code (from backend or      middleware) then leave blank
   * @return errorCode
  **/
  @ApiModelProperty(value = "If there is no error code (from backend or      middleware) then leave blank")


  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public FaultDetailedInfo errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Error Message - e.g: invalid arguments
   * @return errorMessage
  **/
  @ApiModelProperty(value = "Error Message - e.g: invalid arguments")


  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public FaultDetailedInfo stackTraceInfo(String stackTraceInfo) {
    this.stackTraceInfo = stackTraceInfo;
    return this;
  }

   /**
   * Error StackTrace
   * @return stackTraceInfo
  **/
  @ApiModelProperty(value = "Error StackTrace")


  public String getStackTraceInfo() {
    return stackTraceInfo;
  }

  public void setStackTraceInfo(String stackTraceInfo) {
    this.stackTraceInfo = stackTraceInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaultDetailedInfo faultDetailedInfo = (FaultDetailedInfo) o;
    return Objects.equals(this.additionalInfo, faultDetailedInfo.additionalInfo) &&
        Objects.equals(this.errorCode, faultDetailedInfo.errorCode) &&
        Objects.equals(this.errorMessage, faultDetailedInfo.errorMessage) &&
        Objects.equals(this.stackTraceInfo, faultDetailedInfo.stackTraceInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfo, errorCode, errorMessage, stackTraceInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaultDetailedInfo {\n");
    
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    stackTraceInfo: ").append(toIndentedString(stackTraceInfo)).append("\n");
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

