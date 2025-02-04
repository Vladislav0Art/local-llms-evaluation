package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_ReturnsCorrectArray {

    @Test
    public void CalculateSpans_ReturnsCorrectArray() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        List<Integer> list = new ArrayList<>();
        onlineStockSpan.list = list;

        int[] result = onlineStockSpan.calculateSpans(new int[]{10, 20, 30});
        assertArrayEquals(new int[]{1, 3, 4}, result);
    }

}