package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansWithEmptyPricesTest {

    @Test
    public void calculateSpansWithEmptyPricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = new int[]{};
        int[] spans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{}, spans);
    }

}