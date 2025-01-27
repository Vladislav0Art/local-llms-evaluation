package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCalculateSpans_SingleElementArray_ReturnsSingleElementArray {

    @Test
    public void calculateSpans_SingleElementArray_ReturnsSingleElementArray() {
        OnlineStackSpan onlineStockSpan = new OnlineStackSpan();
        int[] prices = {10};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertTrue(Arrays.equals(result, new int[]{1}));
    }

}