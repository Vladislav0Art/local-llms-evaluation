package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedCalculateSpansTest2 {

    @Test
    public void calculateSpansTest2() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 60, 70, 60, 75, 85, 100};
        int[] expected = {1, 1, 1, 2, 1, 4, 6, 8};
        assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

}