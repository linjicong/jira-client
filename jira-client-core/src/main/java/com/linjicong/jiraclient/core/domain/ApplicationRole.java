package com.linjicong.jiraclient.core.domain;

import lombok.Data;

import java.util.List;

/**
 * @author linjicong
 * @date 2022-03-14 11:07
 */
@Data
public class ApplicationRole {
    private String key;

    private List<String> groups;

    private String name;

    private List<String> defaultGroups;

    private Boolean selectedByDefault;

    private Boolean defined;

    private Integer numberOfSeats;

    private Integer remainingSeats;

    private Integer userCount;

    private String userCountDescription;

    private Boolean hasUnlimitedSeats;

    private Boolean platform;
}
