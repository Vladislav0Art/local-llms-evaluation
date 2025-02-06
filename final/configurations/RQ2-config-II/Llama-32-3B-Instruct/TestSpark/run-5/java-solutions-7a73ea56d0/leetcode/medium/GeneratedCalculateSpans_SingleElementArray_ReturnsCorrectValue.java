package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedCalculateSpans_SingleElementArray_ReturnsCorrectValue {

    @Test
    public void calculateSpans_SingleElementArray_ReturnsCorrectValue() {
        int[] prices = {10};
        int[] result = OnlineStockSpan().calculateSpans(prices);
        assertEquals(1, result[0]);
    }

}