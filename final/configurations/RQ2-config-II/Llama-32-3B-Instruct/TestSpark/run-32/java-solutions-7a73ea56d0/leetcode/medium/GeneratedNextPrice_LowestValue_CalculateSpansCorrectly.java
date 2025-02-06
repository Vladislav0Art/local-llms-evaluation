package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNextPrice_LowestValue_CalculateSpansCorrectly {

    @Test
    public void nextPrice_LowestValue_CalculateSpansCorrectly() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        stockSpan.next(80);
        stockSpan.next(60);
        int[] result = stockSpan.calculateSpans(new int[]{10, 20, 30});
        assertEquals(new int[]{2, 3, 4}, result);
    }

}