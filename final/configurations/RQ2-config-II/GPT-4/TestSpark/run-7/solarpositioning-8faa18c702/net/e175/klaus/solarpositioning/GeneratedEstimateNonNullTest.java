package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mock;

import static org.mockito.Mockito.when;

import org.mockito.Mockito;

import java.time.LocalDate;

public class GeneratedEstimateNonNullTest {

    @Test
    public void estimateNonNullTest() {
        LocalDate fordate = LocalDate.now();
        Assert.assertNotNull(DeltaT.estimate(fordate));
    }

}