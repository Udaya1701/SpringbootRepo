package com.cts.pnrservice.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AdvisoryMessage
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-16T07:29:02.569Z")

public class AdvisoryMessage   {
  @JsonProperty("FreeformText")
  private String freeformText = null;

  public AdvisoryMessage freeformText(String freeformText) {
    this.freeformText = freeformText;
    return this;
  }

   /**
   * X[1..64]
   * @return freeformText
  **/
  @ApiModelProperty(value = "X[1..64]")


  public String getFreeformText() {
    return freeformText;
  }

  public void setFreeformText(String freeformText) {
    this.freeformText = freeformText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvisoryMessage advisoryMessage = (AdvisoryMessage) o;
    return Objects.equals(this.freeformText, advisoryMessage.freeformText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freeformText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvisoryMessage {\n");
    
    sb.append("    freeformText: ").append(toIndentedString(freeformText)).append("\n");
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

