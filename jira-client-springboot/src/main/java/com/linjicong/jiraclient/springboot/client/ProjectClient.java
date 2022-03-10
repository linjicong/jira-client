package com.linjicong.jiraclient.springboot.client;

import com.dtflys.forest.annotation.Get;
import com.dtflys.forest.extensions.OAuth2;
import com.linjicong.jiraclient.springboot.annotation.BasicAuthSimple;
import com.linjicong.jiraclient.springboot.domain.Project;

import java.util.List;

public interface ProjectClient {
    /**
     * 获取全部项目
     * @param expand description,lead,url,projectKeys
     * @param recent 最近最多访问的几个项目
     * @param properties 项目属性
     * @return
     */
    @Get("#{jira.url}/rest/api/2/project?expand={0}&recent={1}&properties={3}")
    @BasicAuthSimple
    List<Project> getAllProjects(String expand, Integer recent, String properties);
}
