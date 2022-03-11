package com.linjicong.jiraclient.core.client;

import com.dtflys.forest.annotation.Get;
import com.dtflys.forest.annotation.GetRequest;
import com.dtflys.forest.annotation.PostRequest;
import com.linjicong.jiraclient.core.domain.CreateProjectParam;
import com.linjicong.jiraclient.core.annotation.BasicAuthSimple;
import com.linjicong.jiraclient.core.domain.Project;

import java.util.List;

public interface ProjectClient {
    /**
     * 获取全部项目
     * @param expand description,lead,url,projectKeys
     * @param recent 最近最多访问的几个项目
     * @param properties 项目属性
     * @return
     */
    @Get("#{jira.url}/rest/api/2/project?expand={0}&recent={1}&properties={2}")
    @BasicAuthSimple
    List<Project> getAllProjects(String expand, Integer recent, String properties);

    /**
     * 创建项目
     * @param createProjectParam description,lead,url,projectKeys
     * @return
     */
    @PostRequest("#{jira.url}/rest/api/2/project")
    @BasicAuthSimple
    List<Project> createProject(CreateProjectParam createProjectParam);

}
