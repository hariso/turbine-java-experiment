package com.meroxa.turbine.fluent.sdk;

/**
 * Runs a Turbine app.
 */
public class Runner {
    public static void start(TurbineApp app) {
        Turbine turbine = null;
        app.setup(turbine);
    }
}
