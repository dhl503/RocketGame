package org.example.myrocket;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@SpringBootTest
class SpringDataRedisTest {

    @Autowired
    //private StringRedisTemplate redisTemplate;
    private RedisTemplate redisTemplate;

    @BeforeEach
    void setUp() {
    }

    @Test
    public void testString() {
        //redisTemplate.opsForValue().set("mylist", "dalu");
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new StringRedisSerializer());
        redisTemplate.opsForValue().set("welcome11", "world11");

        String ss = (String) redisTemplate.opsForValue().get("welcome");
        System.out.println(ss);
    }

}