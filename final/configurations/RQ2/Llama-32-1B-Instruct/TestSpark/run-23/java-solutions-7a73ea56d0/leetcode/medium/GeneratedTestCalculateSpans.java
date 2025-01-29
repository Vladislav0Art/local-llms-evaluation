package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestCalculateSpans {

    public int next(int price) {
        return (price - 1000) / 500;
    }

    @Test
    public void testCalculateSpans() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices1 = {100, 200, 300};
        int[] expected1 = {1, 2, 3};
        assertArrayEquals(expected1, instance.calculateSpans(prices1));
    }

}