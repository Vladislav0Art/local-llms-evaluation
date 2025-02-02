package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedCalculateSpans_WhenPricesAreEqual_SameSpans {

    @Test
    public void calculateSpans_WhenPricesAreEqual_SameSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {100, 100};
        int[] result = solution.calculateSpans(prices);
        assertEquals(1, (int) result[0]);
    }

}