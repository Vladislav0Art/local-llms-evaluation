package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedNext_GivenPriceZero_ReturnsOne {

    @Test
    public void next_GivenPriceZero_ReturnsOne() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int result = stockSpan.next(0);
        assertEquals(1, result);
    }

}