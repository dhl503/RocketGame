package org.example.myrocket;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class SpringDataRedisTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @BeforeEach
    void setUp() {
    }

    @Test
    public void testString() {
        redisTemplate.opsForValue().set("mylist", "dalu");

        String ss = (String) redisTemplate.opsForValue().get("mylist");
        System.out.println(ss);
    }
}