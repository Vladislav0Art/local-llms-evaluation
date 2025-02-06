package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpans_EmptyArray_ReturnsEmptyArray {

    private OnlineStockSpan stockSpan = new OnlineStack();

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        int[] result = stockSpan.calculateSpans(new int[0]);
        assertResult(result, new int[0]);
    }

}