package com.example.camel.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SimpleRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:foo?period=1000")
                .log("Hello Camel!");
    }
}