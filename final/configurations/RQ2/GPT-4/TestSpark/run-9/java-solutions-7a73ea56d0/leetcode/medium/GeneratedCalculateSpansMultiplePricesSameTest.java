package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansMultiplePricesSameTest {

    @Test
    public void calculateSpansMultiplePricesSameTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{100, 100, 100});
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

}