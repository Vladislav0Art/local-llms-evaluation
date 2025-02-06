package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNext_MultipleDaysPrices_ReturnsCorrectSpans {

    @Test
    public void next_MultipleDaysPrices_ReturnsCorrectSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(100);
        solution.next(150);
        solution.next(20);
        int[] result = solution.calculateSpans(new int[]{100, 150, 20});
        assertEquals(new int[]{1, 2, 0}, result);
    }

}