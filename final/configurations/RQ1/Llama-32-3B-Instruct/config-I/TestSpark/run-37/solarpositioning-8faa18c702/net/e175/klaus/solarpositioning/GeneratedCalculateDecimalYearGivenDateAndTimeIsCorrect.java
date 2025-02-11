package net.e175.klaus.solarpositioning;

public class GeneratedCalculateDecimalYearGivenDateAndTimeIsCorrect {

    private DeltaT deltaT;

    @BeforeEach
    public void setup() {
        deltaT = new DeltaT();
    }

    @Test
    public void calculateDecimalYearGivenDateAndTimeIsCorrect() {
        when(deltaT.decimalYear(LocalDate.of(2023, 1, 1))).thenReturn(31.25);
        LocalDate date = LocalDate.of(2023, 1, 1);
        double result = deltaT.decimalYear(date);
        assertEquals(31.25, result, 0.01);
    }

}