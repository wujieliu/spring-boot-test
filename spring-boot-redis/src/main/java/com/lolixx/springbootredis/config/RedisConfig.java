package com.lolixx.springbootredis.config;

import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

/**
 * <b>Description</b>: <br>
 * <b>email</b>:liuliuwujie@126.com <br>
 * <b>Author</b>:loulanqian<br>
 * <b>Date</b>: 2020/11/17 15:02<br>
 */
@Configuration
@EnableCaching
public class RedisConfig extends CachingConfigurerSupport {
}
