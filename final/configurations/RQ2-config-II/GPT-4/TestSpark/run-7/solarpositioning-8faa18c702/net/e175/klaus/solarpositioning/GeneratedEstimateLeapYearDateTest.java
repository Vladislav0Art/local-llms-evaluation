package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mock;

import static org.mockito.Mockito.when;

import org.mockito.Mockito;

import java.time.LocalDate;

public class GeneratedEstimateLeapYearDateTest {

    @Test
    public void estimateLeapYearDateTest() {
        LocalDate leapYearDate = LocalDate.of(2020, 2, 29);
        double deltaT = DeltaT.estimate(leapYearDate);
        Assert.assertNotNull(deltaT);
    }

}