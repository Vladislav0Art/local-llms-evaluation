package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestEstimate_DifferentMonths {

    @Test
    public void TestEstimate_DifferentMonths() {
        LocalDate forDate1 = LocalDate.of(2022, 6, 15); // June 15th, 2022
        LocalDate forDate2 = LocalDate.of(2022, 8, 15); // August 15th, 2022
        double result1 = DeltaT.estimate(forDate1);
        double result2 = DeltaT.estimate(forDate2);
        assertEquals(10.0, result1 + result2, 1);
    }

}