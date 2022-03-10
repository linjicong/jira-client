package com.linjicong.jiraclient.springboot.domain;

import lombok.Data;
import org.springframework.lang.Nullable;

import java.net.URI;

/**
 * @author linjicong
 * @date 2022-03-10 15:17
 */
@Data
public class Lead {
    private URI self;
    @Nullable
    private String name;
    private String key;
    private AvatarUrls avatarUrls;
    private String displayName;
    private Boolean active;
}
