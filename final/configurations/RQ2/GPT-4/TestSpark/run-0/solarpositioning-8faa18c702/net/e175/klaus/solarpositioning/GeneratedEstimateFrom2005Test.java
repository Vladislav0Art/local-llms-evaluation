package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimateFrom2005Test {

    @Test
    public void estimateFrom2005Test() {
        LocalDate date = LocalDate.of(2005, 1, 1);
        double result = DeltaT.estimate(date);
        Assert.assertEquals("Expected result is 64.3", 64.3, result, 0.001);
    }

}