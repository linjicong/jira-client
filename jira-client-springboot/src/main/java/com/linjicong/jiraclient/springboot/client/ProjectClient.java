package com.linjicong.jiraclient.springboot.client;

import com.dtflys.forest.annotation.Request;
import com.linjicong.jiraclient.springboot.annotation.BasicAuthSimple;
import com.linjicong.jiraclient.springboot.domain.Project;

import java.util.List;

public interface ProjectClient {
    @Request("#{jira.url}/rest/api/2/project")
    @BasicAuthSimple
    List<Project> getAllProjects();
}
