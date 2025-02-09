package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;
import java.util.Optional;

public class GeneratedEstimateGregorianCalendarReturnDeltaT {

    @Test
    public void estimateGregorianCalendarReturnDeltaT() {
        LocalDate date = LocalDate.of(1582, 10, 15);
        Optional<Double> result = DeltaT.estimate(date);
        assertTrue(result.isPresent());
        assertDoubleInRange(result.get(), -0.0023055517, 0.0000068952, 1e-9); // 1e-9 for floating point comparison
    }

}