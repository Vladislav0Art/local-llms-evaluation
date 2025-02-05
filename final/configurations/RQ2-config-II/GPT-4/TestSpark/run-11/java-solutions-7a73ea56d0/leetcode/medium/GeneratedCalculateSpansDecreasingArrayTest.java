package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansDecreasingArrayTest {

    @Test
    public void calculateSpansDecreasingArrayTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] decreasingArray = new int[]{10, 9, 8, 7, 6};
        int[] spans = onlineStockSpan.calculateSpans(decreasingArray);
        assertArrayEquals(new int[]{1, 1, 1, 1, 1}, spans);
    }

}