package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_EmptyArray_ReturnsCorrectResult {

    @Test
    public void CalculateSpans_EmptyArray_ReturnsCorrectResult() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        List<Integer> list = new ArrayList<>();
        onlineStockSpan.list = list;

        int[] result = onlineStockSpan.calculateSpans(new int[]{});
        assertArrayEquals(new int[]{0}, result);
    }

}