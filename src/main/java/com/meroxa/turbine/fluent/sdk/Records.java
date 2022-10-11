package com.meroxa.turbine.fluent.sdk;

public interface Records {
    Records process(Processor processor);

    void write(String resourceName, String collectionName, ResourceConfigs resourceConfigs);
}
