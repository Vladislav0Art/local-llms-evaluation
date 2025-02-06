package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNext_DuplicatePrices_ReturnsCorrectSpans {

    @Test
    public void next_DuplicatePrices_ReturnsCorrectSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(10);
        solution.next(10);
        solution.next(15);
        int[] result = solution.calculateSpans(new int[]{10, 10, 15});
        assertEquals(new int[]{1, 1, 0}, result);
    }

}