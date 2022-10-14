package com.meroxa.turbine.fluent.examples;

import com.meroxa.turbine.fluent.sdk.ConnectionOptions;
import com.meroxa.turbine.fluent.sdk.Records;
import com.meroxa.turbine.fluent.sdk.Resource;
import com.meroxa.turbine.fluent.sdk.Turbine;
import com.meroxa.turbine.fluent.sdk.TurbineApp;

// Read data from a resource, process, write to same resource
public class ReadWriteFromSame implements TurbineApp {

    @Override
    public void setup(Turbine turbine) {
        Resource mysql = turbine.resource("mysql");
        Records records = mysql
            .read("users_old", new ConnectionOptions())
            .process(new AddMetadata())
            .process(new ReEncryptPassword());

        mysql.write(records, "users_new", new ConnectionOptions());

        // Alternatively:
        mysql
            .read("users_old", new ConnectionOptions())
            .process(new AddMetadata())
            .process(new ReEncryptPassword())
            .writeTo(mysql, "users_new", new ConnectionOptions());
    }
}
