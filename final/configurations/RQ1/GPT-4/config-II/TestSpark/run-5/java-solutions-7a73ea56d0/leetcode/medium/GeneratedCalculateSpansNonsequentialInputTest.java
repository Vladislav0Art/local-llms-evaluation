package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import leetcode.medium.OnlineStockSpan;

public class GeneratedCalculateSpansNonsequentialInputTest {

    @Test
    public void calculateSpansNonsequentialInputTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[]{50, 40, 30, 20, 10});
        assertArrayEquals(new int[]{1, 1, 1, 1, 1}, result);
    }

}