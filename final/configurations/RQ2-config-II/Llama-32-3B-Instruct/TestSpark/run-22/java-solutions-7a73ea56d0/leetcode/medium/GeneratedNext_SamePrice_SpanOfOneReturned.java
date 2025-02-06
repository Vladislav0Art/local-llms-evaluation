package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.ArrayList;

public class GeneratedNext_SamePrice_SpanOfOneReturned {

    @Test
    public void next_SamePrice_SpanOfOneReturned() {
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(10);
        solution.next(10);
        int[] result = solution.calculateSpans(new int[]{10, 10});
        assertEquals(Arrays.asList(1, 1), result);
    }

}