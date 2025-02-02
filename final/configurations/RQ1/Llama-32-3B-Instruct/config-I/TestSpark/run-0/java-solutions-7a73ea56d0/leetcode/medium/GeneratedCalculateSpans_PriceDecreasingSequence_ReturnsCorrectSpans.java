package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpans_PriceDecreasingSequence_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_PriceDecreasingSequence_ReturnsCorrectSpans() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result = stock.calculateSpans(new int[]{30, 20, 10});
        assertArrayEquals(new int[]{3, 2, 1}, result);
    }

}