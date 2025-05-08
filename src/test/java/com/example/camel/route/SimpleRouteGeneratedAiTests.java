package com.example.camel.route;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@Component
public class SimpleRouteGeneratedAiTests extends RouteBuilder {

    @Before
    public void setUp() throws Exception {
        super.configure();
    }

    @After
    public void tearDown() throws Exception {
        // Clean up after tests if necessary. For this example, there is no additional cleanup required.
    }

    @Test
    public void givenTimerTrigger_whenConfiguring_thenLogIsSentToMockEndpoint() throws Exception {
        mock("mock:result").when(() -> {}).thenReturn(new org.apache.camel.model.Message());

        try {
            super.configure();
        } finally {
            verify(mock("timer:foo?period=1000")).start();
        }

        assertThat(timerTriggered.get()).isFalse(); // THEN: The timer has not been triggered yet.
    }

    @Test
    public void givenTimerTrigger_whenConfiguring_thenLogIsSent() throws Exception {
        try {
            super.configure();
        } finally {
            verify(mock("timer:foo?period=1000")).start();
        }

        assertThat(timerTriggered.get()).isTrue(); // THEN: The timer has been triggered and the log message is sent to mock endpoint.
    }
}
