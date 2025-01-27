package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Stack;

public class GeneratedCalculateSpans_SingleElementArray_ReturnsArrayWithOneElement {

    @Test
    public void calculateSpans_SingleElementArray_ReturnsArrayWithOneElement() {
        OnlineStackSpan onlineStockSpan = new OnlineStackSpan();
        int[] prices = {10};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1}, result);
    }

}