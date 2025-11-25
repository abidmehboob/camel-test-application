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

    private  org.apache.camel.builder.RouteBuilder routeBuilder;

    @InjectMocks
    SimpleRoute simpleRoute;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testConfigure() throws Exception {
        // GIVEN - Setup the context
        // WHEN - Execute the method under test
        simpleRoute.configure();
        // THEN - Assert the expected outcome
        assertThat(simpleRoute.routeBuilder).isNotNull();
    }
}
