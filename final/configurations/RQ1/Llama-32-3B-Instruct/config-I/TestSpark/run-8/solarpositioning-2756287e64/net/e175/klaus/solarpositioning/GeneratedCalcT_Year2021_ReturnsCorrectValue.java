package net.e175.klaus.solarpositioning;

public class GeneratedCalcT_Year2021_ReturnsCorrectValue {

    @Test
    public void calcT_Year2021_ReturnsCorrectValue() {
        assertEquals(365.25 * 21 + 30.6001 * 7 - 0.01 * 21, Grena3.calcT(ZonedDateTime.now().withYear(2021)));
    }

}