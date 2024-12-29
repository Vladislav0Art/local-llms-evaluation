package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansEmptyArrayTest {

    @Test
    public void calculateSpansEmptyArrayTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        int[] prices = new int[]{};
        int[] result = spanner.calculateSpans(prices);
        assertEquals(0, result.length);
    }

}