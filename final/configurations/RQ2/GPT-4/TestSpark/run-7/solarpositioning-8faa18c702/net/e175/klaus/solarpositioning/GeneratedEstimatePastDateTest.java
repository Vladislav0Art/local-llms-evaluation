package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimatePastDateTest {

    @Test
    public void estimatePastDateTest() {
        LocalDate pastDate = LocalDate.of(1985, 12, 7);
        double result = DeltaT.estimate(pastDate);
        Assert.assertNotNull(result);
    }

}