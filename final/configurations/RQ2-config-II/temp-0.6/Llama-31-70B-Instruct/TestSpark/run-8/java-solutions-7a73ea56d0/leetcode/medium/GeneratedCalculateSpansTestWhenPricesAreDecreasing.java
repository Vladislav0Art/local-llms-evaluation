package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpansTestWhenPricesAreDecreasing {

    @Test
    public void calculateSpansTestWhenPricesAreDecreasing() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {40, 30, 20, 10};
        int[] spans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 1, 1, 1}, spans);
    }

}