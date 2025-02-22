package leetcode.medium;

import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansTest {

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] expected = {1, 1, 1, 2, 1, 4, 6};
        int[] actual = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

}