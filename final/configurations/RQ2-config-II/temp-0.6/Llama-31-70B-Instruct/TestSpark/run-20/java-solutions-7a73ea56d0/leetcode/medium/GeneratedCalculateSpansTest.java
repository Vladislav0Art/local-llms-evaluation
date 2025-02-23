package leetcode.medium;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansTest {

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 5, 100};
        int[] expectedSpans = {1, 2, 1};
        int[] actualSpans = stockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, actualSpans);
    }

}