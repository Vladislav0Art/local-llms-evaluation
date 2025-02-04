package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedCalculateSpans_SingleElement_ReturnsSingleElement {

    @Test
    public void calculateSpans_SingleElement_ReturnsSingleElement() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100};
        int[] spans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(spans, new int[]{1});
    }

}