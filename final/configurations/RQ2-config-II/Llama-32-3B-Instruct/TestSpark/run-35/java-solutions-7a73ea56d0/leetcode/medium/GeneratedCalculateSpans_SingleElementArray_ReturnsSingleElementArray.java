package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedCalculateSpans_SingleElementArray_ReturnsSingleElementArray {

    @Test
    public void calculateSpans_SingleElementArray_ReturnsSingleElementArray() {
        int[] prices = {100};
        int[] result = OnlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1}, result);
    }

}