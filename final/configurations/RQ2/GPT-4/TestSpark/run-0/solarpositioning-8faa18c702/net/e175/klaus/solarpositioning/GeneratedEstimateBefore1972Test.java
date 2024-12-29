package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimateBefore1972Test {

    @Test
    public void estimateBefore1972Test() {
        LocalDate date = LocalDate.of(1971, 12, 31);
        double result = DeltaT.estimate(date);
        Assert.assertEquals("Expected result is 0", 0, result, 0.001);
    }

}