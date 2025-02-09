package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateForFutureDateTest {

    @Test
    public void estimateForFutureDateTest() {
        LocalDate futureDate = LocalDate.of(3000, 1, 1);
        double result = DeltaT.estimate(futureDate);
        assertEquals(3387.55, result, 0.001);
    }

}