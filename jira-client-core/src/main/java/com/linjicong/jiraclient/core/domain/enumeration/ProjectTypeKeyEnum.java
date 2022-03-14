package com.linjicong.jiraclient.core.domain.enumeration;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ProjectTypeKeyEnum {
    SOFTWARE("software"),

    SERVICE_DESK("service_desk"),

    BUSINESS("business");

    private String value;

    ProjectTypeKeyEnum(String value) {
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
    public static ProjectTypeKeyEnum fromValue(String value) {
      for (ProjectTypeKeyEnum b : ProjectTypeKeyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
