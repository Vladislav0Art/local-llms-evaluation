package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNext_MultipleTimes_ReturnsIncreasingSpans {

    @Test
    public void next_MultipleTimes_ReturnsIncreasingSpans() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 7, 5, 8, 11, 9};
        for (int i = 0; i < prices.length - 1; i++) {
            onlineStockSpan.next(prices[i]);
            assertEquals(i + 2, onlineStockSpan.next(prices[i + 1]));
        }
    }

}