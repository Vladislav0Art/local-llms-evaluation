package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;
import net.e175.klaus.solarpositioning.DeltaT;

public class GeneratedTestEstimate_MultiplePoints {

    @Test
    public void testEstimate_MultiplePoints() {
        LocalDate forDate1 = LocalDate.of(2024, 3, 16);
        LocalDate forDate2 = LocalDate.of(2024, 3, 19);
        double expected = pow(1000, 6) * (Math.PI / 2);
        assertEquals(expected, DeltaT.estimate(forDate1).addDays(-3).subtractDays(3));
    }

}