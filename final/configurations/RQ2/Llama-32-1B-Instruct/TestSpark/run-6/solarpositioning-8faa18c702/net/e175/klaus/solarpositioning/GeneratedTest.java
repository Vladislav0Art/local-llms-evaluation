package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest {

    @Test
    public void TestEstimate_SimpleCase() {
        LocalDate forDate = LocalDate.of(2022, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(0.001, result, 0.001);
    }

    @Test
    public void TestEstimate_WithDifferentMonths() {
        LocalDate forDate = LocalDate.of(2022, 6, 15); // June 15th, 2022
        double result = DeltaT.estimate(forDate);
        assertEquals(10.0, result, 1);
    }

    @Test
    public void TestEstimate_SameMonth() {
        LocalDate forDate = LocalDate.of(2022, 6, 15); // June 15th, 2022
        double result = DeltaT.estimate(forDate);
        assertEquals(0.001, result, 1);
    }

    @Test
    public void TestEstimate_DifferentMonths() {
        LocalDate forDate1 = LocalDate.of(2022, 6, 15); // June 15th, 2022
        LocalDate forDate2 = LocalDate.of(2022, 8, 15); // August 15th, 2022
        double result1 = DeltaT.estimate(forDate1);
        double result2 = DeltaT.estimate(forDate2);
        assertEquals(10.0, result1 + result2, 1);
    }

    @Test
    public void TestEstimate_DifferentYears() {
        LocalDate forDate1 = LocalDate.of(2023, 6, 15); // June 15th, 2023
        LocalDate forDate2 = LocalDate.of(2020, 8, 15); // August 15th, 2020
        double result1 = DeltaT.estimate(forDate1);
        double result2 = DeltaT.estimate(forDate2);
        assertEquals(10.0, result1 + result2, 1);
    }

    @Test
    public void TestEstimate_DifferentMonthsInYear() {
        LocalDate forDate1 = LocalDate.of(2023, 6, 15); // June 15th, 2023
        LocalDate forDate2 = LocalDate.of(2024, 8, 31); // August 31st, 2024
        double result1 = DeltaT.estimate(forDate1);
        double result2 = DeltaT.estimate(forDate2);
        assertEquals(10.0, result1 + result2, 1);
    }

}