package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansTest {

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {1, 2, 3};
        int[] expectedSpans = {1, 2, 3};
        assertArrayEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

}