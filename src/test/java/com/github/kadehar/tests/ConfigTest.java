package com.github.kadehar.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

import static com.github.kadehar.config.ConfigHelper.user;

public class ConfigTest {
    final Logger logger = Logger.getLogger(ConfigTest.class.getName());

    @Test
    @DisplayName("Проверка данных пользователя из конфига")
    public void checkCredentials() {
        logger.log(Level.INFO, "Environment: {0}", System.getProperty("env"));
        logger.log(Level.INFO, "login={0}", user().login());
        Assertions.assertNotNull(user().login(), "Login property is null!");
        logger.log(Level.INFO, "password={0}", user().password());
        Assertions.assertNotNull(user().password(), "Password property is null!");
    }
}
