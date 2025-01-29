package net.e175.klaus.solarpositioning;

public class GeneratedTestEstimateForValidDateAndTime_SingleYear {

    public static double estimateForValidDateAndTime() {
        return 0;
    }

    public static double estimateForInvalidDate() {
        return -1;
    }
}

public class SolarPositionCalculator {

    public static double estimateForZeroDeltaTime() {
        return 1;
    }

    public static int estimateForValidDateAndTime(int day) {
        if (day >= DeltaT.estimateForValidDateAndTime()) {
            return -1; // invalid date
        }
        return 0;
    }

    public static int estimateForInvalidDate() {
        return -2; // invalid date
    }
}

public class TestSolarPositionCalculator {

    @Test
    public void testEstimateForValidDateAndTime_SingleYear() {
        int day = 365;
        int result = SolarPositionCalculator.estimateForValidDateAndTime(day);
        assertEquals(1, DeltaT.estimateForValidDateAndTime(day), 1);
        assertDeltaT equals (DeltaT.estimateForValidDateAndTime(day));
    }

}