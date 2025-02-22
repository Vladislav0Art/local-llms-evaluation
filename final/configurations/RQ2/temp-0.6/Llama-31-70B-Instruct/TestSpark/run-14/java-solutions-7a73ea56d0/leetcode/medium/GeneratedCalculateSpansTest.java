package leetcode.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedCalculateSpansTest {

    private OnlineStockSpan stockSpan;

    @Before
    public void setup() {
        stockSpan = new OnlineStockSpan();
    }

    @Test
    public void calculateSpansTest() {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] expectedSpans = {1, 1, 1, 2, 1, 4, 6};
        int[] actualSpans = stockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, actualSpans);
    }

}