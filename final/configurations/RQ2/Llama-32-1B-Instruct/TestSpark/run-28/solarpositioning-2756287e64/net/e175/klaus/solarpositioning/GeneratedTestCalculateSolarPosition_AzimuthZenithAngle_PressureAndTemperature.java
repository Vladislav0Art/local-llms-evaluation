package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestCalculateSolarPosition_AzimuthZenithAngle_PressureAndTemperature {

    @Test
    public void testCalculateSolarPosition_AzimuthZenithAngle_PressureAndTemperature() {
        // Arrange
        ZonedDateTime date = new ZonedDateTime(2022, 1, 15, 12, 0);
        double latitude = 52;
        double longitude = -4;
        Random random = new Random();
        double deltaT = 24; // seconds
        double pressure = 1013; // hPa
        double temperature = 288.15 + (random.nextDouble() * 10); // K

        // Act
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        // Assert
        assertEquals(273.16, result.getAzimuth(), 1);
    }
}

class ZonedDateTime {
    private final LocalDateTime date;
    private final ZoneOffset zone;

    public ZonedDateTime(LocalDateTime date, ZoneOffset zone) {
        this.date = date;
        this.zone = zone;
    }

    public int getYear() {
        return date.getYear();
    }

    public int getMonth() {
        return date.getMonthValue();
    }

    public int getDayOfMonth() {
        return date.getDayOfMonth();
    }
}

class AzimuthZenithAngle {
    private final double azimuth;

    public AzimuthZenithAngle(double azimuth) {
        this.azimuth = azimuth;
    }

    public double getAzimuth() {
        return azimuth;
    }

}