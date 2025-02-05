package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateTest_WithNullDate {

    @Test
    public void estimateTest_WithNullDate() {
        LocalDate date = null;
        double result = DeltaT.estimate(date);
        // expect an exception to be thrown
    }

}