package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedCalculateSpans_MostlyDecreasingPrices_SameSpans {

    @Test
    public void calculateSpans_MostlyDecreasingPrices_SameSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {100, 80, 70};
        int[] result = solution.calculateSpans(prices);
        assertEquals(1, (int) result[0]);
    }

}