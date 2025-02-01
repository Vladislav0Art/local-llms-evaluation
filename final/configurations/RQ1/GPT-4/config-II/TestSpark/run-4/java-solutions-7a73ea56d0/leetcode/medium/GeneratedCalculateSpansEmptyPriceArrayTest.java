package leetcode.medium;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansEmptyPriceArrayTest {

    @Test
    public void calculateSpansEmptyPriceArrayTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] spans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{}, spans);
    }

}