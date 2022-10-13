package com.meroxa.turbine.fluent.sdk;

// Replace the main method?
// Cannot be limited to an interface at compile time
@interface TurbineAppAnnotation {
}

/**
 * Represents Meroxa's Turbine engine.
 */
public interface Turbine {
    /**
     * Returns a {@link Resource} intended to be used as a source in a pipeline.
     */
    // todo what if a resource is "declared" as a source,
    //  but only ever used as a destination? Should we warn about that?
    Resource source(String name);

    Resource source(String resourceName, String collectionName, ResourceConfigs configs);
}

