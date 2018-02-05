package com.cts.pnrservice.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SegmentInfoInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-16T07:29:02.569Z")

public class SegmentInfoInner   {
  @JsonProperty("ArrivalCode")
  private String arrivalCode = null;

  @JsonProperty("ArrivalPoint")
  private String arrivalPoint = null;

  @JsonProperty("ClassOfService")
  private String classOfService = null;

  @JsonProperty("Date")
  private String date = null;

  @JsonProperty("DeparturePoint")
  private String departurePoint = null;

  @JsonProperty("FlightNumber")
  private String flightNumber = null;

  public SegmentInfoInner arrivalCode(String arrivalCode) {
    this.arrivalCode = arrivalCode;
    return this;
  }

   /**
   * \"Y\" or \"N\"
   * @return arrivalCode
  **/
  @ApiModelProperty(value = "\"Y\" or \"N\"")


  public String getArrivalCode() {
    return arrivalCode;
  }

  public void setArrivalCode(String arrivalCode) {
    this.arrivalCode = arrivalCode;
  }

  public SegmentInfoInner arrivalPoint(String arrivalPoint) {
    this.arrivalPoint = arrivalPoint;
    return this;
  }

   /**
   * \"Y\" or \"N\"
   * @return arrivalPoint
  **/
  @ApiModelProperty(value = "\"Y\" or \"N\"")


  public String getArrivalPoint() {
    return arrivalPoint;
  }

  public void setArrivalPoint(String arrivalPoint) {
    this.arrivalPoint = arrivalPoint;
  }

  public SegmentInfoInner classOfService(String classOfService) {
    this.classOfService = classOfService;
    return this;
  }

   /**
   * \"Y\" or \"N\"
   * @return classOfService
  **/
  @ApiModelProperty(value = "\"Y\" or \"N\"")


  public String getClassOfService() {
    return classOfService;
  }

  public void setClassOfService(String classOfService) {
    this.classOfService = classOfService;
  }

  public SegmentInfoInner date(String date) {
    this.date = date;
    return this;
  }

   /**
   * \"Y\" or \"N\"
   * @return date
  **/
  @ApiModelProperty(value = "\"Y\" or \"N\"")


  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public SegmentInfoInner departurePoint(String departurePoint) {
    this.departurePoint = departurePoint;
    return this;
  }

   /**
   * \"Y\" or \"N\"
   * @return departurePoint
  **/
  @ApiModelProperty(value = "\"Y\" or \"N\"")


  public String getDeparturePoint() {
    return departurePoint;
  }

  public void setDeparturePoint(String departurePoint) {
    this.departurePoint = departurePoint;
  }

  public SegmentInfoInner flightNumber(String flightNumber) {
    this.flightNumber = flightNumber;
    return this;
  }

   /**
   * \"Y\" or \"N\"
   * @return flightNumber
  **/
  @ApiModelProperty(value = "\"Y\" or \"N\"")


  public String getFlightNumber() {
    return flightNumber;
  }

  public void setFlightNumber(String flightNumber) {
    this.flightNumber = flightNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentInfoInner segmentInfoInner = (SegmentInfoInner) o;
    return Objects.equals(this.arrivalCode, segmentInfoInner.arrivalCode) &&
        Objects.equals(this.arrivalPoint, segmentInfoInner.arrivalPoint) &&
        Objects.equals(this.classOfService, segmentInfoInner.classOfService) &&
        Objects.equals(this.date, segmentInfoInner.date) &&
        Objects.equals(this.departurePoint, segmentInfoInner.departurePoint) &&
        Objects.equals(this.flightNumber, segmentInfoInner.flightNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrivalCode, arrivalPoint, classOfService, date, departurePoint, flightNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentInfoInner {\n");
    
    sb.append("    arrivalCode: ").append(toIndentedString(arrivalCode)).append("\n");
    sb.append("    arrivalPoint: ").append(toIndentedString(arrivalPoint)).append("\n");
    sb.append("    classOfService: ").append(toIndentedString(classOfService)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    departurePoint: ").append(toIndentedString(departurePoint)).append("\n");
    sb.append("    flightNumber: ").append(toIndentedString(flightNumber)).append("\n");
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

