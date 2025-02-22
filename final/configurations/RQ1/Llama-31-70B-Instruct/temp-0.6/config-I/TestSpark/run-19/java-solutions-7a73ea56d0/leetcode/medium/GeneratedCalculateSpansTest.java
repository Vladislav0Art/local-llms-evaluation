package leetcode.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedCalculateSpansTest {

    private OnlineStockSpan onlineStockSpan;

    @BeforeEach
    public void setUp() {
        onlineStockSpan = new OnlineStockSpan();
    }

    @Test
    public void calculateSpansTest() {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] spans = onlineStockSpan.calculateSpans(prices);
        int[] expected = {1, 1, 1, 2, 1, 4, 6};
        assertArrayEquals(expected, spans);
    }

}