package net.e175.klaus.solarpositioning;

public class GeneratedCalcT_ValidDateAndTime_ReturnsDouble {

    @Test
    public void calcT_ValidDateAndTime_ReturnsDouble() {
        ZonedDateTime date = ZonedDateTime.of(2022, 12, 25, 12, 30, 0);
        assertEquals(1.1574e-5 * Double.MIN_VALUE, Grena3.calcT(date), 1e-6);
    }

}