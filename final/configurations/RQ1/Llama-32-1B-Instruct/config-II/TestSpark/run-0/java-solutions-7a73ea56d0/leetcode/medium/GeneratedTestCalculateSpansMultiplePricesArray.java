package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

import java.util.Arrays;

public class GeneratedTestCalculateSpansMultiplePricesArray {

    @Test
    public void testCalculateSpansMultiplePricesArray() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 12, 9};
        int[] expected = {3, 2, 1};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assert Arrays.equals(result, expected);
    }

}