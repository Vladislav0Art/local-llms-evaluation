package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateDateInPastTest {

    @Test
    public void estimateDateInPastTest() {
        LocalDate dateInPast = LocalDate.of(1975, 1, 1);

        double result = DeltaT.estimate(dateInPast);

        Assert.assertNotNull(result);
        Assert.assertTrue(result > 0);
    }

}