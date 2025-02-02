package net.e175.klaus.solarpositioning;

public class GeneratedCalculateT_ValidDate_ReturnsDouble {

    @Test
    public void calculateT_ValidDate_ReturnsDouble() {
        ZonedDateTime date = ZonedDateTime.ofNow();
        assertEquals(0.0, Grena3.calcT(date), 1e-6);
    }

}