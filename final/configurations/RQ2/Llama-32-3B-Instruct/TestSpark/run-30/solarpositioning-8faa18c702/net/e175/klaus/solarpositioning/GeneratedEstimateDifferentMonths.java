package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class GeneratedEstimateDifferentMonths {

    @Test
    public void estimateDifferentMonths() {
        LocalDate firstDay = LocalDate.of(2022, 12, 31);
        LocalDate secondDay = LocalDate.of(2023, 1, 10);
        double result = DeltaT.estimate(secondDay);
        assertTrue(result > DeltaT.estimate(firstDay));
    }

}