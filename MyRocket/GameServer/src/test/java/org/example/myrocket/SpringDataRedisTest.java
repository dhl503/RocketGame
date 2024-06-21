package org.example.myrocket;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class SpringDataRedisTest {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @BeforeEach
    void setUp() {
    }

    @Test
    public void testString() {
        //redisTemplate.opsForValue().set("mylist", "dalu");
        redisTemplate.opsForValue().set("hello", "dalu");

        String ss = (String) redisTemplate.opsForValue().get("mylist");
        System.out.println(ss);
    }
}