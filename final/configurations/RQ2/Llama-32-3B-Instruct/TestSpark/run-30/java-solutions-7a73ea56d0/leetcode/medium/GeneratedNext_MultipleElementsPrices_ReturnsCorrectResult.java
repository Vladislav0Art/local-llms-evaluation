package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_MultipleElementsPrices_ReturnsCorrectResult {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_MultipleElementsPrices_ReturnsCorrectResult() {
        onlineStockSpan.next(10);
        onlineStockSpan.next(20);
        onlineStockSpan.next(30);
        int[] result = onlineStockSpan.calculateSpans(new int[]{10, 20, 30});
        assertEquals(3, result.length);
        assertTrue(result[0] == 1 && result[1] == 2 && result[2] == 3);
    }

}