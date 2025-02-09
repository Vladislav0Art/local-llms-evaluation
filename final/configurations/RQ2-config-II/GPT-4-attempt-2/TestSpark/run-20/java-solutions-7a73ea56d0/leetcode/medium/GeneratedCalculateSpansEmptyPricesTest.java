package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansEmptyPricesTest {

    @Test
    public void calculateSpansEmptyPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] comparison = {};
        int[] result = stockSpan.calculateSpans(comparison);
        assertArrayEquals(comparison, result);
    }

}