package com.meroxa.turbine.fluent;

import java.util.List;

import com.meroxa.turbine.fluent.sdk.Processor;
import com.meroxa.turbine.fluent.sdk.TurbineRecord;
import com.meroxa.turbine.fluent.sdk.Turbine;
import com.meroxa.turbine.fluent.sdk.TurbineApp;

// Imaginary pipeline, taking user accounts from a MongoDB source, and then:
// (1) adding metadata,
// (2) generating emails using a Hubspot destination,
// (3) and moving the data to a MySQL DB.
public class OneSourceManyDestinations implements TurbineApp {
    @Override
    public void setup(Turbine turbine) {
        turbine
            .source("mongodb-resource", "users_collection", null)
            .process(new AddMetadata())
            .process(this::generateEmail)
            .writeTo("hubspot-resource", "users", null);

        turbine
            .source("mongodb-resource", "users_collection", null)
            .process(new AddMetadata())
            .process(this::reEncryptPasswords)
            .writeTo("mysql-resource", "users", null);
    }

    private List<TurbineRecord> generateEmail(List<TurbineRecord> records) {
        return records;
    }

    private List<TurbineRecord> reEncryptPasswords(List<TurbineRecord> records) {
        return records;
    }
}

class AddMetadata implements Processor {

    @Override
    public List<TurbineRecord> apply(List<TurbineRecord> records) {
        return records;
    }
}
