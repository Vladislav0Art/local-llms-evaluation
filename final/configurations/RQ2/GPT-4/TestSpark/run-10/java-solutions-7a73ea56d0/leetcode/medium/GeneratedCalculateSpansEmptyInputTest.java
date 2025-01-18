package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpansEmptyInputTest {

    @Test
    public void calculateSpansEmptyInputTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {};
        assertEquals(0, onlineStockSpan.calculateSpans(prices).length);
    }

}