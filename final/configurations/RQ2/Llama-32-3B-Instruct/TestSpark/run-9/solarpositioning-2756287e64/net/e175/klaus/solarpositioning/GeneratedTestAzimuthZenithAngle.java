package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestAzimuthZenithAngle {

    @Test
    public void testAzimuthZenithAngle() {
        AzimuthZenithAngle result = new AzimuthZenithAngle(-10.23);
        assertEquals(-10.23, result.getZenith(), 0.01);
    }
}

class AzimuthZenithAngle {

    private double zenith;

    public AzimuthZenithAngle(double zenith) {
        this.zenith = zenith;
    }

    public double getZenith() {
        return zenith;
    }

}