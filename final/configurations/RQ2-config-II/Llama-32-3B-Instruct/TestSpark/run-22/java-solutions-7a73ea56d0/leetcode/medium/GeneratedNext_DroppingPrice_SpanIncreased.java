package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.ArrayList;

public class GeneratedNext_DroppingPrice_SpanIncreased {

    @Test
    public void next_DroppingPrice_SpanIncreased() {
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(10);
        solution.next(8);
        solution.next(5);
        int[] result = solution.calculateSpans(new int[]{10, 8, 5});
        assertEquals(Arrays.asList(2, 1, 3), result);
    }

}