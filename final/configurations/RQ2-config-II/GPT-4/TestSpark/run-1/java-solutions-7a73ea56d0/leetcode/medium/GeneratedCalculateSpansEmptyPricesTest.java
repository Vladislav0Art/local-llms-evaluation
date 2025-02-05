package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansEmptyPricesTest {

    @Test
    public void calculateSpansEmptyPricesTest() {
        OnlineStockSpan spanCalculator = new OnlineStockSpan();

        int[] spans = spanCalculator.calculateSpans(new int[0]);

        assertArrayEquals(new int[]{}, spans);
    }

}