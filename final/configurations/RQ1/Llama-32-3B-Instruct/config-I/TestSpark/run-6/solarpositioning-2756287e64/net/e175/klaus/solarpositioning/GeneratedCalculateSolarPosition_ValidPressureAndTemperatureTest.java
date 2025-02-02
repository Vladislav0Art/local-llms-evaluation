package net.e175.klaus.solarpositioning;

public class GeneratedCalculateSolarPosition_ValidPressureAndTemperatureTest {

    @Test
    public void calculateSolarPosition_ValidPressureAndTemperatureTest() {
        final ZonedDateTime date = ZonedDateTime.now();
        final double pressure = 100;
        final double temperature = 20;
        final AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, 40, -120, 1.0, pressure, temperature);
        assertNotNull(result);
    }

}