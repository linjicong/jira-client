package com.linjicong.jiraclient.core.domain;

import lombok.Data;

import java.net.URI;

/**
 * @author linjicong
 * @date 2022-03-10 15:17
 */
@Data
public class Lead {
    private URI self;
    private String name;
    private String key;
    private AvatarUrls avatarUrls;
    private String displayName;
    private Boolean active;
}
