package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedCalculateSpansOneElement {

    @Test
    public void calculateSpansOneElement() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result = stock.calculateSpans(new int[]{100});
        assertEquals(new int[]{1}, result);
    }

}