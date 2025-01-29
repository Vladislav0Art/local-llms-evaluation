package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;
import net.e175.klaus.solarpositioning.DeltaT;

public class GeneratedTestEstimate_NoTimeRange {

    @Test
    public void testEstimate_NoTimeRange() {
        LocalDate forDate = LocalDate.of(2022, 1, 1);
        assertEquals(Double.NaN, DeltaT.estimate(forDate));
    }

}