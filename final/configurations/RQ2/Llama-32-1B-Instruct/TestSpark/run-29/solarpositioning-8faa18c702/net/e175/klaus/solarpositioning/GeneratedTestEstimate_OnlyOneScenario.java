package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.Arrays;

public class GeneratedTestEstimate_OnlyOneScenario {

    @Mock
    private LocalDate mockForDate;

    public static void main(String[] args) {
        new DeltaTTests();
    }

    @Test
    public void testEstimate_OnlyOneScenario() {
        LocalDate forDate = LocalDate.of(2022, 12, 31);
        double result = getDeltaT().estimate(forDate.toEpochDay());
        assertEquals(365.25, result, 1e-8);
    }

    public static DeltaT getDeltaT() {
        return new DeltaT(mockForDate);
    }

}