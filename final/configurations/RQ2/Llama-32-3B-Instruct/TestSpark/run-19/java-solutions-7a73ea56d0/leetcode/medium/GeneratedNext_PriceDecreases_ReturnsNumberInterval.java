package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNext_PriceDecreases_ReturnsNumberInterval {

    @Test
    public void next_PriceDecreases_ReturnsNumberInterval() {
        OnlineStackSpan onlineStockSpan = new OnlineStackSpan();
        int result = onlineStockSpan.next(100);
        assertEquals(1, result);

        int[] prices = {99};
        int result2 = onlineStockSpan.next(prices[0]);
        assertEquals(3, result2);
    }

}