package com.linjicong.jiraclient.springboot.domain;

import lombok.Data;
import org.springframework.lang.Nullable;

import java.net.URI;

@Data
public class Project {
    private  URI self;
    @Nullable
    private Long id;
    @Nullable
    private String name;
    private String key;
    private String description;
    private Lead lead;
    private AvatarUrls avatarUrls;
    private ProjectCategory projectCategory;
    private String projectTypeKey;
    private String expand;
    private String[] projectKeys;
}
