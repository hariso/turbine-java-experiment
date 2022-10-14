package com.meroxa.turbine.fluent.examples;

import com.meroxa.turbine.fluent.sdk.Records;
import com.meroxa.turbine.fluent.sdk.Turbine;
import com.meroxa.turbine.fluent.sdk.TurbineApp;

// Read data from a MongoDB resource, write to MySQL
public class Simple implements TurbineApp {
    @Override
    public void setup(Turbine turbine) {
        Records records = turbine
            .resource("mongodb")
            .read("users_mongo", null);

        turbine
            .resource("mysql")
            .write(records, "users_table", null);

        // Alternatively:
        turbine
            .resource("mongodb")
            .read("users_mongo", null)
            .writeTo(turbine.resource("mysql"), "users_table", null);
    }
}
