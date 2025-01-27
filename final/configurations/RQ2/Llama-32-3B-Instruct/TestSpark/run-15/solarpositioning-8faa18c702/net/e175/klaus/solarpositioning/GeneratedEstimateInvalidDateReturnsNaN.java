package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.time.LocalDate;
import java.util.Map;
import java.util.HashMap;

public class GeneratedEstimateInvalidDateReturnsNaN {

    @Test
    public void estimateInvalidDateReturnsNaN() {
        LocalDate forDate = LocalDate.of(2022, 13, 31);
        Double actual = DeltaT.estimate(forDate);
        assertNull(actual);
    }

}