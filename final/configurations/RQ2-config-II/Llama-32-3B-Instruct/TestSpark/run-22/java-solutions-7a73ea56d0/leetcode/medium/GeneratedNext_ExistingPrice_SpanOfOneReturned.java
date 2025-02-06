package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.ArrayList;

public class GeneratedNext_ExistingPrice_SpanOfOneReturned {

    @Test
    public void next_ExistingPrice_SpanOfOneReturned() {
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(10);
        solution.next(5);
        solution.next(15);
        int[] result = solution.calculateSpans(new int[]{10, 5, 15});
        assertEquals(Arrays.asList(1, 2, 3), result);
    }

}