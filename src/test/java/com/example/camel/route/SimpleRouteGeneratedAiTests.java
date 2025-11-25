package com.example.camel.route;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.apache.camel.test.junit5.CamelTestSupport;


public class SimpleRouteGeneratedAiTests extends CamelTestSupport {

    @Override
    protected void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSimpleRoute() throws Exception {
        // GIVEN - A timer route configured with a period of 1000 milliseconds
        // WHEN - The route executes
        // THEN - "Hello Camel!" is logged to the console
        assertMockEndpointsSatisfied();
        assertThat(getMandatoryProcessor("log:Hello Camel!")).hasExactlyOneExchange();
    }
}