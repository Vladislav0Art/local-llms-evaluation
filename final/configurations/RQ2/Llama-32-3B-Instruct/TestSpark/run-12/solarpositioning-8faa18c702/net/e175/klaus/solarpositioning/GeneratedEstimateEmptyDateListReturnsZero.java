package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GeneratedEstimateEmptyDateListReturnsZero {

    @Test
    public void estimateEmptyDateListReturnsZero() {
        List<LocalDate> dates = new ArrayList<>();
        double result = DeltaT.estimate(dates);
        assertEquals(0, result);
    }

}