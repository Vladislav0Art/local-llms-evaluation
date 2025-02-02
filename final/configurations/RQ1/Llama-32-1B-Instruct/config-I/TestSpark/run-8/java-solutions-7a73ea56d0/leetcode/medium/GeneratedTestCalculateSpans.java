package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestCalculateSpans {

    @Test
    public void testCalculateSpans() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] expected = {1, 2, 1, 2, 1, 2};
        assertEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

}