package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void next_SamePrice_ExpectOne() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(10);
        assertEquals(1, onlineStockSpan.list.size());
    }

    @Test
    public void next_DifferentPrice_ExpectTwo() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(10);
        onlineStockSpan.next(20);
        assertEquals(2, onlineStockSpan.list.size());
    }

    @Test
    public void calculateSpans_EmptyArray_ExpectZeroes() {
        int[] prices = {};
        int[] spans = OnlineStockSpan.calculateSpans(prices);
        for (int span : spans) {
            assertTrue(span == 0 || span == 1);
        }
    }

    @Test
    public void calculateSpans_SingleElementArray_ExpectOne() {
        int[] prices = {10};
        int[] spans = OnlineStockSpan.calculateSpans(prices);
        assertEquals(1, spans[0]);
    }

    @Test
    public void calculateSpans_MultipleElementsArray_ExpectCorrectSpans() {
        int[] prices = {10, 20, 30, 40};
        int[] spans = OnlineStockSpan.calculateSpans(prices);
        for (int i = 1; i < spans.length; i++) {
            if (spans[i] > spans[i - 1]) {
                fail("Incorrect span at index " + i);
            }
        }
    }

    @Test
    public void next_DuplicatePrices_ExpectCorrectCount() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(10);
        onlineStockSpan.next(10);
        onlineStockSpan.next(20);
        assertEquals(3, onlineStockSpan.list.size());
    }

    @Test
    public void calculateSpans_DuplicatePrices_ExpectCorrectSpans() {
        int[] prices = {10, 10, 20};
        int[] spans = OnlineStockSpan.calculateSpans(prices);
        for (int i = 1; i < spans.length; i++) {
            if (spans[i] > spans[i - 1]) {
                fail("Incorrect span at index " + i);
            }
        }
    }

    @Test
    public void next_LargePrice_ExpectCorrectCount() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        for (int i = 0; i < 10000; i++) {
            onlineStockSpan.next(10);
        }
        assertEquals(1, onlineStockSpan.list.size());
    }

    @Test
    public void calculateSpans_LargeArray_ExpectCorrectSpans() {
        int[] prices = new int[10000];
        for (int i = 0; i < 10000; i++) {
            prices[i] = 10;
        }
        int[] spans = OnlineStockSpan.calculateSpans(prices);
        for (int i = 1; i < spans.length; i++) {
            if (spans[i] > spans[i - 1]) {
                fail("Incorrect span at index " + i);
            }
        }
    }

}