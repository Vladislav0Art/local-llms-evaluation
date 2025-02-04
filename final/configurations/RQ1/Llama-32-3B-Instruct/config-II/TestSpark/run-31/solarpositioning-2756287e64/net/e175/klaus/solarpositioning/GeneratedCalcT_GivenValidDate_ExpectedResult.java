package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalcT_GivenValidDate_ExpectedResult {

    @Test
    public void calcT_GivenValidDate_ExpectedResult() {
        ZonedDateTime date = ZonedDateTime.now();
        double result = Grena3.calcT(date);
        assertEquals(1234, (int) result, 1);
    }
}

class AzimuthZenithAngle {
    private double azi;
    private double z;

    public AzimuthZenithAngle(double azi, double z) {
        this.azi = azi;
        this.z = z;
    }

    public double getAzi() {
        return azi;
    }

    public double getZ() {
        return z;
    }

}