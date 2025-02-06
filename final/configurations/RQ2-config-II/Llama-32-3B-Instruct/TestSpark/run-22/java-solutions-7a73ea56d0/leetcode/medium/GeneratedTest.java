package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.ArrayList;

public class GeneratedTest {

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[0]);
        assertEquals(Arrays.asList(), result);
    }

    @Test
    public void next_ExistingPrice_SpanOfOneReturned() {
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(10);
        solution.next(5);
        solution.next(15);
        int[] result = solution.calculateSpans(new int[]{10, 5, 15});
        assertEquals(Arrays.asList(1, 2, 3), result);
    }

    @Test
    public void next_DroppingPrice_SpanIncreased() {
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(10);
        solution.next(8);
        solution.next(5);
        int[] result = solution.calculateSpans(new int[]{10, 8, 5});
        assertEquals(Arrays.asList(2, 1, 3), result);
    }

    @Test
    public void next_RisingPrice_SpanIncreased() {
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(10);
        solution.next(15);
        solution.next(8);
        int[] result = solution.calculateSpans(new int[]{10, 15, 8});
        assertEquals(Arrays.asList(1, 3, 2), result);
    }

    @Test
    public void next_SamePrice_SpanOfOneReturned() {
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(10);
        solution.next(10);
        int[] result = solution.calculateSpans(new int[]{10, 10});
        assertEquals(Arrays.asList(1, 1), result);
    }

    @Test
    public void calculateSpans_SinglePrice_ReturnsArrayWithOneElement() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[]{5});
        assertEquals(Arrays.asList(1), result);
    }

}