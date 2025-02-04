package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.Optional;

public class GeneratedEstimate_CorrectDeltaForSpecificYear {

    @Test
    public void estimate_CorrectDeltaForSpecificYear() {
        LocalDate forDate = LocalDate.of(2011, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(19.7, result, 0.01);
    }

}