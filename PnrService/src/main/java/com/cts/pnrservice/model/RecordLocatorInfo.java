package com.cts.pnrservice.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RecordLocatorInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-16T07:29:02.569Z")

public class RecordLocatorInfo   {
  @JsonProperty("PnrNo")
  private String pnrNo = null;

  public RecordLocatorInfo pnrNo(String pnrNo) {
    this.pnrNo = pnrNo;
    return this;
  }

   /**
   * Get pnrNo
   * @return pnrNo
  **/
  @ApiModelProperty(value = "")


  public String getPnrNo() {
    return pnrNo;
  }

  public void setPnrNo(String pnrNo) {
    this.pnrNo = pnrNo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordLocatorInfo recordLocatorInfo = (RecordLocatorInfo) o;
    return Objects.equals(this.pnrNo, recordLocatorInfo.pnrNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pnrNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordLocatorInfo {\n");
    
    sb.append("    pnrNo: ").append(toIndentedString(pnrNo)).append("\n");
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

