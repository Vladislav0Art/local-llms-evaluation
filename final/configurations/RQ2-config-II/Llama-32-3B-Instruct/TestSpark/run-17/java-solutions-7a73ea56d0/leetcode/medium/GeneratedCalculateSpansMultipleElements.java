package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedCalculateSpansMultipleElements {

    @Test
    public void calculateSpansMultipleElements() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result = stock.calculateSpans(new int[]{10, 7, 5, 8, 11, 9});
        assertEquals(new int[]{1, 2, 3, 4, 5, 6}, result);
    }

}