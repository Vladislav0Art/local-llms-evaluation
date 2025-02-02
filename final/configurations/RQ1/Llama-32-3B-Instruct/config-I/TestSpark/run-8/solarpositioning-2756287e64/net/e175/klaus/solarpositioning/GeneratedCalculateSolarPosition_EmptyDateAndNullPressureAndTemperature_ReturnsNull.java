package net.e175.klaus.solarpositioning;

public class GeneratedCalculateSolarPosition_EmptyDateAndNullPressureAndTemperature_ReturnsNull {

    @Test
    public void calculateSolarPosition_EmptyDateAndNullPressureAndTemperature_ReturnsNull() {
        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(null, 0, 0, 0, 0, 0));
    }

}