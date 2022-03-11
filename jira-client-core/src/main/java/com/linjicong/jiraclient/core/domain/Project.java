package com.linjicong.jiraclient.core.domain;

import lombok.Data;

import java.net.URI;

@Data
public class Project {
    private  URI self;
    private Long id;
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
