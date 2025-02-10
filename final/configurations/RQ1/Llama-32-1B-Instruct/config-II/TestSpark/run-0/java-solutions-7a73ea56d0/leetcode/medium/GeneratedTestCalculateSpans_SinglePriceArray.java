package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

import java.util.Arrays;

public class GeneratedTestCalculateSpans_SinglePriceArray {

    @Test
    public void testCalculateSpans_SinglePriceArray() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10};
        int[] expected = {1};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(expected, result);
    }

}