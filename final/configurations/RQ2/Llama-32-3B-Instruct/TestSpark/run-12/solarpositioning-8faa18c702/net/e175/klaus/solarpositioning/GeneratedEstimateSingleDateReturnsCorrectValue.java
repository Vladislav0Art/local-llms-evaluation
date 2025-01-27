package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GeneratedEstimateSingleDateReturnsCorrectValue {

    public List<LocalDate> dates = new ArrayList<>();

    @Test
    public void estimateSingleDateReturnsCorrectValue() {
        LocalDate date = LocalDate.of(2022, 1, 1);
        dates.add(date);
        double result = DeltaT.estimate(dates);
        assertEquals(-12.044333833333334, result, 0.000001);
    }

}