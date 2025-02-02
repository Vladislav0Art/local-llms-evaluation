package net.e175.klaus.solarpositioning;

public class GeneratedCalculateSolarPosition_NullLongitude_ThrowsNullPointerException {

    @Test
    public void calculateSolarPosition_NullLongitude_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(ZonedDateTime.now(), 0, null, 0, 0));
    }

}