package com.linjicong.jiraclient.core.domain;

import com.linjicong.jiraclient.core.domain.enumeration.AssigneeTypeEnum;
import com.linjicong.jiraclient.core.domain.enumeration.ProjectTemplateKeyEnum;
import com.linjicong.jiraclient.core.domain.enumeration.ProjectTypeKeyEnum;
import lombok.Data;

/**
 * @author linjicong
 * @date 2022-03-11 14:15
 */
@Data
public class CreateProjectParam {
    private String key;
    private String name;
    private String description;
    private String lead;
    //private Long leadAccountId;
    private String url;
    private AssigneeTypeEnum assigneeType;
    private Long avatarId;
    private Long issueSecurityScheme;
    private Long permissionScheme;
    private Long notificationScheme;
    private Long categoryId;
    private ProjectTypeKeyEnum projectTypeKey;
    private ProjectTemplateKeyEnum projectTemplateKey;
    //private Long workflowScheme;
    //private Long issueTypeScreenScheme;
    //private Long issueTypeScheme;
    //private Long fieldConfigurationScheme;
}
