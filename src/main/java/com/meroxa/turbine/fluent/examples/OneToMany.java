package com.meroxa.turbine.fluent.examples;

import java.util.List;

import com.meroxa.turbine.fluent.sdk.Processor;
import com.meroxa.turbine.fluent.sdk.TurbineRecord;
import com.meroxa.turbine.fluent.sdk.Turbine;
import com.meroxa.turbine.fluent.sdk.TurbineApp;

// Imaginary pipeline, taking user accounts from a MongoDB source, and then:
// (1) adding metadata,
// (2) generating emails using a Hubspot destination,
// (3) and moving the data to a MySQL DB.
public class OneToMany implements TurbineApp {
    @Override
    public void setup(Turbine turbine) {
        turbine
            .resource("mongodb-resource", "users_collection", null)
            .process(new AddMetadata())    // processor attached to source
            .process(this::generateEmail)  // processor attached to source
            .writeTo("hubspot-resource", "users", null);

        turbine
            .resource("mongodb-resource", "users_collection", null)
            .process(new AddMetadata())    // processor attached to source
            .writeTo("mysql-resource", "users", null)
            .process(this::reEncryptPasswords);  // processor attached to destination
    }

    // Transforms incoming records, representing users,
    // into emails, ready to be sent out.
    private List<TurbineRecord> generateEmail(List<TurbineRecord> records) {
        return records;
    }

    // Re-encrypts password in records (which represent users),
    // so they are ready to be migrated to MySQL.
    private List<TurbineRecord> reEncryptPasswords(List<TurbineRecord> records) {
        return records;
    }
}

// Adds some metadata to all the records.
class AddMetadata implements Processor {

    @Override
    public List<TurbineRecord> apply(List<TurbineRecord> records) {
        return records;
    }
}

class ReEncryptPassword implements Processor {

    @Override
    public List<TurbineRecord> apply(List<TurbineRecord> records) {
        return null;
    }
}