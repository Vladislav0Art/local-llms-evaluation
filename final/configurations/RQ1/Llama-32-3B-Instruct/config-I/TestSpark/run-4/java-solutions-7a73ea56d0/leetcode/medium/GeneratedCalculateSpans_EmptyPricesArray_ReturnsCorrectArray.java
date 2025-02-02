package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;

public class GeneratedCalculateSpans_EmptyPricesArray_ReturnsCorrectArray {

    @Test
    public void calculateSpans_EmptyPricesArray_ReturnsCorrectArray() {
        OnlineStockSpan s = new OnlineStockSpan();
        int[] result = s.calculateSpans(new int[0]);
        assertArrayEquals(new int[]{}, result);
    }

}