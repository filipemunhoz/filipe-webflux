package com.filipe.filipewebflux.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.filipe.filipewebflux.model.response.ClimateItemsPOJO;

import reactor.core.publisher.Mono;

@RestController
public class WebClientClimateController {


	WebClient webclient;
	
	/** Call a Climate Application **/	
	@GetMapping(value = "/")
	public Mono<List<ClimateItemsPOJO>> test() {
		
		//return Mono.just("OKK");
		return WebClient.create().get()
				.uri("http://localhost:8080/")
				.accept(MediaType.APPLICATION_JSON)
				.retrieve()
				.bodyToFlux(ClimateItemsPOJO.class)
				.collectList()
				.log();
		
		
	}
	
}
