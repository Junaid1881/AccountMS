package ibm.ob.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import ibm.ob.api.model.LinksPaginated;
import ibm.ob.api.model.MetaPaginated;
import ibm.ob.api.model.ResponseBankingDirectDebitAuthorisationListData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseBankingDirectDebitAuthorisationList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-10-28T18:56:50.835Z[GMT]")

public class ResponseBankingDirectDebitAuthorisationList   {
  @JsonProperty("data")
  private ResponseBankingDirectDebitAuthorisationListData data = null;

  @JsonProperty("links")
  private LinksPaginated links = null;

  @JsonProperty("meta")
  private MetaPaginated meta = null;

  public ResponseBankingDirectDebitAuthorisationList data(ResponseBankingDirectDebitAuthorisationListData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public ResponseBankingDirectDebitAuthorisationListData getData() {
    return data;
  }

  public void setData(ResponseBankingDirectDebitAuthorisationListData data) {
    this.data = data;
  }

  public ResponseBankingDirectDebitAuthorisationList links(LinksPaginated links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public LinksPaginated getLinks() {
    return links;
  }

  public void setLinks(LinksPaginated links) {
    this.links = links;
  }

  public ResponseBankingDirectDebitAuthorisationList meta(MetaPaginated meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public MetaPaginated getMeta() {
    return meta;
  }

  public void setMeta(MetaPaginated meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseBankingDirectDebitAuthorisationList responseBankingDirectDebitAuthorisationList = (ResponseBankingDirectDebitAuthorisationList) o;
    return Objects.equals(this.data, responseBankingDirectDebitAuthorisationList.data) &&
        Objects.equals(this.links, responseBankingDirectDebitAuthorisationList.links) &&
        Objects.equals(this.meta, responseBankingDirectDebitAuthorisationList.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseBankingDirectDebitAuthorisationList {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

