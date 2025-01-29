package net.e175.klaus.solarpositioning;

public class GeneratedTestCalculateSolarPosition {

    public static double calculateAzimuthZenithAngle(Date date, double latitude, double longitude, double DELTA_T, Double PRESSURE, Double TEMPERATURE) {
        return Grena3.calculateSolarPosition(date, latitude, longitude, DELTA_T, PRESSURE, TEMPERATURE);
    }

    @Test
    public void testCalculateSolarPosition() {
        TestSpark.run(20, solarpositioning_2756287e64::run);
    }
}

class AzimuthZenithAngle {
    private static final Date START_DATE = new Date(2024, 0, 1);

    public static double calculateAzimuthZenithAngle(Date date) {
        return Grena3.calculateSolarPosition(date, 40.7128, -74.0060, 1.0, 30.0, 40.0);
    }
}

class TestSpark {
    public static void run(int testNumber) {
        Date startDate = new Date();
        System.out.println("Test " + testNumber + ": Start date=" + startDate);

        Date endDate = new Date(startDate.getTime() + (6 * 24 * 60 * 60 * 1000));
        TestSpark.run2(20, endDate);
    }

    private static void run2(int testNumber, Date endDate) {
        System.out.println("Test " + testNumber + ": End date=" + endDate);
    }

}