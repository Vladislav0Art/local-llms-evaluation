package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestEstimate_DifferentMonthsInYear {

    @Test
    public void TestEstimate_DifferentMonthsInYear() {
        LocalDate forDate1 = LocalDate.of(2023, 6, 15); // June 15th, 2023
        LocalDate forDate2 = LocalDate.of(2024, 8, 31); // August 31st, 2024
        double result1 = DeltaT.estimate(forDate1);
        double result2 = DeltaT.estimate(forDate2);
        assertEquals(10.0, result1 + result2, 1);
    }

}