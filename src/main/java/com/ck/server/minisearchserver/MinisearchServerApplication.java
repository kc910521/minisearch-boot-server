package com.ck.server.minisearchserver;

import com.ck.common.mini.config.MiniSearchServer;
import com.ck.common.mini.spring.DefaultMiniSearchSpringConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.Assert;

@SpringBootApplication
public class MinisearchServerApplication {


    public MinisearchServerApplication(RedisTemplate<String, String> redisTemplate
                                       ) {
        assert redisTemplate != null;
    }

    public static void main(String[] args) {
        SpringApplication.run(MinisearchServerApplication.class, args);
    }

}
