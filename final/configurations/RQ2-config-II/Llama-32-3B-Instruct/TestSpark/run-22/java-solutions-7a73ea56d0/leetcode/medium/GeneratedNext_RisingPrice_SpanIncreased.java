package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.ArrayList;

public class GeneratedNext_RisingPrice_SpanIncreased {

    @Test
    public void next_RisingPrice_SpanIncreased() {
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(10);
        solution.next(15);
        solution.next(8);
        int[] result = solution.calculateSpans(new int[]{10, 15, 8});
        assertEquals(Arrays.asList(1, 3, 2), result);
    }

}