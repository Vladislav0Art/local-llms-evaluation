package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansEmptyArrayTest {

    @Test
    public void calculateSpansEmptyArrayTest() {
        OnlineStockSpan onSpan = new OnlineStockSpan();
        int[] prices = new int[]{};
        int[] result = onSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{}, result);
    }

}