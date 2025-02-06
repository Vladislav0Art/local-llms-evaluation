package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNextPrice_MultipleElements_CalculateSpansCorrectly {

    @Test
    public void nextPrice_MultipleElements_CalculateSpansCorrectly() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        stockSpan.next(80);
        stockSpan.next(75);
        int[] result = stockSpan.calculateSpans(new int[]{10, 20, 30});
        assertEquals(new int[]{2, 3, 4}, result);
    }

}