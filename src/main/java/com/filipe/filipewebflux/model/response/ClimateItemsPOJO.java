package com.filipe.filipewebflux.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClimateItemsPOJO {
	
	private Integer id;	
	
	@JsonProperty("name")
	private String cityName;	

	//@JsonProperty("main")
    //private ClimateMainPojo temperature;	

}
