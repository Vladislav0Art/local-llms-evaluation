package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;
import net.e175.klaus.solarpositioning.DeltaT;

import java.time.LocalDate;

public class GeneratedEstimatePresentDateTest {

    @Test
    public void estimatePresentDateTest() {
        LocalDate presentDate = LocalDate.now();
        Assert.assertNotEquals(0.0, DeltaT.estimate(presentDate), 0.001);
    }

}