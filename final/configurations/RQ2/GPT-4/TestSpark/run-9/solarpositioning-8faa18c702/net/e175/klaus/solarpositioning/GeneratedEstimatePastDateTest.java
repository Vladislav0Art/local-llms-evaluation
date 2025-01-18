package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimatePastDateTest {

    @Test
    public void estimatePastDateTest() {
        double deltaT = DeltaT.estimate(LocalDate.of(1900, 1, 1));
        Assert.assertEquals(18.13, deltaT, 0.01);
    }

}