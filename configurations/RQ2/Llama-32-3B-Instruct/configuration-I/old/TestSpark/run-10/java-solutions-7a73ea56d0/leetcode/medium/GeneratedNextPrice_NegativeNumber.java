package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedNextPrice_NegativeNumber {

    @Test
    public void nextPrice_NegativeNumber() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int price = -10;
        int[] result = stockSpan.next(price);
        assertEquals(1, result);
    }
}

public class OnlineStockSpan {

    private int span = 0;

    public int[] calculateSpans(int[] prices) {
        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length; i++) { // Fix: added less-than sign
            result[i] = next(prices[i]);
        }
        return result;
    }

    public int next(int price) {
        span++;
        return span;
    }

}