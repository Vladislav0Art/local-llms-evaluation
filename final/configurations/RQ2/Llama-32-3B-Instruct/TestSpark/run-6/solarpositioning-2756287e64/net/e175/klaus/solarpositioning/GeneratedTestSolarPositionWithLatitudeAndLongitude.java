package net.e175.klaus.solarpositioning;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

public class GeneratedTestSolarPositionWithLatitudeAndLongitude {

    @Test
    public void testSolarPositionWithLatitudeAndLongitude() {
        Grena3 grena3 = new Grena3();
        AzimuthZenithAngle result = grena3.calculateSolarPosition(null, 52.523538, 13.406944, null);
        MatcherAssert.assertThat(result.getAzimuth(), greaterThan(0));
        MatcherAssert.assertThat(result.getZenith(), lessThan(90));
    }

}