package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import java.time.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestCalculateSolarPosition {

    @Test
    public void testCalculateSolarPosition() {
        // Arrange
        ZonedDateTime date = new ZonedDateTime(2022, 1, 15, 12, 0);
        double latitude = 52;
        double longitude = -4;

        // Act
        double[] result = Grena3.calculateSolarPosition(date, latitude, longitude);

        // Assert
        assertEquals(270.0, result[0], 1);
    }

    public static class Random {
        private static final int NUM_RANDOM_values = 100;
        private static final int MIN_VALUE = -10;
        private static final int MAX_VALUE = 20;

        public double[] generateRandomNumbers() {
            return Arrays.stream(new double[NUM_RANDOM_values]).uniformInt(MIN_VALUE, MAX_VALUE).toArray();
        }
    }

    public static class ZonedDateTime {
        public int year;
        public int month;
        public int day;
        public int hour;
        public int minute;

        public ZonedDateTime(int year, int month, int day, int hour, int minute) {
            this.year = year;
            this.month = month;
            this.day = day;
            this.hour = hour;
            this.minute = minute;
        }

        @Override
        public String toString() {
            return "ZonedDateTime{" +
                    "year=" + year +
                    ", month=" + month +
                    ", day=" + day +
                    ", hour=" + hour +
                    ", minute=" + minute +
                    '}';
        }
    }

    public static class AzimuthZenithAngle {
        private double azimuth;
        private double zenith;

        public AzimuthZenithAngle(double azimuth, double zenith) {
            this.azimuth = azimuth;
            this.zenith = zenith;
        }

        @Override
        public String toString() {
            return "AzimuthZenithAngle{" +
                    "azimuth=" + azimuth +
                    ", zenith=" + zenith +
                    '}';
        }
    }

}