package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestEstimate_SimpleCase {

    @Test
    public void TestEstimate_SimpleCase() {
        LocalDate forDate = LocalDate.of(2022, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(0.001, result, 0.001);
    }

}