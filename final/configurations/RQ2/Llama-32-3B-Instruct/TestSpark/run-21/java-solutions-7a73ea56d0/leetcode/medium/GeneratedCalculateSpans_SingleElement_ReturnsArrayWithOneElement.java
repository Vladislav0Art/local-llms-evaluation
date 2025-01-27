package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCalculateSpans_SingleElement_ReturnsArrayWithOneElement {

    @Test
    public void calculateSpans_SingleElement_ReturnsArrayWithOneElement() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10};
        int[] actual = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1}, actual);
    }

}