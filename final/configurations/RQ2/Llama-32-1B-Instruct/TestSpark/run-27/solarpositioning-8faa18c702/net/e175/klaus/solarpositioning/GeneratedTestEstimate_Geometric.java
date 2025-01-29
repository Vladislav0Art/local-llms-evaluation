package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class GeneratedTestEstimate_Geometric {

    @Test
    public void testEstimate_Geometric() {
        LocalDate forDate = LocalDate.of(2022, 1, 1);
        DeltaT deltaT = new DeltaT(forDate);
        double actual = deltaT.estimate();
        assertDoubleEquals(Math.sqrt(100), actual, 0.00001);
    }

}