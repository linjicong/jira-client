package com.linjicong.jiraclient.springboot.client;

import cn.hutool.core.codec.Base64;
import cn.hutool.json.JSONUtil;
import com.linjicong.jiraclient.springboot.domain.Project;
import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProjectClientTest {

    @Autowired
    private ProjectClient projectClient;

    @Test
    void getAllProjects() {
        List<Project> allProjects= projectClient.getAllProjects("lead,projectKeys",null,null);
        System.out.println(JSONUtil.toJsonPrettyStr(allProjects));
    }

    @Test
    void name() {
        System.out.println(Base64.encode("linjicong@linjicong.atlassian.net:gC1yxCYRITq6yfGZuBn3C66B"));
    }
}
