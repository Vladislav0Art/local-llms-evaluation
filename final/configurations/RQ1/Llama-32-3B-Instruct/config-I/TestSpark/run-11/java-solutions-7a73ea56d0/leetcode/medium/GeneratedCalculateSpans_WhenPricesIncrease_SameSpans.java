package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedCalculateSpans_WhenPricesIncrease_SameSpans {

    @Test
    public void calculateSpans_WhenPricesIncrease_SameSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {100, 80};
        int[] result = solution.calculateSpans(prices);
        assertEquals(2, (int) result[0]);
    }

}