package com.linjicong.jiraclient.springboot.starter;

import com.dtflys.forest.springboot.annotation.ForestScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author linjicong
 * @date 2022-03-11 15:47
 */
@Configuration
@EnableConfigurationProperties(JiraClientProperties.class)
@ForestScan("com.linjicong.jiraclient.core.client")
public class JiraClientAutoConfiguration {
}
