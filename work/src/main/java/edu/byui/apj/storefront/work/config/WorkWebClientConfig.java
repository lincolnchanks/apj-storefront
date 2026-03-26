package edu.byui.apj.storefront.work.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WorkWebClientConfig {

    // This @Value matches db.service.base-url, and thus it can be
    // configured in application.properties as db.service.base-url
    @Value("${db.service.base-url}")
    private String dbServiceBaseUrl;

    // Builds and returns a new WebClient object, which is a Bean
    // and therefore is an object created and handled by Spring
    // (possibly through the builder().baseUrl().build(); code).
    @Bean
    public WebClient dbServiceClient(){
        return WebClient.builder()
                .baseUrl(dbServiceBaseUrl)
                .build();
    }

}
