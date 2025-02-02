package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedCalculateSpans_MultipleElementsDecreasing {

    @Test
    public void calculateSpans_MultipleElementsDecreasing() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[]{100, 80, 75, 60, 65});
        assertArrayEquals(new int[]{2, 1, 4, 5, 3}, result);
    }

}