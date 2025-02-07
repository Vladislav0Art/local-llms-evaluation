package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class GeneratedCalculateSpans_SinglePrice_ReturnsSingleValue {

    private OnlineStockSpan instance = new OnlineStockSpan();

    @Test
    public void calculateSpans_SinglePrice_ReturnsSingleValue() {
        int[] prices = {10};
        int[] result = instance.calculateSpans(prices);
        assertEquals(1, result[0]); // max coverage of line: price - first price + current index
    }

}