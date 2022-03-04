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
        "idClient",
        "idBank"
})
@Generated("jsonschema2pojo")
public class RequestListDebts {

    @JsonProperty("idClient")
    private Integer idClient;
    @JsonProperty("idBank")
    private Integer idBank;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("idClient")
    public Integer getIdClient() {
        return idClient;
    }

    @JsonProperty("idClient")
    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    @JsonProperty("idBank")
    public Integer getIdBank() {
        return idBank;
    }

    @JsonProperty("idBank")
    public void setIdBank(Integer idBank) {
        this.idBank = idBank;
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