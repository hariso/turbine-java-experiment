package com.meroxa.turbine.fluent.examples;

import java.util.List;

import com.meroxa.turbine.fluent.sdk.Processor;
import com.meroxa.turbine.fluent.sdk.Records;
import com.meroxa.turbine.fluent.sdk.Turbine;
import com.meroxa.turbine.fluent.sdk.TurbineApp;
import com.meroxa.turbine.fluent.sdk.TurbineRecord;

// Imaginary pipeline, taking user accounts from a MongoDB source, and then:
// (1) adding metadata,
// (2) generating emails and sending them using a Hubspot destination,
// (3) re-encrypting the password and migrating the users to a MySQL DB.
public class OneToMany implements TurbineApp {
    @Override
    public void setup(Turbine turbine) {
        Records records = turbine
            .resource("mongodb-resource")
            .read("users_collection", null)
            .process(new AddMetadata());

        records
            .process(this::generateEmail)
            .writeTo(turbine.resource("hubspot-resource"), "users", null);

        records
            .process(this::reEncryptPasswords)
            .writeTo(turbine.resource("mysql-resource"), "users", null);
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