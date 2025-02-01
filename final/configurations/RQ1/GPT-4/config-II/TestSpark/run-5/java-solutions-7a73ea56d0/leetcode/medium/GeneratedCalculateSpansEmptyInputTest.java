package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import leetcode.medium.OnlineStockSpan;

public class GeneratedCalculateSpansEmptyInputTest {

    @Test
    public void calculateSpansEmptyInputTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[]{});
        assertArrayEquals(new int[]{}, result);
    }

}