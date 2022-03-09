package com.linjicong.jiraclient.springboot.client;

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
        List<Project> allProjects= projectClient.getAllProjects();
        System.out.println(JSONUtil.toJsonPrettyStr(allProjects));
    }
}
