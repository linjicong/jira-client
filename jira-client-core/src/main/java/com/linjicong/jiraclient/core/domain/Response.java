package com.linjicong.jiraclient.core.domain;

import lombok.Data;

import java.net.URI;

/**
 * @author linjicong
 * @date 2022-03-11 14:16
 */
@Data
public class Response {
    private URI self;
    private Long id;
    private String key;
}
