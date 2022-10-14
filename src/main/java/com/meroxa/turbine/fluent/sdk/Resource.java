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
     * <br />
     * <b>Important</b>: Returns the destination resource!
     *
     * @param resourceName    Name of the resource
     * @param collectionName  Name of the collection (table, collection, bucket etc.) within the resources
     * @param resourceConfigs Additional resource configuration
     * @return The configured <b>destination</b> resource.
     */
    // TODO while convenient to write to a resource using this method,
    //   it's a little bit confusing that the method returns the destination resource,
    //   and not "this" resource.
    //   It may be useful to have a 'Collection' type to represent it.
    Resource writeTo(String resourceName, String collectionName, ConnectionOptions resourceConfigs);
}
