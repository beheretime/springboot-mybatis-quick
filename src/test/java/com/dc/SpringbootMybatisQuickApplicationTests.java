package com.dc;

import com.dc.Mapper.UserMapper;
import com.dc.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisQuickApplicationTests {
    @Autowired
    private UserMapper userMapper;


    @Test
    void contextLoads() {
        List<User> list = userMapper.list();
        list.stream().forEach(user -> {
            System.out.println(user);
        });

    }

}
