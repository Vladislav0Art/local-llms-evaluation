package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mock;

import static org.mockito.Mockito.when;

import org.mockito.Mockito;

import java.time.LocalDate;

public class GeneratedEstimateForRandomDateTest {

    @Test
    public void estimateForRandomDateTest() {
        LocalDate fordate = LocalDate.of(2015, 3, 15);
        Assert.assertNotNull(DeltaT.estimate(fordate));
    }

}