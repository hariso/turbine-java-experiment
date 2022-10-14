package com.meroxa.turbine.fluent.examples;

import com.meroxa.turbine.fluent.sdk.Turbine;
import com.meroxa.turbine.fluent.sdk.TurbineApp;

public class SimpleWithProcessor implements TurbineApp {

    @Override
    public void setup(Turbine turbine) {
        turbine.resource("mongodb-resource", "users", null)
            .process(new AddMetadata())
            .writeTo("mysql-resource", "users", null);
    }
}
