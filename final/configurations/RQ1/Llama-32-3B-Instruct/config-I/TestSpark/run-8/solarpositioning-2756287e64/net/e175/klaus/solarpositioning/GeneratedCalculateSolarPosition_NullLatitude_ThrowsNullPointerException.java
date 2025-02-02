package net.e175.klaus.solarpositioning;

public class GeneratedCalculateSolarPosition_NullLatitude_ThrowsNullPointerException {

    @Test
    public void calculateSolarPosition_NullLatitude_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(ZonedDateTime.now(), null, 0, 0, 0));
    }

}