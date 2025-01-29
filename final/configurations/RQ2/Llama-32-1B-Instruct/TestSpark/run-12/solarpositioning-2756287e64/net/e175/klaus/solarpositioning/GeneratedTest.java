package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    public double calculateSolarPosition(double latitude, double longitude, int deltaT) {
        return Math.sqrt(Math.pow(latitude * Math.sin(longitude), 2) + Math.cos(latitude) * Math.cos(longitude) * Math.pow(deltaT, 2));
    }

}

class TestSolarPositionCalculatingFunctions {

}