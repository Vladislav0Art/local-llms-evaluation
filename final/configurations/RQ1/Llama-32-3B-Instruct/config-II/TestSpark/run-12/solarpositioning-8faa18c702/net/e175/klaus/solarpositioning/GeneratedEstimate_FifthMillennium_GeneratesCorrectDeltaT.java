package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.Optional;

public class GeneratedEstimate_FifthMillennium_GeneratesCorrectDeltaT {

    @Test
    public void estimate_FifthMillennium_GeneratesCorrectDeltaT() {
        LocalDate forDate = LocalDate.of(1820, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(-20, result, 0.01);
    }

}