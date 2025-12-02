package com.example.camel;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.springframework.boot.SpringApplication;

    @Test
    public void testMain() {
        String[] args = {};
        CamelApplication.main(args);
        assertThat(SpringApplication.getRunListeners()).isNotEmpty();
    }
}