package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GeneratedEstimateEmptyListReturnsZero {

    public List<LocalDate> dates = new ArrayList<>();

    @Test
    public void estimateEmptyListReturnsZero() {
        double result = DeltaT.estimate(dates);
        assertEquals(0, result);
    }

}