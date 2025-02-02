package net.e175.klaus.solarpositioning;

public class GeneratedCalculateSolarPosition_NullDeltaT_ThrowsNullPointerException {

    @Test
    public void calculateSolarPosition_NullDeltaT_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(ZonedDateTime.now(), 0, 0, null, 0));
    }

}