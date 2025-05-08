package com.example.camel.route;

import org.junit.After;
import org.junit.Test;
import org.junit.Before;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.junit5.CamelTestCase;
import org.apache.camel.test.junit5.TestComponent;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/*
@SpringBootApplication
@Import(SimpleRoute.class)
public class CamelApp { }

class SimpleRouteGeneratedAiTests extends CamelTestCase {

    @Override
    protected void configure() throws Exception {
        this.addRoutes(new RouteBuilder());
    }
    
    // GIVEN a new instance of the route builder with default configuration.
    @BeforeEach
    public void setUp() {
        super.setUp();
    }

    // WHEN we start Camel context and send an empty Exchange to it via timer component configured in SimpleRoute.
    @Test
    public void testTimerComponentReceivesEmptyExchangeAndLogsHelloMessage() throws Exception {
        given().willReturn(new MockEndpoint()).getProperty(CamelContext.NAME, this.camelContext);
        
        // GIVEN a new instance of Camel context with the route builder added to it. 
        RouteBuilder route = (RouteBuilder) getCamelContext();
        
        // WHEN we start the camel context.
        when(() -> {
            try { super.start(); } catch (Exception e) { throw new RuntimeException(e); }
        }).then().assertNotNull();

        given().when().routeId("foo").timer(java.time.Duration.ofSeconds(1)).to("mock:result");
        
        // THEN the mock endpoint receives an empty Exchange.
        then().getProperty(CamelContext.NAME, this.camelContext).hasSingleExchangeOfType(new MockEndpoint());
    }

}
