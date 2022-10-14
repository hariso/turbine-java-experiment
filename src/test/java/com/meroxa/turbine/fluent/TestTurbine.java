package com.meroxa.turbine.fluent;

import com.meroxa.turbine.fluent.sdk.Resource;
import com.meroxa.turbine.fluent.sdk.ConnectionOptions;
import com.meroxa.turbine.fluent.sdk.Turbine;

public class TestTurbine implements Turbine {
    @Override
    public Resource resource(String name) {
        return null;
    }

    @Override
    public Resource resource(String resourceName, String collectionName, ConnectionOptions configs) {
        return null;
    }

    /**
     * Registers a source, for which the data will be loaded from the given file.
     */
    public TestTurbine withSource(String name, String path) {
        return null;
    }

    /**
     * Registers a destination.
     *
     * @param name
     * @param resource
     * @return
     */
    public TestTurbine withDestination(String name, Resource resource) {
        return null;
    }
}
