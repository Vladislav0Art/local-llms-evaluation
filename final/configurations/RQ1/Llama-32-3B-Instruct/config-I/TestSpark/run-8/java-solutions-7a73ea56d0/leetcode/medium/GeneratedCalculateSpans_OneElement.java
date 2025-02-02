package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedCalculateSpans_OneElement {

    @Test
    public void calculateSpans_OneElement() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[]{1});
        assertEquals(new int[]{1}, result);
    }

}