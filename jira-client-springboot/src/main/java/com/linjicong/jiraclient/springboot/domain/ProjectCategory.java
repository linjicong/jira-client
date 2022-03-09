package com.linjicong.jiraclient.springboot.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.net.URI;

/**
 * @Description
 * @Author linjicong
 * @Date 2022-03-04 17:28
 */
@Data
public class ProjectCategory {
    @JsonProperty("self")
    private URI self;

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;
}
