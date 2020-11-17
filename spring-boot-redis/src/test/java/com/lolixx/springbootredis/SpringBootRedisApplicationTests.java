package com.lolixx.springbootredis;

import com.lolixx.springbootredis.model.User;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class SpringBootRedisApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testString() {
        redisTemplate.opsForValue().set("neo", "ityouknow");
        Assert.assertEquals("ityouknow", redisTemplate.opsForValue().get("neo"));
    }

    @Test
    public void testObj() {
        User user = new User(1, "smile", 1, 22);
        ValueOperations operations = redisTemplate.opsForValue();
        operations.set("com.neo", user);
        User u = (User) operations.get("com.neo");
        System.out.println("user: " + u.toString());
    }

    @Test
    void contextLoads() {
    }

}
