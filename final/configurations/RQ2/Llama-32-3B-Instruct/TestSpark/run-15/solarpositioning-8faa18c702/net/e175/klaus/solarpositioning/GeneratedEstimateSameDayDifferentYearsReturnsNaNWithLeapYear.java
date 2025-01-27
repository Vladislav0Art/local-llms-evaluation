package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.time.LocalDate;
import java.util.Map;
import java.util.HashMap;

public class GeneratedEstimateSameDayDifferentYearsReturnsNaNWithLeapYear {

    @Test
    public void estimateSameDayDifferentYearsReturnsNaNWithLeapYear() {
        LocalDate forDate1 = LocalDate.of(2024, 13, 31);
        Double actual = DeltaT.estimate(forDate1);
        assertNull(actual);
    }

}