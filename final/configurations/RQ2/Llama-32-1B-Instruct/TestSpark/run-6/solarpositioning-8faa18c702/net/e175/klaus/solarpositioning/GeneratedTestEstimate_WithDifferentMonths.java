package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestEstimate_WithDifferentMonths {

    @Test
    public void TestEstimate_WithDifferentMonths() {
        LocalDate forDate = LocalDate.of(2022, 6, 15); // June 15th, 2022
        double result = DeltaT.estimate(forDate);
        assertEquals(10.0, result, 1);
    }

}