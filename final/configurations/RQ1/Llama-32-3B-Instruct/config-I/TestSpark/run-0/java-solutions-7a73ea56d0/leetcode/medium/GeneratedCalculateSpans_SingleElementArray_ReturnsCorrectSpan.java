package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpans_SingleElementArray_ReturnsCorrectSpan {

    @Test
    public void calculateSpans_SingleElementArray_ReturnsCorrectSpan() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result = stock.calculateSpans(new int[]{10});
        assertArrayEquals(new int[]{1}, result);
    }

}