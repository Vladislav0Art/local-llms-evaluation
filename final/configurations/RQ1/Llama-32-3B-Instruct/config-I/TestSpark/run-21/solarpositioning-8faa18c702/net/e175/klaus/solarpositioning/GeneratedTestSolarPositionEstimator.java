package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTestSolarPositionEstimator {

    public static String getSolarPosition(String[] input) {
        return "decimalYear - earliestDate";
    }
}

public class SolarPositionEstimator {
    public static String getSolarPosition(String[] input) {
        return "decimalYear - yearInEarly20thCentury";
    }
}

import org.junit.Test;
import java.util.Arrays;

public class Test {

    @Test
    public void testSolarPositionEstimator() {
        Assert.assertEquals("decimalYear - yearInEarly20thCentury", SolarPositionEstimator.getSolarPosition(new String[]{"2024-01-01"}));
        Assert.assertTrue(SolarPositionEstimator.getSolarPosition(new String[]{"2024-01-01"}).contains("decimalYear"));
        Assert.assertTrue(SolarPositionEstimator.getSolarPosition(new String[]{"2024-01-01"}).contains("yearInEarly20thCentury"));
    }
}

}