package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GeneratedEstimateMultipleDatesReturnsCorrectValue {

    public List<LocalDate> dates = new ArrayList<>();

    @Test
    public void estimateMultipleDatesReturnsCorrectValue() {
        LocalDate date1 = LocalDate.of(2022, 1, 1);
        LocalDate date2 = LocalDate.of(2022, 1, 2);
        dates.add(date1);
        dates.add(date2);
        double result = DeltaT.estimate(dates);
        assertEquals(-11.876666666666668, result, 0.000001);
    }

}