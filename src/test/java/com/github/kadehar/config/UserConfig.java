package com.github.kadehar.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:${env}.properties",
        "file:~/${env}.properties",
        "file:./${env}.properties"
})
public interface UserConfig extends Config {
    @Key("user.login")
    String login();
    @Key("user.password")
    String password();
}
