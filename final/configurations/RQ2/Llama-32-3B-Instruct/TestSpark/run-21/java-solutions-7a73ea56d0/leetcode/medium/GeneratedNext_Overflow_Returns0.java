package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNext_Overflow_Returns0 {

    @Test
    public void next_Overflow_Returns0() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {Integer.MAX_VALUE};
        for (int i = 0; i < prices.length - 1; i++) {
            onlineStockSpan.next(prices[i]);
        }
        assertEquals(0, onlineStockSpan.next(prices[prices.length - 1]));
    }

}