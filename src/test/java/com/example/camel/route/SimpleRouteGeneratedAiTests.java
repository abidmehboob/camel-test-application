package com.example.camel.route;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.mockito.Mockito.mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;
import org.mockito.Mock;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SimpleRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:foo?period=1000")
                .log("Hello Camel!");
    }

    public org.apache.camel.model.Routes getRoutes() {
        return this.getRouteBuilder().createRouteDefinition();
    }
}
