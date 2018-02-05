package com.cts.pnrservice.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.cts.pnrservice.model.AdvisoryMessage;
import com.cts.pnrservice.model.RecordLocatorInfo;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreatePnrResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-16T07:29:02.569Z")

public class CreatePnrResponse   {
  @JsonProperty("PassengerInfo")
  private RecordLocatorInfo passengerInfo = null;

  @JsonProperty("AdvisoryMessage")
  private AdvisoryMessage advisoryMessage = null;

  public CreatePnrResponse passengerInfo(RecordLocatorInfo passengerInfo) {
    this.passengerInfo = passengerInfo;
    return this;
  }

   /**
   * Get passengerInfo
   * @return passengerInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RecordLocatorInfo getPassengerInfo() {
    return passengerInfo;
  }

  public void setPassengerInfo(RecordLocatorInfo passengerInfo) {
    this.passengerInfo = passengerInfo;
  }

  public CreatePnrResponse advisoryMessage(AdvisoryMessage advisoryMessage) {
    this.advisoryMessage = advisoryMessage;
    return this;
  }

   /**
   * Get advisoryMessage
   * @return advisoryMessage
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AdvisoryMessage getAdvisoryMessage() {
    return advisoryMessage;
  }

  public void setAdvisoryMessage(AdvisoryMessage advisoryMessage) {
    this.advisoryMessage = advisoryMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePnrResponse createPnrResponse = (CreatePnrResponse) o;
    return Objects.equals(this.passengerInfo, createPnrResponse.passengerInfo) &&
        Objects.equals(this.advisoryMessage, createPnrResponse.advisoryMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passengerInfo, advisoryMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePnrResponse {\n");
    
    sb.append("    passengerInfo: ").append(toIndentedString(passengerInfo)).append("\n");
    sb.append("    advisoryMessage: ").append(toIndentedString(advisoryMessage)).append("\n");
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

