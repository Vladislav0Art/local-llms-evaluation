package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mock;

import static org.mockito.Mockito.when;

import org.mockito.Mockito;

import java.time.LocalDate;

public class GeneratedEstimateNonLeapYearDateTest {

    @Test
    public void estimateNonLeapYearDateTest() {
        LocalDate nonLeapYearDate = LocalDate.of(2019, 2, 28);
        double deltaT = DeltaT.estimate(nonLeapYearDate);
        Assert.assertNotNull(deltaT);
    }

}