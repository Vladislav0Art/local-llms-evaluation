package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;
import net.e175.klaus.solarpositioning.DeltaT;

public class GeneratedTestEstimate_SinglePoint {

    @Test
    public void testEstimate_SinglePoint() {
        LocalDate forDate = LocalDate.of(2024, 3, 16);
        double expected = pow(1000, 6) * (Math.PI / 2);
        assertEquals(expected, DeltaT.estimate(forDate));
    }

}