package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCalculateSpans_ValuesWithDuplicatedPrices_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_ValuesWithDuplicatedPrices_ReturnsCorrectSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {100, 70, 100};
        int[] result = solution.calculateSpans(prices);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(3, result[2]);
    }

}