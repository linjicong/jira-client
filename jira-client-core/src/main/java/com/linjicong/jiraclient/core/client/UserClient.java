package com.linjicong.jiraclient.core.client;

import com.dtflys.forest.annotation.Address;
import com.dtflys.forest.annotation.Get;
import com.dtflys.forest.annotation.Query;
import com.linjicong.jiraclient.core.annotation.BasicAuthSimple;
import com.linjicong.jiraclient.core.domain.User;

@Address(basePath = "#{jira.url}")
public interface UserClient {
    /**
     * 获取全部用户
     * @param username
     * @param key
     * @return
     */
    @Get("/rest/api/2/user")
    @BasicAuthSimple
    User getUser(@Query(name = "username") String username,@Query(name = "key") String key);
}
