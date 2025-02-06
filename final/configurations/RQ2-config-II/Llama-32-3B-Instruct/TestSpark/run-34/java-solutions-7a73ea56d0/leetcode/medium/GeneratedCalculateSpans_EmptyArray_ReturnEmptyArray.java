package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_EmptyArray_ReturnEmptyArray {

    @Test
    public void calculateSpans_EmptyArray_ReturnEmptyArray() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[0]);
        assert result.length == 0;
    }

}