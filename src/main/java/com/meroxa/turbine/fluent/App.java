package com.meroxa.turbine.fluent;

import java.util.List;
import java.util.function.Function;

import com.meroxa.turbine.fluent.sdk.MeroxaRecord;
import com.meroxa.turbine.fluent.sdk.Processor;
import com.meroxa.turbine.fluent.sdk.Turbine;
import com.meroxa.turbine.fluent.sdk.TurbineApp;

public class App implements TurbineApp {
    @Override
    public void setup(Turbine turbine) {
        turbine
            .source("cck_1")
            .records("inbound", null)
            .process(this::processorOne)
            .write("demopg", "inbound_events", null);

        turbine
            .source("cck_2")
            .records("inbound", null)
            .process(new ProcessorTwo())
            .write("demopg", "inbound_events", null);
    }

    private List<MeroxaRecord> processorOne(List<MeroxaRecord> records) {
        return null;
    }

    private List<MeroxaRecord> methodTwo(List<MeroxaRecord> records) {
        return null;
    }
}

class ProcessorTwo implements Processor {

    @Override
    public List<MeroxaRecord> apply(List<MeroxaRecord> records) {
        return null;
    }
}