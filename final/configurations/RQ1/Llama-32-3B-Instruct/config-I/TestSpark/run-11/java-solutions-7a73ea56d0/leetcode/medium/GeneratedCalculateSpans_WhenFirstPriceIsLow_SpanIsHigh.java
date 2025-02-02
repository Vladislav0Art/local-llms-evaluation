package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedCalculateSpans_WhenFirstPriceIsLow_SpanIsHigh {

    @Test
    public void calculateSpans_WhenFirstPriceIsLow_SpanIsHigh() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {70};
        int[] result = solution.calculateSpans(prices);
        assertEquals(1, (int) result[0]);
    }

}