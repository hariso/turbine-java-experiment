package com.meroxa.turbine.fluent.sdk;

public interface Records {
    /**
     * Registers a processor on this collection (stream) of records.
     * @return The same collection (stream) of records.
     */
    // TODO Make Records immutable and return a new instance every time process() is called.
    Records process(Processor processor);

    void writeTo(Resource resource, String collection, ConnectionOptions options);
}
