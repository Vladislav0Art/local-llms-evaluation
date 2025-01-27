package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_LargePricesArray_ReturnsCorrectResult {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_LargePricesArray_ReturnsCorrectResult() {
        onlineStockSpan.next(10000);
        onlineStockSpan.next(5000);
        onlineStockSpan.next(20000);
        int[] result = onlineStockSpan.calculateSpans(new int[]{10000, 5000});
        assertEquals(3, result.length);
        assertTrue(result[0] == 1 && result[1] == 2 && result[2] == 3);
    }

}