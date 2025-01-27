package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNext_PriceIncreases_ReturnsNumberInterval {

    @Test
    public void next_PriceIncreases_ReturnsNumberInterval() {
        OnlineStackSpan onlineStockSpan = new OnlineStackSpan();
        int result = onlineStockSpan.next(100);
        assertEquals(1, result);

        int[] prices = {101};
        int result2 = onlineStockSpan.next(prices[0]);
        assertEquals(2, result2);
    }

}