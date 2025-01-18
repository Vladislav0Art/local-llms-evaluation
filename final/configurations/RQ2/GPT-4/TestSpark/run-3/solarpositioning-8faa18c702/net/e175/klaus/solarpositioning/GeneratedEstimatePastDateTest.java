package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

public class GeneratedEstimatePastDateTest {

    @Test
    public void estimatePastDateTest() {
        LocalDate pastDate = LocalDate.of(1980, 3, 30);
        double delta = DeltaT.estimate(pastDate);

        Assert.assertTrue(delta > 0);
    }

}