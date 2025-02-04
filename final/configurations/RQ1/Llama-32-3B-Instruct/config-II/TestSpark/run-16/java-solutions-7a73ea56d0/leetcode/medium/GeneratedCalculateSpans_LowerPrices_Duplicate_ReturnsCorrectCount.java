package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class GeneratedCalculateSpans_LowerPrices_Duplicate_ReturnsCorrectCount {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_LowerPrices_Duplicate_ReturnsCorrectCount() {
        int[] prices = {5, 4, 4, 3};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(3, result[1]); // [5, 4] span: 2
    }

}