package com.github.kadehar.tests;

import com.github.kadehar.config.api.ApiConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestApiConfig {
    static ApiConfig config;

    @BeforeAll
    public static void beforeTest() {
        config = ConfigFactory.newInstance().create(ApiConfig.class);
    }

    @Test
    public void printProperties() {
        System.out.println("Base URL is " + config.baseUrl());
        System.out.println("Token is " + config.token());
    }
}
