package net.e175.klaus.solarpositioning;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

public class GeneratedTestAzimuthAndZenith {

    @Test
    public void testAzimuthAndZenith() {
        AzimuthZenithAngle result = new AzimuthZenithAngle(10, 20);
        MatcherAssert.assertThat(result.getAzimuth(), greaterThan(0));
        MatcherAssert.assertThat(result.getZenith(), lessThan(90));
    }

}