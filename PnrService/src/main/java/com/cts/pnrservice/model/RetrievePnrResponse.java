package com.cts.pnrservice.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.cts.pnrservice.model.PassengerInfo;
import com.cts.pnrservice.model.SegmentInfo;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrievePnrResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-16T07:29:02.569Z")

public class RetrievePnrResponse   {
  @JsonProperty("SegmentInfo")
  private SegmentInfo segmentInfo = null;

  @JsonProperty("PassengerInfo")
  private PassengerInfo passengerInfo = null;

  public RetrievePnrResponse segmentInfo(SegmentInfo segmentInfo) {
    this.segmentInfo = segmentInfo;
    return this;
  }

   /**
   * Get segmentInfo
   * @return segmentInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SegmentInfo getSegmentInfo() {
    return segmentInfo;
  }

  public void setSegmentInfo(SegmentInfo segmentInfo) {
    this.segmentInfo = segmentInfo;
  }

  public RetrievePnrResponse passengerInfo(PassengerInfo passengerInfo) {
    this.passengerInfo = passengerInfo;
    return this;
  }

   /**
   * Get passengerInfo
   * @return passengerInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PassengerInfo getPassengerInfo() {
    return passengerInfo;
  }

  public void setPassengerInfo(PassengerInfo passengerInfo) {
    this.passengerInfo = passengerInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrievePnrResponse retrievePnrResponse = (RetrievePnrResponse) o;
    return Objects.equals(this.segmentInfo, retrievePnrResponse.segmentInfo) &&
        Objects.equals(this.passengerInfo, retrievePnrResponse.passengerInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segmentInfo, passengerInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrievePnrResponse {\n");
    
    sb.append("    segmentInfo: ").append(toIndentedString(segmentInfo)).append("\n");
    sb.append("    passengerInfo: ").append(toIndentedString(passengerInfo)).append("\n");
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

