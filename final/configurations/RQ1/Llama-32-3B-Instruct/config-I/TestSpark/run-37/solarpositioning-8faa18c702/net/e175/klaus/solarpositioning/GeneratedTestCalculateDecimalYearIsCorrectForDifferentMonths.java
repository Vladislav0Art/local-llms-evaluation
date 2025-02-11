package net.e175.klaus.solarpositioning;

public class GeneratedTestCalculateDecimalYearIsCorrectForDifferentMonths {

    private DeltaT deltaT;

    @BeforeEach
    public void setup() {
        deltaT = new DeltaT();
    }

    @Test
    public void testCalculateDecimalYearIsCorrectForDifferentMonths() {
        when(deltaT.decimalYear(LocalDate.of(2023, 6, 15))).thenReturn(57.25);
        double result = deltaT.decimalYear(LocalDate.of(2023, 6, 15));
        assertEquals(57.25, result, 0.01);
    }

}