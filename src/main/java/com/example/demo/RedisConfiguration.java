package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import redis.clients.jedis.JedisPoolConfig;

import java.util.*;
/*
@EnableCaching
@Configuration*/
public class RedisConfiguration {
/*

    @Value("${vehicle.redis.host}")
    private String host;

    @Value("${vehicle.redis.password}")
    private String password;

    @Value("${vehicle.redis.port}")
    private int port;

    @Value("${vehicle.redis.pool.max-idle}")
    private int max_idle;

    @Value("${vehicle.redis.pool.min-idle}")
    private int min_idle;

    @Value("${vehicle.redis.pool.max-wait}")
    private int max_wait;

    @Value("${vehicle.redis.caches.name}")
    private String cache_name;

    @Value("${vehicle.redis.caches.expiration:-1}")
    private String expiration;

    @Value("${vehicle.redis.defaultExpiration}")
    private long defaultExpiration;

    @Bean
    public JedisConnectionFactory redisConnectionFactory() {
        JedisConnectionFactory redisConnectionFactory = new JedisConnectionFactory();
        redisConnectionFactory.setHostName(host);
        redisConnectionFactory.setPort(port);
        redisConnectionFactory.setPassword(password);

        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(max_idle);
        jedisPoolConfig.setMaxWaitMillis(max_wait);
        jedisPoolConfig.setMinIdle(min_idle);

        redisConnectionFactory.setPoolConfig(jedisPoolConfig);

        return redisConnectionFactory;
    }

    @Bean
    public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory cf) {
        RedisTemplate<String, String> redisTemplate = new RedisTemplate<String, String>();
        redisTemplate.setConnectionFactory(cf);
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        return redisTemplate;
    }

    @Bean
    public CacheManager cacheManager(RedisTemplate redisTemplate) {
        RedisCacheManager cacheManager = new RedisCacheManager(redisTemplate);
        List<String> cacheNames=new ArrayList<String>();
        Map<String,Long> cacheExpirations=new HashMap<String,Long>(cacheNames.size(),1);
        String[] exps=expiration.split(",");
        Cache c=new Cache();
        Optional.ofNullable(cache_name)
                .ifPresent(cname -> {
                    c.index=0;
                    Arrays.asList(cname.split(","))
                            .forEach(name -> {
                                if(name!=null && !name.equals("")){
                                    cacheNames.add(name);
                                    c.index=c.index++;
                                    if(exps[c.index]!=null &&  !exps[c.index].equals("")){
                                        cacheExpirations.put(name, Long.valueOf(exps[c.index]));
                                    }
                                }
                            });
                });
        cacheManager.setCacheNames(cacheNames);
        cacheManager.setDefaultExpiration(defaultExpiration);
        cacheManager.setExpires(cacheExpirations);
        return cacheManager;
    }

    public class Cache{
        public int index;
        public String name;
        public long expiration;
    }
*/

}