package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.Arrays;

public class GeneratedTestEstimate_SingleScenario {

    @Mock
    private LocalDate mockForDate;

    public static void main(String[] args) {
        new DeltaTTests();
    }

    @Test
    public void testEstimate_SingleScenario() {
        LocalDate forDate = LocalDate.of(2022, 1, 1);
        double result = getDeltaT().estimate(forDate.toEpochDay());
        assertEquals(6.0, result, 1e-8);
    }

}