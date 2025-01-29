package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestCalculateSolarPositionLatitudeLongitudePressureTemperature {

    @Test
    public void testCalculateSolarPositionLatitudeLongitudePressureTemperature() {
        ZonedDateTime date = new DateTime(2022, 6, 1, 12, 0);
        double latitude = 52.5200;
        double longitude = -13.4050;
        double deltaT = 36000; // 1 hour
        double pressure = 101325; // standard atmospheric pressure in mbar
        double temperature = 288.15 + 273.15; // average temperature of the Earth's surface

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        assertEquals(21.5, result.getAzimuth(), 0);
    }

    public static class DateTime {
        public int year;
        public int month;
        public int dayOfMonth;

        public DateTime(int year, int month, int dayOfMonth) {
            this.year = year;
            this.month = month;
            this.dayOfMonth = dayOfMonth;
        }
    }

}