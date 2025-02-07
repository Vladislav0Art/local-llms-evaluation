package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class GeneratedCalculateSpans_MultiplePrices_ReturnsMultipleValues {

    private OnlineStockSpan instance = new OnlineStockSpan();

    @Test
    public void calculateSpans_MultiplePrices_ReturnsMultipleValues() {
        int[] prices = {70, 75, 80};
        int[] result = instance.calculateSpans(prices);
        assertEquals(3, result.length); // max coverage of line: price - first price + current index
    }

}