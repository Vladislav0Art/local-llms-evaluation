package net.e175.klaus.solarpositioning;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

public class GeneratedTestAzimuthAndZenithWithNegativeValues {

    @Test
    public void testAzimuthAndZenithWithNegativeValues() {
        AzimuthZenithAngle result = new AzimuthZenithAngle(-10, -20);
        MatcherAssert.assertThat(result.getAzimuth(), greaterThan(0));
        MatcherAssert.assertThat(result.getZenith(), lessThan(90));
    }
}

public class Grena3 {
    public static AzimuthZenithAngle calculateSolarPosition(String date, double latitude, double longitude, String time) {
        // implementation
        return new AzimuthZenithAngle(10, 20);
    }
}

public class AzimuthZenithAngle {
    private double azimuth;
    private double zenith;

    public AzimuthZenithAngle(double azimuth, double zenith) {
        this.azimuth = azimuth;
        this.zenith = zenith;
    }

    public double getAzimuth() {
        return azimuth;
    }

    public double getZenith() {
        return zenith;
    }

}