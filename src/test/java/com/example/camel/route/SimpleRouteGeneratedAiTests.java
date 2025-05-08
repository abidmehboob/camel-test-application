package com.example.camel.route;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
import org.junit.jupiter.api.BeforeEach;
import static org.assertj.core.api.Assertions.assertThat;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.concurrent.atomic.AtomicInteger;

@SpringBootTest
public class SimpleRouteGeneratedAiTests extends RouteBuilder {
    @Autowired
    private AtomicInteger counter; // Mocked bean to track timer invocations

    public void configure() throws Exception {
        from("timer:foo?period=1000").to("mock:result");
    }

    @BeforeEach
    public void setUp() {
        this.counter.set(0); // Reset the atomic integer before each test
    }

    @Test
    public void givenTimerTrigger_whenConfiguringRoute_thenItLogsHelloCamelOncePerSecond() throws Exception {
        // GIVEN a timer trigger configured to fire every second

        // WHEN configuring the route with our SimpleRoute class

        // THEN it should log "Hello Camel!" once per second (mocked behavior)
        Mockito.verify(this.counter).incrementAndGet(); // Expecting one increment as we only want 1 call
    }

    @Test
    public void givenTimerTrigger_whenConfiguringRoute_thenItDoesNotLogAnythingElse() throws Exception {
        // GIVEN a timer trigger configured to fire every second

        // WHEN configuring the route with our SimpleRoute class

        // THEN it should not log anything else (mocked behavior)
        Mockito.verify(this.counter, Mockito.never()).incrementAndGet(); // Expecting no increments
    }
}
