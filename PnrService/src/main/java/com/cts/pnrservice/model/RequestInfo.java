package com.cts.pnrservice.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-16T07:29:02.569Z")

public class RequestInfo   {
  @JsonProperty("AppChannelName")
  private String appChannelName = null;

  @JsonProperty("ApplicationId")
  private String applicationId = null;

  public RequestInfo appChannelName(String appChannelName) {
    this.appChannelName = appChannelName;
    return this;
  }

   /**
   * The name of the channel from which the request is      originating, e.g. kiosk, delta.com, etc.
   * @return appChannelName
  **/
  @ApiModelProperty(value = "The name of the channel from which the request is      originating, e.g. kiosk, delta.com, etc.")


  public String getAppChannelName() {
    return appChannelName;
  }

  public void setAppChannelName(String appChannelName) {
    this.appChannelName = appChannelName;
  }

  public RequestInfo applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

   /**
   * Each client should have a unique identifier. This is      defined by Worldspan.
   * @return applicationId
  **/
  @ApiModelProperty(value = "Each client should have a unique identifier. This is      defined by Worldspan.")


  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestInfo requestInfo = (RequestInfo) o;
    return Objects.equals(this.appChannelName, requestInfo.appChannelName) &&
        Objects.equals(this.applicationId, requestInfo.applicationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appChannelName, applicationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestInfo {\n");
    
    sb.append("    appChannelName: ").append(toIndentedString(appChannelName)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
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

