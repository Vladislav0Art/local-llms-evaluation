package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Arrays;

public class GeneratedTest {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void [next][HigherPrice]

    Test() {
        onlineStockSpan.next(100);
        assertEquals(1, onlineStockSpan.list.get(0));
        assertEquals(0, onlineStockSpan.list.get(1));
    }

    @Test
    public void [next][LowerPrice]

    Test() {
        onlineStockSpan.next(80);
        assertEquals(0, onlineStockSpan.list.get(0));
        assertEquals(1, onlineStockSpan.list.get(1));
    }

    @Test
    public void [calculateSpans][SingleElement]

    Test() {
        int[] prices = {100};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void [calculateSpans][MultipleElements]

    Test() {
        int[] prices = {100, 80, 75, 70, 60};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 4, 6, 10}, result);
    }

    @Test
    public void [calculateSpans][NoOverlap]

    Test() {
        int[] prices = {100, 80, 70, 60};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 5, 9}, result);
    }

    @Test
    public void [calculateSpans][EmptyInput]

    Test() {
        int[] prices = {};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{0}, result);
    }

}