package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansAllPricesDecreasingTest {

    @Test
    public void calculateSpansAllPricesDecreasingTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[]{500, 400, 300, 200, 100});
        assertArrayEquals(new int[]{1, 1, 1, 1, 1}, result);
    }

}