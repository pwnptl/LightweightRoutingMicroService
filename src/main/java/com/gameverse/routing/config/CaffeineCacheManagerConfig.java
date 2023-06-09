package com.gameverse.routing.config;

import com.gameverse.routing.utils.Constant;
import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@Configuration
@EnableCaching
public class CaffeineCacheManagerConfig {
    @Bean
    public CacheManager cacheManager() {
        CaffeineCacheManager cacheManager = new CaffeineCacheManager(Constant.Cache.CACHE_NAME);
        cacheManager.setCaffeine(caffeineCacheBuilder());
        return cacheManager;
    }

    private Caffeine<Object, Object> caffeineCacheBuilder() {
        return Caffeine.newBuilder()
                // todo: move the timout value to application properties.
                .expireAfterWrite(10, TimeUnit.SECONDS) // Set TTL value here
                .maximumSize(100) // Set maximum cache size if needed
                .recordStats();
    }
}
