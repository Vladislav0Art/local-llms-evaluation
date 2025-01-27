package net.e175.klaus.solarpositioning;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

public class GeneratedTestSolarPosition {

    @Test
    public void testSolarPosition() {
        Grena3 grena3 = new Grena3();
        AzimuthZenithAngle result = grena3.calculateSolarPosition("2024-03-20", 52.523538, 13.406944, null);
        MatcherAssert.assertThat(result.getAzimuth(), greaterThan(0));
        MatcherAssert.assertThat(result.getZenith(), lessThan(90));
    }

}