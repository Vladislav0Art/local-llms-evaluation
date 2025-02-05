package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansSinglePriceTest {

    @Test
    public void calculateSpansSinglePriceTest() {
        OnlineStockSpan spanCalculator = new OnlineStockSpan();

        int[] prices = {100};
        int[] spans = spanCalculator.calculateSpans(prices);

        assertArrayEquals(new int[]{1}, spans);
    }

}