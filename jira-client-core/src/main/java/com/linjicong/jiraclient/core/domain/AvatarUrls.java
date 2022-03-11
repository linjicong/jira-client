package com.linjicong.jiraclient.core.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.net.URI;

@Data
public class AvatarUrls {
    @JsonProperty("16x16")
    private URI _16x16;

    @JsonProperty("24x24")
    private URI _24x24;

    @JsonProperty("32x32")
    private URI _32x32;

    @JsonProperty("48x48")
    private URI _48x48;
}
