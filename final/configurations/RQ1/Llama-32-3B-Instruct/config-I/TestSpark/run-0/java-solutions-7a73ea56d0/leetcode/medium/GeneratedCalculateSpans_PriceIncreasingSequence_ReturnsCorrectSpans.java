package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpans_PriceIncreasingSequence_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_PriceIncreasingSequence_ReturnsCorrectSpans() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result = stock.calculateSpans(new int[]{10, 20, 30});
        assertArrayEquals(new int[]{3, 2, 1}, result);
    }

}