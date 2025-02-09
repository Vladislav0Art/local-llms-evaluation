package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

public class GeneratedEstimatePresentDateTest {

    @Test
    public void estimatePresentDateTest() {
        LocalDate presentDate = LocalDate.now();
        double result = DeltaT.estimate(presentDate);
        Assert.assertNotNull(result);
    }

}