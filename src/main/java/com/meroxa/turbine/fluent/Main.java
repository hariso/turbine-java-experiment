package com.meroxa.turbine.fluent;

import com.meroxa.turbine.fluent.sdk.Runner;

public class Main {
    public static void main(String[] args) {
        // Alternatively, we use annotations to annotate
        // classes which are Turbine apps.
        // We can then scan the class path for those.
        Runner.start(new OneSourceManyDestinations());
    }
}
