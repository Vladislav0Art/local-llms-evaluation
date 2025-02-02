package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTest {

    @Test
    public void next_WhenPriceIncreases_SpanIncreases() {
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(100);
        solution.next(80);
        assertTrue(solution.list.get(solution.list.size() - 1) >= 2L);
    }

    @Test
    public void next_WhenPricesDecrease_SpanReduces() {
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(100);
        solution.next(80);
        solution.next(70);
        assertTrue(solution.list.get(solution.list.size() - 1) >= 3L);
    }

    @Test
    public void next_PricesEqual_SameSpan() {
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(100);
        solution.next(100);
        assertTrue(solution.list.get(solution.list.size() - 1) == 2L);
    }

    @Test
    public void calculateSpans_WhenFirstPriceIsLow_SpanIsHigh() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {70};
        int[] result = solution.calculateSpans(prices);
        assertEquals(1, (int) result[0]);
    }

    @Test
    public void calculateSpans_WhenPricesAreEqual_SameSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {100, 100};
        int[] result = solution.calculateSpans(prices);
        assertEquals(1, (int) result[0]);
    }

    @Test
    public void calculateSpans_MostlyDecreasingPrices_SameSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {100, 80, 70};
        int[] result = solution.calculateSpans(prices);
        assertEquals(1, (int) result[0]);
    }

    @Test
    public void calculateSpans_WhenPricesIncrease_SameSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {100, 80};
        int[] result = solution.calculateSpans(prices);
        assertEquals(2, (int) result[0]);
    }

}