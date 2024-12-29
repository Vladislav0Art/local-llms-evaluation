package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimateFrom1973Test {

    @Test
    public void estimateFrom1973Test() {
        LocalDate date = LocalDate.of(1973, 1, 1);
        double result = DeltaT.estimate(date);
        Assert.assertEquals("Expected result is 12", 12, result, 0.001);
    }

}