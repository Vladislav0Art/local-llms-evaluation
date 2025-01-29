package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestEstimate_DifferentYears {

    @Test
    public void TestEstimate_DifferentYears() {
        LocalDate forDate1 = LocalDate.of(2023, 6, 15); // June 15th, 2023
        LocalDate forDate2 = LocalDate.of(2020, 8, 15); // August 15th, 2020
        double result1 = DeltaT.estimate(forDate1);
        double result2 = DeltaT.estimate(forDate2);
        assertEquals(10.0, result1 + result2, 1);
    }

}