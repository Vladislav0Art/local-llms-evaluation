package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestCalculateAltitude {

    @Test
    public void testCalculateAltitude() {
        Main main = new Main();
        assertEquals(-3.83, main.calculateAltitude(1845, 1715), 0.01);
    }
}

public class Main {

    public double calculateDiffTime(double longitude1, double longitude2) {
        return Math.abs((longitude2 - longitude1) / 36000000);
    }

    public double calculateLongitudinalOffset(double latitude1, double latitude2) {
        return (latitude2 - latitude1) * 100000;
    }

    public double calculateAltitude(double latitude1, double latitude2) {
        return Math.abs((latitude2 - latitude1) * 111320);
    }

}