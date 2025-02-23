package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedCalculateSpansTest {

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = new int[]{1, 2, 3, 4, 5};
        int[] spans = new int[]{1, 2, 3, 4, 5};
        assertArrayEquals(spans, onlineStockSpan.calculateSpans(prices));
    }

}