package com.meroxa.turbine.fluent.sdk;

/**
 * Represents a <a href="https://docs.meroxa.com/platform/resources/overview">resource</a> in Meroxa.
 */
public interface Resource {
    Records read(String collection, ConnectionOptions options);

    void write(Records records, String collections, ConnectionOptions options);
}
