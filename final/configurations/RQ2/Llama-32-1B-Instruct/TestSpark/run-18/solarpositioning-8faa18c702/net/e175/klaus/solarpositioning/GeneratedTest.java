package net.e175.klaus.solarpositioning;

public class GeneratedTest {

    public static String estimateDeltaT(DeltaT.estimateForZeroDeltaTime() deltaT)

    {
        return "estimated delta time is " + deltaT.getSecondsOfEarthTime();
    }

    public static String estimateDeltaT(DeltaT.estimateForValidDateAndTime(day day))

    {
        return "estimated delta time is " + dateToSecondsInEpoch(day);
    }

    private static long dateToSecondsInEpoch(Date day) {
        return (long) day.getTime() / 1000;
    }
}

public class TestSolarPositioning {

}