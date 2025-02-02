package net.e175.klaus.solarpositioning;

public class GeneratedCalcT_NoLeapYear_ReturnsCorrectValues {

    @Test
    public void calcT_NoLeapYear_ReturnsCorrectValues() {
        // Given
        ZonedDateTime date = ZonedDateTime.now();
        int year = 2022;
        int month = 7;
        int dayOfMonth = 15;

        // When
        Grena3 calculateT = new Grena3();
        double expected = (int) (365.25 * (year - 2000)) + (int) (30.6001 * (month + 1))
                - (int) (0.01 * year) + dayOfMonth + 0.0416667;

        // Then
        assertEquals(expected, calculateT.calcT(date));
    }

}