package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedTest {

    @Test
    public void next_[
    Isolation]

    Test() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int price = 10;
        assertEquals(1, stockSpan.next(price));
    }

    @Test
    public void next_[
    Boundary]

    Test() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int price = 5;
        assertEquals(1, stockSpan.next(price));
    }

    @Test
    public void next_[
    NegativeNumbers]

    Test() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int price = -10;
        assertEquals(-1, stockSpan.next(price));
    }

    @Test
    public void calculateSpans_[
    Isolation]

    Test() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 60};
        int[] expected = {1, 2, 3, 4};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpans_[
    Boundary]

    Test() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 9, 8, 7, 6, 5};
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpans_[
    NegativeNumbers]

    Test() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {-1, -2, -3, -4, -5};
        int[] expected = {1, 1, 1, 1, 1};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpans_[
    Zero]

    Test() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {0};
        int[] expected = {1};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

    @Test
    public void next_StackClear() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        for (int i = 0; i < 100; i++) {
            stockSpan.next(i);
        }
        assertTrue(stockSpan.list.isEmpty());
    }

}