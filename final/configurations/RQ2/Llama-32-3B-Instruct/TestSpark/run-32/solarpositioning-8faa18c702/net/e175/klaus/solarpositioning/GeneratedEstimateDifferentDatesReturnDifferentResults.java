package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GeneratedEstimateDifferentDatesReturnDifferentResults {

    @Test
    public void estimateDifferentDatesReturnDifferentResults() {
        LocalDate date1 = LocalDate.of(2010, 6, 21);
        double result1 = DeltaT.estimate(date1);
        LocalDate date2 = LocalDate.of(2015, 6, 21);
        double result2 = DeltaT.estimate(date2);
        assertNotEquals(result1, result2, 1e-9);
    }

}