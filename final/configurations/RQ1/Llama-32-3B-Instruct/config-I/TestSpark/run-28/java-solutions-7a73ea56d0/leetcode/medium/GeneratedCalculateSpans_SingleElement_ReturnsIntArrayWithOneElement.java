package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_SingleElement_ReturnsIntArrayWithOneElement {

    private final OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_SingleElement_ReturnsIntArrayWithOneElement() {
        int[] prices = {100};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{2}, result);
    }

}