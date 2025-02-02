package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedTest {

    @Test
    public void [next][ZeroPrice]

    Test() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int result = solution.next(0);
        assertEquals(1, result);
    }

    @Test
    public void [next][PositivePrice]

    Test() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int result = solution.next(10);
        assertEquals(1, result);
    }

    @Test
    public void [next][NegativePrice]

    Test() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int result = solution.next(-5);
        assertEquals(1, result);
    }

    @Test
    public void [next][IncreasingSequence]

    Test() {
        OnlineStockSpan solution = new OnlineStockSpan();
        for (int i = 0; i < 10; i++) {
            solution.next(i * 2);
        }
        for (int i = 9; i >= 0; i--) {
            assertEquals(1, solution.next(i * 2));
        }
    }

    @Test
    public void [calculateSpans][EmptyArray]

    Test() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[0]);
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void [calculateSpans][SingleElement]

    Test() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[]{10});
        assertEquals(new int[]{1}, result);
    }

    @Test
    public void [calculateSpans][MultipleElements]

    Test() {
        OnlineStockSpan solution = new OnlineStockSpan();
        for (int i = 0; i < 5; i++) {
            solution.next(i * 2);
        }
        int[] result = solution.calculateSpans(new int[]{10, 20, 15, 35});
        assertArrayEquals(new int[]{1, 3, 5, 7}, result);
    }

    @Test
    public void [calculateSpans][IncreasingSequence]

    Test() {
        OnlineStockSpan solution = new OnlineStockSpan();
        for (int i = 0; i < 10; i++) {
            solution.next(i * 2);
        }
        int[] result = solution.calculateSpans(new int[]{10, 20, 15, 35});
        assertArrayEquals(new int[]{1, 3, 5, 7}, result);
    }

    @Test
    public void [calculateSpans][DecreasingSequence]

    Test() {
        OnlineStockSpan solution = new OnlineStockSpan();
        for (int i = 0; i < 10; i++) {
            solution.next(i * -2);
        }
        int[] result = solution.calculateSpans(new int[]{35, 20, 15, 10});
        assertArrayEquals(new int[]{1, 3, 5, 7}, result);
    }

}