package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_SingleElementArray_withLastElementAsZero_ReturnsCorrectResult {

    @Test
    public void CalculateSpans_SingleElementArray_withLastElementAsZero_ReturnsCorrectResult() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        List<Integer> list = new ArrayList<>();
        onlineStockSpan.list = list;

        int[] result = onlineStockSpan.calculateSpans(new int[]{0});
        assertArrayEquals(new int[]{1}, result);
    }

}