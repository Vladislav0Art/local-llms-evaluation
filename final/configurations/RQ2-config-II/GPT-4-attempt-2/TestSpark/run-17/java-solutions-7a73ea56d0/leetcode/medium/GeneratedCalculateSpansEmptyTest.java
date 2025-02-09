package leetcode.medium;

import static org.junit.Assert.*;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

public class GeneratedCalculateSpansEmptyTest {

    @Test
    public void calculateSpansEmptyTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = new int[]{};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{}, result);
    }

}