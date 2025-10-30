package com.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ConfigUpdateEvent {
    private final String type;

    @JsonCreator
    public ConfigUpdateEvent(
            @JsonProperty("type") String type
    ) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
