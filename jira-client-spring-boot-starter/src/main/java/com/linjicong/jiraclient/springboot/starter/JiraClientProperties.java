package com.linjicong.jiraclient.springboot.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author linjicong
 * @date 2022-03-11 15:48
 */
@ConfigurationProperties(prefix = "jira")
public class JiraClientProperties {
    private String url;
    private String username;
    private String password;
}
