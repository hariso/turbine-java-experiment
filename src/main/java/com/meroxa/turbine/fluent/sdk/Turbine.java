package com.meroxa.turbine.fluent.sdk;

// Replace the main method?
// Cannot be limited to an interface at compile time
@interface TurbineAppAnnotation {
}

public interface Turbine {
    Resource source(String name);
    void process(com.meroxa.turbine.fluent.sdk.Processor processor);
}

