package net.e175.klaus.solarpositioning;

public class GeneratedTestCalculatingSolarPosition {

    public double calculateAzimuthZenithAngle(Date date, double latitude, double longitude, double DELTA_T, Double PRESSURE, Double TEMPERATURE) {
        return Grena3.calculateSolarPosition(date, latitude, longitude, DELTA_T, null, TEMPERATURE);
    }

    @Test
    public void testCalculatingSolarPosition() {
        TestSpark.run(20, solarpositioning_2756287e64::run);
    }
}

public class AzimuthZenithAngle {
    private static final double ZERO = 0.0;
    private static final double PI = Math.PI;

    public static double calculateSolarPosition(Date date, double latitude, double longitude, double DELTA_T, Double PRESSURE, Double TEMPERATURE) {
        return calculateAzimuthZenithAngle(date, latitude, longitude, DELTA_T, PRESSURE, TEMPERATURE).getAzimuthZenithAngle();
    }

}