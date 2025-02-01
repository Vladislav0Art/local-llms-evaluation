package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import leetcode.medium.OnlineStockSpan;

public class GeneratedCalculateSpansSequentialInputTest {

    @Test
    public void calculateSpansSequentialInputTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[]{10, 20, 30, 40, 50});
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

}