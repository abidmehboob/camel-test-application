package com.example.camel.route;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.After;
import org.junit.Test;
import org.junit.Before;

import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import org.apache.camel.test.junit5.CamelTestSupport;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SimpleRouteGeneratedAiTests extends CamelTestSupport {

    @Override
    void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSimpleRoute() throws Exception {
        // GIVEN - A timer route is configured with a period of 1000 milliseconds
        // WHEN - The route executes
        // THEN - "Hello Camel!" is logged to the console
        assertLogReceived("Hello Camel!");
    }
}