package com.example.camel.route;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.After;
import org.junit.Test;
import org.junit.Before;

import org.mockito.Mockito;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.apache.camel.test.junit5.CamelTestSupport;

import org.springframework.beans.factory.annotation.Autowired;



class SimpleRouteGeneratedAiTests extends CamelTestSupport {

    @Autowired
    private SimpleRoute simpleRoute;

    @Override
    protected void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSimpleRoute() throws Exception {
        // GIVEN - A timer route is configured to fire every 1000 milliseconds
        // WHEN - The route executes
        // THEN - A log message "Hello Camel!" is printed
        getMockEndpoint("log:result").expectedMessageCount(1);
        template.sendBody("direct:start", "");
        assertMockEndpointsSatisfied();
        assertThat(getMandatoryLoggingRecord().getMessage()).isEqualTo("Hello Camel!");
    }
}