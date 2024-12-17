package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedNextPrice_MultipleElementsArray {

    @Test
    public void nextPrice_MultipleElementsArray() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 70};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(1, result[0]);
        assertEquals(3, result[1]);
    }

}