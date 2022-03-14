package com.linjicong.jiraclient.core.domain;

import com.linjicong.jiraclient.core.domain.enumeration.AccountTypeEnum;
import lombok.Data;

import java.net.URI;

/**
 * @author linjicong
 * @date 2022-03-14 11:03
 */
@Data
public class User {

    private URI self;

    private String key;

    private String accountId;

    private AccountTypeEnum accountType;

    private String name;

    private String emailAddress;

    private AvatarUrls avatarUrls;

    private String displayName;

    private Boolean active;

    private String timeZone;

    private String locale;

    private Group groups;

    private ApplicationRole applicationRoles = null;

    private String expand;
}
