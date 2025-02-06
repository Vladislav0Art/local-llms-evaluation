package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNextPrice_DuplicateValues_ReturnsCorrectSpans {

    @Test
    public void nextPrice_DuplicateValues_ReturnsCorrectSpans() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        stockSpan.next(100);
        stockSpan.next(80);
        int[] result = stockSpan.calculateSpans(new int[]{10, 20, 30});
        assertEquals(new int[]{2, 3, 4}, result);
    }

}