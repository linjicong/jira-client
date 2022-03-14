package com.linjicong.jiraclient.example.springboot;

import cn.hutool.json.JSONUtil;
import com.linjicong.jiraclient.core.client.ProjectClient;
import com.linjicong.jiraclient.core.domain.CreateProjectParam;
import com.linjicong.jiraclient.core.domain.Project;
import com.linjicong.jiraclient.core.domain.Response;
import com.linjicong.jiraclient.core.domain.enumeration.AssigneeTypeEnum;
import com.linjicong.jiraclient.core.domain.enumeration.ProjectTypeKeyEnum;
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
        List<Project> allProjects= projectClient.getAllProjects("lead",null,null);
        System.out.println(JSONUtil.toJsonPrettyStr(allProjects));
    }

    @Test
    void createProject() {
        CreateProjectParam createProjectParam = new CreateProjectParam();
        createProjectParam.setKey("XM2");
        createProjectParam.setName("项目2");
        createProjectParam.setLead("admin");
        createProjectParam.setProjectTypeKey(ProjectTypeKeyEnum.BUSINESS);
        createProjectParam.setAssigneeType(AssigneeTypeEnum.PROJECT_LEAD);
        Response response = projectClient.createProject(createProjectParam);
        System.out.println(JSONUtil.toJsonPrettyStr(response));
    }
}
