package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_SpanIncreasingPrices_ReturnsCorrectResult {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_SpanIncreasingPrices_ReturnsCorrectResult() {
        onlineStockSpan.next(10);
        onlineStockSpan.next(15);
        onlineStockSpan.next(20);
        int[] result = onlineStockSpan.calculateSpans(new int[]{15, 20});
        assertEquals(2, result.length);
        assertTrue(result[0] == 1 && result[1] == 2);
    }

}