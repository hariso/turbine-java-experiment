package com.meroxa.turbine.fluent.examples;

import com.meroxa.turbine.fluent.sdk.ConnectionOptions;
import com.meroxa.turbine.fluent.sdk.Turbine;
import com.meroxa.turbine.fluent.sdk.TurbineApp;

// Read records from MongoDB, add metadata, write to MySQL
public class SimpleWithProcessor implements TurbineApp {

    @Override
    public void setup(Turbine turbine) {
        turbine.resource("mongodb-resource")
            .read("users_collection", new ConnectionOptions())
            .process(new AddMetadata())
            .writeTo(turbine.resource("mysql-resource"), "users_table", null);
    }
}
