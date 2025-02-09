package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Random;

public class GeneratedTest {

    @Test
    public void next_0() {
        OnlineStockSpan solution = new OnlineStockSpan();
        assertEquals(1, solution.next(0));
    }

    @Test
    public void next_NegativeNumber() {
        OnlineStockSpan solution = new OnlineStockSpan();
        assertEquals(1, solution.next(-100));
    }

    @Test
    public void calculateSpans_EmptyArray() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[0]);
        assertTrue(result.length == 0);
    }

    @Test
    public void calculateSpans_SingleElementArray() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {100};
        int[] result = solution.calculateSpans(prices);
        assertEquals(1, result[0]);
    }

    @Test
    public void next_0Again() {
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(0);
        assertEquals(2, solution.next(0));
    }

    @Test
    public void next_DifferentPriceThenZero() {
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(50);
        assertEquals(1, solution.next(100));
    }

    @Test
    public void calculateSpans_SimpleSequence() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {10, 20, 30};
        int[] result = solution.calculateSpans(prices);
        assertTrue(result.length == 3);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(3, result[2]);
    }

    @Test
    public void calculateSpans_IncreasingSequence() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {10, 20, 30, 40};
        int[] result = solution.calculateSpans(prices);
        assertTrue(result.length == 4);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(3, result[2]);
        assertEquals(4, result[3]);
    }

    @Test
    public void next_ConsecutiveZero() {
        OnlineStockSpan solution = new OnlineStockSpan();
        for (int i = 0; i < 10; i++) {
            solution.next(0);
        }
        solution.next(-1);
        assertEquals(2, solution.next(0));
    }

    @Test
    public void calculateSpans_ConsecutiveZero() {
        OnlineStockSpan solution = new OnlineStockSpan();
        for (int i = 0; i < 10; i++) {
            int price = -i;
            solution.next(price);
        }
        int[] result = solution.calculateSpans(new int[]{1});
        assertEquals(1, result[0]);
    }

}