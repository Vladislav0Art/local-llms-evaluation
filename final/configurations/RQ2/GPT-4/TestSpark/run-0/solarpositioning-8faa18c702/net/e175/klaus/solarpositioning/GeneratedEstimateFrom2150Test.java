package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimateFrom2150Test {

    @Test
    public void estimateFrom2150Test() {
        LocalDate date = LocalDate.of(2150, 1, 1);
        double result = DeltaT.estimate(date);
        Assert.assertEquals("Expected result is 411.1", 411.1, result, 0.001);
    }

}