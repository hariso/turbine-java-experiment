package com.meroxa.turbine.fluent;

import com.meroxa.turbine.fluent.sdk.Resource;
import com.meroxa.turbine.fluent.sdk.Turbine;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

class OneSourceManyDestinationsTest {
    @Test
    public void test() {
        Resource hubspotDest = mock(Resource.class);
        Resource mysqlDest = mock(Resource.class);
        Turbine testTurbine = new TestTurbine()
            .withSource("mongodb-resource", "/path/to/test-data-json")
            .withDestination("hubspost-resource", hubspotDest)
            .withDestination("mysql-resource", mysqlDest);

        new OneSourceManyDestinations().setup(testTurbine);
        // Verify correct data has been received by the destination mocks

    }
}
