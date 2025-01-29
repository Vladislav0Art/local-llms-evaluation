package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestEstimate_DailyDistance {

    @Test
    public void testEstimate_DailyDistance() {
        LocalDate forDate = LocalDate.of(2022, 12, 31);
        double expectedDistance = pow(86400, -5.7); // approximately 1 km per day
        double actualDistance = DeltaT.estimate(forDate);
        assertEquals(expectedDistance, actualDistance, 1e-6); // check for floating point precision error
    }

}