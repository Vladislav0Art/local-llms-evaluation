package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedCalculateSpansEmptyArray {

    @Test
    public void calculateSpansEmptyArray() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result = stock.calculateSpans(new int[]{100, 105, 110});
        assertEquals(new int[]{1, 2, 3}, result);
    }

}