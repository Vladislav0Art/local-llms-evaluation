package net.e175.klaus.solarpositioning;

public class GeneratedTestLocalDateIsParsedCorrectly {

    private DeltaT deltaT;

    @BeforeEach
    public void setup() {
        deltaT = new DeltaT();
    }

    @Test
    public void testLocalDateIsParsedCorrectly() {
        LocalDate date = LocalDate.of(2023, 1, 1);
        double result = deltaT.estimate(date);
        assertEquals(31.25, result, 0.01);
    }

}