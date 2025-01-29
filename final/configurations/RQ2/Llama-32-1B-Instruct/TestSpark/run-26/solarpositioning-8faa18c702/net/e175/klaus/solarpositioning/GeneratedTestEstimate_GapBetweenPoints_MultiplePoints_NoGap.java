package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;
import net.e175.klaus.solarpositioning.DeltaT;

public class GeneratedTestEstimate_GapBetweenPoints_MultiplePoints_NoGap {

    @Test
    public void testEstimate_GapBetweenPoints_MultiplePoints_NoGap() {
        LocalDate forDate1 = LocalDate.of(2024, 3, 16);
        LocalDate forDate2 = LocalDate.of(2024, 3, 19);
        double expected = pow(1000, 6) * (Math.PI / 2);
        assertEquals(expected, DeltaT.estimate(forDate1).minusDays(3));
    }

}