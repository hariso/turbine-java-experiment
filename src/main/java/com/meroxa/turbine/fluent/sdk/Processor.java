package com.meroxa.turbine.fluent.sdk;

import java.util.List;
import java.util.function.Function;

public interface Processor extends Function<List<TurbineRecord>, List<TurbineRecord>> {

}
