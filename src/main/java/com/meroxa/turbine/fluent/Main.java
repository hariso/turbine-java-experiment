package com.meroxa.turbine.fluent;

import com.meroxa.turbine.fluent.examples.OneToMany;
import com.meroxa.turbine.fluent.sdk.Runner;

public class Main {
    public static void main(String[] args) {
        // Instead of running the app ourselves, it would be possible
        // to annotate a TurbineApp implementation, and automatically detect it.
        Runner.start(new OneToMany());
    }
}
