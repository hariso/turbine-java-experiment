package com.meroxa.turbine.fluent.sdk;

public interface Records {
    /**
     * Registers a processor on this collection (stream) of records.
     * @return The same collection (stream) of records.
     */
    Records process(Processor processor);

    void writeTo(String users_table, ConnectionOptions options);
}
