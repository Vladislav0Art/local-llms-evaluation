package net.e175.klaus.solarpositioning;

public class GeneratedTestEstimateForZeroDeltaTime_SingleWeek {

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
    public void testEstimateForZeroDeltaTime_SingleWeek() {
        int day = 7;
        int result = SolarPositionCalculator.estimateForZeroDeltaTime();
        assertEquals(-1, DeltaT.estimateForZeroDeltaTime(), 0);
        assertDeltaT equals (DeltaT.estimateForZeroDeltaTime());
    }

}