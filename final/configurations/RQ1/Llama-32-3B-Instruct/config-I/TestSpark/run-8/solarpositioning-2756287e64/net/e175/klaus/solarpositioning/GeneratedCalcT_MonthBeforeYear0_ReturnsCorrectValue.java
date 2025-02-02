package net.e175.klaus.solarpositioning;

public class GeneratedCalcT_MonthBeforeYear0_ReturnsCorrectValue {

    @Test
    public void calcT_MonthBeforeYear0_ReturnsCorrectValue() {
        assertEquals(-2.283333333, Grena3.calcT(ZonedDateTime.now().withMonth(12).withYear(2000)));
    }

}