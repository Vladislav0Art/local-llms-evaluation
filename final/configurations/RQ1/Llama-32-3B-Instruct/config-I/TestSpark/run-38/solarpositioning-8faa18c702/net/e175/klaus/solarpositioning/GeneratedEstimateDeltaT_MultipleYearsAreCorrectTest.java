package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDeltaT_MultipleYearsAreCorrectTest {

    @Test
    public void estimateDeltaT_MultipleYearsAreCorrectTest() {
        LocalDate forDate = LocalDate.of(2000, 1, 1);
        assertEquals(Double.valueOf(-20 + 32 * pow(((forDate.getYear() - 1820) / 100), 2)), DeltaT.estimate(forDate));
    }

}