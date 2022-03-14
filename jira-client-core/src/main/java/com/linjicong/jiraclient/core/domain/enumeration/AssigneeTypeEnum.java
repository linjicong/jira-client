package com.linjicong.jiraclient.core.domain.enumeration;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AssigneeTypeEnum {
    PROJECT_LEAD("PROJECT_LEAD"),

    UNASSIGNED("UNASSIGNED");

    private String value;

    AssigneeTypeEnum(String value) {
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
    public static AssigneeTypeEnum fromValue(String value) {
        for (AssigneeTypeEnum b : AssigneeTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}
