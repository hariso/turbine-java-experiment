package com.meroxa.turbine.fluent;

import java.util.List;

import com.meroxa.turbine.fluent.examples.OneToMany;
import com.meroxa.turbine.fluent.sdk.Resource;
import com.meroxa.turbine.fluent.sdk.TestTurbine;
import com.meroxa.turbine.fluent.sdk.Turbine;
import com.meroxa.turbine.fluent.sdk.TurbineRecord;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

class OneToManyTest {
    @Test
    public void test() {
        Resource hubspotDest = mock(Resource.class);
        Resource mysqlDest = mock(Resource.class);
        Turbine testTurbine = new TestTurbine()
            .withSource("mongodb-resource", "/path/to/test-data-json")
            .withSource("foobar-resource", List.of(new TurbineRecord()))
            .withDestination("hubspost-resource", hubspotDest)
            .withDestination("mysql-resource", mysqlDest);

        new OneToMany().setup(testTurbine);
        // Verify correct data has been received by the destination mocks

    }
}
