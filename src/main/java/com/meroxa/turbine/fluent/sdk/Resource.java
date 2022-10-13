package com.meroxa.turbine.fluent.sdk;

/**
 * Represents a <a href="https://docs.meroxa.com/platform/resources/overview">resource</a> in Meroxa.
 */
public interface Resource {
    /**
     * Registers a {@link Processor} on this resource.
     * If it's a source, the <code>processor</code> will be applied to all the records coming out of it.
     * If it's a destination, the <code>processor</code> will be applied to all the records coming into it.
     * <p>
     * Returns this resource.
     */
    Resource process(Processor processor);

    /**
     * Writes the records from this resource into the resource with the given name.
     * <b>Important</b>: Returns the destination resource!
     * @param resourceName
     * @param collectionName
     * @param resourceConfigs
     * @return
     */
    Resource writeTo(String resourceName, String collectionName, ResourceConfigs resourceConfigs);
}
