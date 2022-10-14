package com.meroxa.turbine.fluent.sdk;

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

    // TODO The resource returned here doesn't match with Meroxa terminology.
    //   Namely, this declares a "resource" from a collection
    Resource source(String resourceName, String collectionName, ConnectionOptions configs);
}
