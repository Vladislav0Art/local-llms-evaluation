package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;
import net.e175.klaus.solarpositioning.DeltaT;

import java.time.LocalDate;

public class GeneratedEstimatePastDateTest {

    @Test
    public void estimatePastDateTest() {
        LocalDate pastDate = LocalDate.of(1000, 1, 1);
        Assert.assertNotEquals(0.0, DeltaT.estimate(pastDate), 0.001);
    }

}