package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansAllPricesIncreasingTest {

    @Test
    public void calculateSpansAllPricesIncreasingTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[]{100, 200, 300, 400, 500});
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

}