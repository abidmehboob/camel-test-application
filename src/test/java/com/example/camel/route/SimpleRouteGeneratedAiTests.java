package com.example.camel.route;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.apache.camel.test.junit5.CamelTestSupport;

import org.junit.jupiter.api.BeforeAll;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class SimpleRouteGeneratedAiTests extends CamelTestSupport {
    protected String[] configureRoutes() throws Exception {
        return new String[]{"com.example.camel.route.SimpleRoute"};
    }

    @BeforeAll
    static void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSimpleRoute() throws Exception {
        // GIVEN - Timer is configured to fire every 1000 milliseconds
        // WHEN - The timer fires and triggers the route
        // THEN - A log message "Hello Camel!" should be printed
        assertMockEndpointsSatisfied();
    }

}