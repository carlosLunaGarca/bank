package com.prueba.bank.Models;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "value",
        "nameBank",
        "status",
        "dues",
        "id"
})
@Generated("jsonschema2pojo")
public class ResponseDebtforBank {

    @JsonProperty("value")
    private Integer value;
    @JsonProperty("nameBank")
    private String nameBank;
    @JsonProperty("status")
    private Boolean status;
    @JsonProperty("dues")
    private Integer dues;
    @JsonProperty("id")
    private Integer id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("value")
    public Integer getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Integer value) {
        this.value = value;
    }

    @JsonProperty("nameBank")
    public String getNameBank() {
        return nameBank;
    }

    @JsonProperty("nameBank")
    public void setNameBank(String nameBank) {
        this.nameBank = nameBank;
    }

    @JsonProperty("status")
    public Boolean getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Boolean status) {
        this.status = status;
    }
    @JsonProperty("dues")
    public Integer getDues() {
        return dues;
    }

    @JsonProperty("dues")
    public void setDues(Integer dues) {
        this.dues = dues;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}