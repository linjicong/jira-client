package com.linjicong.jiraclient.example.springboot;

import cn.hutool.json.JSONUtil;
import com.linjicong.jiraclient.core.client.UserClient;
import com.linjicong.jiraclient.core.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserClientTest {
    @Autowired
    private UserClient userClient;

    @Test
    void getUser() {
        User user= userClient.getUser("admin",null);
        System.out.println(JSONUtil.toJsonPrettyStr(user));
    }
}
