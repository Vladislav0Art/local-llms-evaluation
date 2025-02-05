package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansSomePricesSameTest {

    @Test
    public void calculateSpansSomePricesSameTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[]{100, 200, 200, 100, 300});
        assertArrayEquals(new int[]{1, 2, 3, 1, 5}, result);
    }

}