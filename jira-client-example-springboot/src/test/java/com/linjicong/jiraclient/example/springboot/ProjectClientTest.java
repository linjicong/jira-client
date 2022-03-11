package com.linjicong.jiraclient.example.springboot;

import cn.hutool.core.codec.Base64;
import cn.hutool.json.JSONUtil;
import com.linjicong.jiraclient.core.client.ProjectClient;
import com.linjicong.jiraclient.core.domain.Project;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ProjectClientTest {

    @Autowired
    private ProjectClient projectClient;

    @Test
    void getAllProjects() {
        List<Project> allProjects= projectClient.getAllProjects(null,null,null);
        System.out.println(JSONUtil.toJsonPrettyStr(allProjects));
    }

    @Test
    void name() {
        System.out.println(Base64.encode("admin:admin"));
    }
}
