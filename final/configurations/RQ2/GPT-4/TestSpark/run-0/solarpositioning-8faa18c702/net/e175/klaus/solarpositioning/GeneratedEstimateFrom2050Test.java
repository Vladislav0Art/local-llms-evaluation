package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimateFrom2050Test {

    @Test
    public void estimateFrom2050Test() {
        LocalDate date = LocalDate.of(2050, 1, 1);
        double result = DeltaT.estimate(date);
        Assert.assertEquals("Expected result is 93.4", 93.4, result, 0.001);
    }

}