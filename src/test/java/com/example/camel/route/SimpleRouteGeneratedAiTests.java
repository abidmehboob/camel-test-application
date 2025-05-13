package com.example.camel.route;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import static org.apache.camel.builder.RouteBuilder.FactoryRouteBuilderConstants.ENDPOINT;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.concurrent.atomic.AtomicReference;

import javax.inject.Inject;

import org.apache.camel.CamelContext;
import org.apache.camel.ExchangePattern;
import org.apache.camel.Processor;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.mockito.Mockito.when;

@SpringBootApplication
public class SimpleRoute extends SpringBootApplication {
    public static void main(String[] args) throws Exception { SpringApplication.run(SimpleRoute.class, args); }
}

@Component
class RouteBuilderFactory {

    @Bean
    protected AtomicReference<Processor> processor() {
        return new AtomicReference<>(new Processor() {
            private String result = null;

            @Override
            public Exchange process(Exchange exchange) throws Exception {
                if (exchange.getIn().getBody(String.class).equals("Hello Camel!")) {
                    this.result = "Processed: Hello Camel!\n";
                }
                return exchange;
            }

            protected void setResult(final String result) { this.result = result; }
        });
    }
}

@Component
class SimpleRoute extends RouteBuilderFactory {

    @Override
    public void configure() throws Exception {
        from(ENDPOINT).process(processor().get());
        to("mock:result").log();
    }

}
