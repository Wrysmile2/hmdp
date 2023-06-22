package com.hmdp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
public class RedisTest {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void ConnectRedis() {
        stringRedisTemplate.opsForValue().set("k2", "v2");
        String k2 = stringRedisTemplate.opsForValue().get("k2");
        System.out.println("k2=" + k2);
    }

}
