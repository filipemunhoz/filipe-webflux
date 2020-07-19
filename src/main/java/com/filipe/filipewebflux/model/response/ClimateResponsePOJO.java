package com.filipe.filipewebflux.model.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClimateResponsePOJO {
	
	private List<ClimateItemsPOJO> items;
	
}
