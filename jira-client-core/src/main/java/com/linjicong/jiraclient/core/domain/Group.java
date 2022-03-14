package com.linjicong.jiraclient.core.domain;

import lombok.Data;

import java.util.List;

/**
 * @author linjicong
 * @date 2022-03-14 11:05
 */
@Data
public class Group {
    private Integer size;

    private List<GroupName> items;

    private Object pagingCallback;

    private Object callback;

    private Integer maxResults;
}
