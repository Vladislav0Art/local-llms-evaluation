package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

public class GeneratedEstimatePastDateTest {

    @Test
    public void estimatePastDateTest() {
        LocalDate pastDate = LocalDate.now().minusYears(100);
        double result = DeltaT.estimate(pastDate);
        Assert.assertNotNull(result);
    }

}