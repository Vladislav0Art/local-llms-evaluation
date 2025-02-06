package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDifferentYearsReturnCorrectValue {

    @Test
    public void estimateDifferentYearsReturnCorrectValue() {
        LocalDate date1 = LocalDate.of(2022, 6, 21);
        LocalDate date2 = LocalDate.of(2019, 3, 20);
        double result1 = DeltaT.estimate(date1);
        double result2 = DeltaT.estimate(date2);
        assertDoubleAreEqual(result1, result2, 0.001); // Adjust precision as needed
    }

}