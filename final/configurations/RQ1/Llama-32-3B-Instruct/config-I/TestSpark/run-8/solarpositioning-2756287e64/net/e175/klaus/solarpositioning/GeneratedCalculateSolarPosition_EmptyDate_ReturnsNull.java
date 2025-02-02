package net.e175.klaus.solarpositioning;

public class GeneratedCalculateSolarPosition_EmptyDate_ReturnsNull {

    @Test
    public void calculateSolarPosition_EmptyDate_ReturnsNull() {
        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(null, 0, 0, 0));
    }

}