package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansMultipleDecreasingPricesTest {

    @Test
    public void calculateSpansMultipleDecreasingPricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {50, 40, 30, 20, 10};
        int[] expectedSpans = {1, 1, 1, 1, 1};
        assertArrayEquals(expectedSpans, onlineStockSpan.calculateSpans(prices));
    }

}