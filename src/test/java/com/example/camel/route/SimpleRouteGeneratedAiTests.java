package com.example.camel.route;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;

import org.springframework.boot.test.context.SpringBootTest;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.apache.camel.builder.RouteBuilder;
import static org.assertj.core.api.Assertions.*;


@SpringBootTest
public class SimpleRouteGeneratedAiTests extends CamelTestSupport {

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new SimpleRoute();
    }

    @Test
    void testRouteExecution() {
        getMockEndpoint("mock:result").expectedMessageCount(1);
        template.sendBody("timer:foo", "Hello");
        assertMockEndpointsSatisfied();
    }   
}