package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void testNext_LessThan() {
        OnlineStockSpan s = new OnlineStockSpan();
        s.next(100);
        s.next(80);
        s.next(70);
        s.next(60);
        assertEquals(1, s.next(65));
        assertEquals(2, s.next(70));
    }

    @Test
    public void testNext_EqualTo() {
        OnlineStockSpan s = new OnlineStockSpan();
        s.next(100);
        s.next(100);
        s.next(100);
        assertEquals(3, s.next(100));
        assertEquals(2, s.next(90));
    }

    @Test
    public void testNext_GreaterThan() {
        OnlineStockSpan s = new OnlineStockSpan();
        s.next(10);
        s.next(20);
        s.next(30);
        assertEquals(0, s.next(40));
        assertEquals(1, s.next(50));
    }

    @Test
    public void testCalculateSpans_ZeroLengthPrices() {
        int[] prices = {};
        OnlineStockSpan s = new OnlineStockSpan();
        int[] spans = s.calculateSpans(prices);
        assertArrayEquals(new int[]{}, spans);
    }

    @Test
    public void testCalculateSpans_SingleElementPrices() {
        int[] prices = {100};
        OnlineStockSpan s = new OnlineStockSpan();
        int[] spans = s.calculateSpans(prices);
        assertArrayEquals(new int[]{1}, spans);
    }

    @Test
    public void testCalculateSpans_MultipleElementsPrices() {
        int[] prices = {10, 20, 30};
        OnlineStockSpan s = new OnlineStockSpan();
        int[] spans = s.calculateSpans(prices);
        assertArrayEquals(new int[]{2, 1, 0}, spans);
    }

    @Test
    public void testCalculateSpans_MultipleElementsPricesWithDecrease() {
        int[] prices = {10, 5, 20, 15};
        OnlineStockSpan s = new OnlineStockSpan();
        int[] spans = s.calculateSpans(prices);
        assertArrayEquals(new int[]{2, 0, 1, 4}, spans);
    }

    @Test
    public void testCalculateSpans_MultipleElementsPricesWithIncrease() {
        int[] prices = {10, 15, 20, 30};
        OnlineStockSpan s = new OnlineStockSpan();
        int[] spans = s.calculateSpans(prices);
        assertArrayEquals(new int[]{2, 1, 0, 3}, spans);
    }

    @Test
    public void testCalculateSpans_MultipleElementsPricesWithIncreaseAndDecrease() {
        int[] prices = {10, 15, 20, 30};
        OnlineStockSpan s = new OnlineStockSpan();
        int[] spans = s.calculateSpans(prices);
        assertArrayEquals(new int[]{2, 1, 0, 3}, spans);
    }

}