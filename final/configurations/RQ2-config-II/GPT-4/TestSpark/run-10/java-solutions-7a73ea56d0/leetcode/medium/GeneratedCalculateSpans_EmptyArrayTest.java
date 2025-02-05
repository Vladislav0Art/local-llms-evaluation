package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpans_EmptyArrayTest {

    @Test
    public void calculateSpans_EmptyArrayTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[0];
        int[] expectedSpans = new int[0];

        assertArrayEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

}