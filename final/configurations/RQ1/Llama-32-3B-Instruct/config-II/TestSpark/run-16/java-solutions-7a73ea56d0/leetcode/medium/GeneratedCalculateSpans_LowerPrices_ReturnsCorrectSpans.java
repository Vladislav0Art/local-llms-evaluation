package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class GeneratedCalculateSpans_LowerPrices_ReturnsCorrectSpans {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_LowerPrices_ReturnsCorrectSpans() {
        int[] prices = {5, 4, 3};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(result, new int[]{1, 2, 3});
    }

}