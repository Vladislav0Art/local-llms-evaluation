package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTestEstimate_MultipleMinutes {

    @Test
    public void TestEstimate_MultipleMinutes() {
        LocalDate forDate = LocalDate.of(2024, 3, 10);
        double expectedValue = pow(1.0 / 120.0, 5); // approximately 1.6 days
        double actualValue = DeltaT.estimate(forDate);
        assertEquals(expectedValue, actualValue);
    }

}