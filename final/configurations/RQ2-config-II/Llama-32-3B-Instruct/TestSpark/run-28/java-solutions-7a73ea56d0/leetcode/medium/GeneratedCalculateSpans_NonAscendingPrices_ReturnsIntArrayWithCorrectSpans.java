package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class GeneratedCalculateSpans_NonAscendingPrices_ReturnsIntArrayWithCorrectSpans {

    @Test
    public void calculateSpans_NonAscendingPrices_ReturnsIntArrayWithCorrectSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 70};
        int[] result = solution.calculateSpans(prices);
        assertEquals(4, result.length);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(3, result[2]);
        assertEquals(4, result[3]);
    }

}