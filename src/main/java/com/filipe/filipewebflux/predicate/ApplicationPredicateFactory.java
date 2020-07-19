package com.filipe.filipewebflux.predicate;

import java.util.function.Predicate;

import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.cloud.gateway.handler.predicate.GatewayPredicate;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ServerWebExchange;

import com.filipe.filipewebflux.configuration.AppConfigurationProperties;
import com.filipe.filipewebflux.configuration.AppConfigurationProperties.ApiProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ApplicationPredicateFactory extends AbstractRoutePredicateFactory<ApplicationPredicateFactory.Config>{

	private AppConfigurationProperties appConfigurationProperties;
	
	public ApplicationPredicateFactory(AppConfigurationProperties appConfigurationProperties) {
		super(Config.class);
		this.appConfigurationProperties = appConfigurationProperties;
	}

	@Override
	public Predicate<ServerWebExchange> apply(Config config) {
		
		return new GatewayPredicate() {			
			@Override
			public boolean test(ServerWebExchange exchange) {
				
				log.info("##### ApplicationPredicateFactory #####");
				
				
				exchange.getRequest().getHeaders().containsKey("X-name-Id");

				
				ApiProperties api = appConfigurationProperties.getApiPropertiesById("APiName");
				
				if(api.getEndpointService() == "xpto") {
					//execute action
				}
				
				return false;
			}
		};
	}


	public static class Config {
		
		@Getter
		@Setter
		private Boolean isValid;
	}
}
