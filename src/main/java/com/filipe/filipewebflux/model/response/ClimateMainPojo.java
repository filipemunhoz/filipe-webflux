package com.filipe.filipewebflux.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClimateMainPojo {
	
    @JsonProperty("temp")
    private Integer degrees;

}
