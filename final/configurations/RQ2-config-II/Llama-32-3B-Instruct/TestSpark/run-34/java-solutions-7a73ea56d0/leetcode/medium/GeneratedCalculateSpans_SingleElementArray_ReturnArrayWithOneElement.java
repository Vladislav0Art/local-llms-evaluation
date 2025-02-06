package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_SingleElementArray_ReturnArrayWithOneElement {

    @Test
    public void calculateSpans_SingleElementArray_ReturnArrayWithOneElement() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[]{10});
        assertEquals(1, result[0]);
    }

}