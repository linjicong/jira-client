package com.linjicong.jiraclient.core.domain.enumeration;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The user account type. Can take the following values:   *  `atlassian` regular Atlassian user account  *  `app` system account used for Connect applications and OAuth to represent external systems  *  `customer` Jira Service Desk account representing an external service desk
 */
public enum AccountTypeEnum {
    ATLASSIAN("atlassian"),

    APP("app"),

    CUSTOMER("customer"),

    UNKNOWN("unknown");

    private String value;

    AccountTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static AccountTypeEnum fromValue(String value) {
        for (AccountTypeEnum b : AccountTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}
