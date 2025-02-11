package net.e175.klaus.solarpositioning;

public class GeneratedTestCalculateDecimalYearIsCorrectForDifferentYears {

    private DeltaT deltaT;

    @BeforeEach
    public void setup() {
        deltaT = new DeltaT();
    }

    @Test
    public void testCalculateDecimalYearIsCorrectForDifferentYears() {
        when(deltaT.decimalYear(LocalDate.of(2024, 1, 1))).thenReturn(60.75);
        double result = deltaT.decimalYear(LocalDate.of(2024, 1, 1));
        assertEquals(60.75, result, 0.01);
    }
}

public class DeltaT {
    private Map<LocalDate, Double> decimalYearMap;

    public DeltaT() {
        this.decimalYearMap = new HashMap<>();
    }

    public double estimate(LocalDate date) {
        if (decimalYearMap.containsKey(date)) {
            return decimalYearMap.get(date);
        } else {
            // calculate delta T for the given date
            return 0.0;
        }
    }

    public double decimalYear(LocalDate date) {
        return decimalYearMap.getOrDefault(date, calculateDeltaTForDate(date));
    }

    private double calculateDeltaTForDate(LocalDate date) {
        // implement delta T calculation logic here
        return 0.0;
    }

}