package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void estimateNullDateTest() {
        try {
            DeltaT.estimate(null);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            Assert.assertEquals("date is null", ex.getMessage());
        }
    }

    @Test
    public void estimateBefore1972Test() {
        LocalDate date = LocalDate.of(1971, 12, 31);
        double result = DeltaT.estimate(date);
        Assert.assertEquals("Expected result is 0", 0, result, 0.001);
    }

    @Test
    public void estimateFrom1973Test() {
        LocalDate date = LocalDate.of(1973, 1, 1);
        double result = DeltaT.estimate(date);
        Assert.assertEquals("Expected result is 12", 12, result, 0.001);
    }

    @Test
    public void estimateFrom2005Test() {
        LocalDate date = LocalDate.of(2005, 1, 1);
        double result = DeltaT.estimate(date);
        Assert.assertEquals("Expected result is 64.3", 64.3, result, 0.001);
    }

    @Test
    public void estimateFrom2050Test() {
        LocalDate date = LocalDate.of(2050, 1, 1);
        double result = DeltaT.estimate(date);
        Assert.assertEquals("Expected result is 93.4", 93.4, result, 0.001);
    }

    @Test
    public void estimateFrom2150Test() {
        LocalDate date = LocalDate.of(2150, 1, 1);
        double result = DeltaT.estimate(date);
        Assert.assertEquals("Expected result is 411.1", 411.1, result, 0.001);
    }

}