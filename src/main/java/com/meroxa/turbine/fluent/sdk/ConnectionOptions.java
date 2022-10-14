package com.meroxa.turbine.fluent.sdk;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents options to connect to a resource.
 * Essentially, it's a map, but having an interface
 * makes it easier to add helper methods.
 */
public class ConnectionOptions {
    private final Map<String, Object> map;

    public ConnectionOptions() {
        this.map = new HashMap<>();
    }

    public ConnectionOptions put(String field, Object value) {
        map.put(field, value);
        return this;
    }

    public ConnectionOptions remove(String field) {
        map.remove(field);
        return this;
    }
}
