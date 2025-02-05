package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansIncreasingArrayTest {

    @Test
    public void calculateSpansIncreasingArrayTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] increasingArray = new int[]{6, 7, 8, 9, 10};
        int[] spans = onlineStockSpan.calculateSpans(increasingArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, spans);
    }

}