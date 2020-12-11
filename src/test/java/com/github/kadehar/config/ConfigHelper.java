package com.github.kadehar.config;

import org.aeonbits.owner.ConfigFactory;

/**
 * Отвечает за инициализацию конфигов.
 *
 * @author Алексей Кузнецов
 */
public class ConfigHelper {
    /** Инициализирует конфиг для выбранной среды */
    public static UserConfig user() {
        return ConfigFactory.newInstance().create(UserConfig.class, System.getProperties());
    }
}
