package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_ShortPricesArray_ReturnsCorrectResult {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_ShortPricesArray_ReturnsCorrectResult() {
        onlineStockSpan.next(10);
        int[] result = onlineStockSpan.calculateSpans(new int[]{30, 20});
        assertEquals(2, result.length);
        assertTrue(result[0] == 1 && result[1] == 2);
    }

}