package net.e175.klaus.solarpositioning;

public class GeneratedCalcT_WithLeapYear_ReturnsCorrectValues {

    @Test
    public void calcT_WithLeapYear_ReturnsCorrectValues() {
        // Given
        ZonedDateTime date = ZonedDateTime.now();
        int year = 2024;
        int month = 2;
        int dayOfMonth = 29;

        // When
        Grena3 calculateT = new Grena3();
        double expected = (int) (365.25 * (year - 2000)) + (int) (30.6001 * (month + 1))
                - (int) (0.01 * year) + dayOfMonth + 0.0416667;

        // Then
        assertEquals(expected, calculateT.calcT(date));
    }

}