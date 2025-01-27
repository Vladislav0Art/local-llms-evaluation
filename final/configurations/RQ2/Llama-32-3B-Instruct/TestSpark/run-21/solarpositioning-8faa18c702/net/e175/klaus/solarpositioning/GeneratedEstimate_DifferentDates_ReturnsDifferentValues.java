package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.Random;

public class GeneratedEstimate_DifferentDates_ReturnsDifferentValues {

    @Test
    public void estimate_DifferentDates_ReturnsDifferentValues() {
        LocalDate today = LocalDate.now();
        double result1 = DeltaT.estimate(today);
        double result2 = DeltaT.estimate(today.plusDays(1));
        assertNotEquals(result1, result2);
    }

}