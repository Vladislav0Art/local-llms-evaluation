package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class GeneratedCalculateSpans_DuplicatePrices_ReturnsCorrectCount {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_DuplicatePrices_ReturnsCorrectCount() {
        int[] prices = {10, 8, 9, 7, 6};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(2, result[1]); // [8, 9] span: 2
    }

}