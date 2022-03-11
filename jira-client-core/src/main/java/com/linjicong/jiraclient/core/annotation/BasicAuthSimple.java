package com.linjicong.jiraclient.core.annotation;

import com.dtflys.forest.annotation.RequestAttributes;
import com.dtflys.forest.extensions.BasicAuth;

import java.lang.annotation.*;

/**
 * Basic Auth 类型的验签注解扩展
 * <p>该注解可以修饰接口类和方法，可以读取配置文件{@code jira.username}和{@code jira.password}属性进行加密
 *
 * @author linjicong
 * @see BasicAuth
 */
@Documented
@RequestAttributes
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@BasicAuth(username = "#{jira.username}",password = "#{jira.password}")
public @interface BasicAuthSimple {

}
