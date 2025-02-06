package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCalculateSpans_EmptyInput_ReturnsEmptyArray {

    @Test
    public void calculateSpans_EmptyInput_ReturnsEmptyArray() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[0]);
        assertTrue(java.util.Arrays.equals(result, new int[0]));
    }

}