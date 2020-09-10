package com.github.kadehar.config.api;

import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:api.properties",
        "file:~/.token.properties"
})
public interface ApiConfig extends Config {
    @Key("api.base.url")
    URL baseUrl();

    @Key("api.token")
    String token();
}
