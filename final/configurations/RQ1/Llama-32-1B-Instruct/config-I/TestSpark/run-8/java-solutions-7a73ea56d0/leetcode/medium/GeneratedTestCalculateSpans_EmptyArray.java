package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestCalculateSpans_EmptyArray {

    @Test
    public void testCalculateSpans_EmptyArray() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {};
        assertArrayEquals(new int[]{}, onlineStockSpan.calculateSpans(prices));
    }

}