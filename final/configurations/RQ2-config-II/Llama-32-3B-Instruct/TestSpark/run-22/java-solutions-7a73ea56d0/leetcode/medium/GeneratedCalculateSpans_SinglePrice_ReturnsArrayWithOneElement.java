package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.ArrayList;

public class GeneratedCalculateSpans_SinglePrice_ReturnsArrayWithOneElement {

    @Test
    public void calculateSpans_SinglePrice_ReturnsArrayWithOneElement() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[]{5});
        assertEquals(Arrays.asList(1), result);
    }

}