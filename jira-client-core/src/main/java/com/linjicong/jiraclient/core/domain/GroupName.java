package com.linjicong.jiraclient.core.domain;

import lombok.Data;

import java.net.URI;

/**
 * @author linjicong
 * @date 2022-03-14 11:06
 */
@Data
public class GroupName {
    private String name;

    private URI self;
}
