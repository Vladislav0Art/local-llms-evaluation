package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestEstimate_DeltaTWithInvalidDate {

    @Test
    public void testEstimate_DeltaTWithInvalidDate() {
        LocalDate forDate = LocalDate.of(2024, 1, 32);
        assertThrows(IllegalArgumentException.class, () -> DeltaT.estimate(forDate));
    }

}