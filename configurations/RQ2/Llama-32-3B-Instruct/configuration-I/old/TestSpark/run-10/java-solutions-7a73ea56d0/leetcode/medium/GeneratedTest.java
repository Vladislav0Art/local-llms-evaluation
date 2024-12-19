package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void nextPrice_EmptyArray() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[0]);
        assertEquals(1, Arrays.stream(result).max().getAsInt());
    }

    @Test
    public void nextPrice_SingleElementArray() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(1, result[0]);
    }

    @Test
    public void nextPrice_MultipleElementsArray() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 70};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(1, result[0]);
        assertEquals(3, result[1]);
        assertEquals(2, result[2]);
        assertEquals(1, result[3]);
    }

    @Test
    public void nextPrice_DuplicateElementsArray() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 70, 100};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(1, result[0]);
        assertEquals(3, result[1]);
        assertEquals(2, result[2]);
        assertEquals(1, result[3]);
        assertEquals(4, result[4]);
    }

    @Test
    public void calculateSpans_EmptyArray() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[0]);
        assertEquals(1, Arrays.stream(result).max().getAsInt());
    }

    @Test
    public void calculateSpans_SingleElementArray() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(1, result[0]);
    }

    @Test
    public void calculateSpans_MultipleElementsArray() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 70};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(1, result[0]);
        assertEquals(3, result[1]);
        assertEquals(2, result[2]);
        assertEquals(1, result[3]);
    }

    @Test
    public void calculateSpans_DuplicateElementsArray() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 70, 100};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(1, result[0]);
        assertEquals(3, result[1]);
        assertEquals(2, result[2]);
        assertEquals(1, result[3]);
        assertEquals(4, result[4]);
    }

    @Test
    public void nextPrice_EmptyArray() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[0]);
        assertEquals(1, result.length);
    }

    @Test
    public void nextPrice_MultipleElementsArray() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 70};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(1, result[0]);
        assertEquals(3, result[1]);
        assertEquals(2, result[2]);
    }

    @Test
    public void nextPrice_DuplicateElementsArray() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 70, 100};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(1, result[0]);
        assertEquals(3, result[1]);
        assertEquals(2, result[2]);
        assertEquals(4, result[3]);
    }

    @Test
    public void nextPrice_MultipleElementsArray() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 70};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(1, result[0]);
        assertEquals(3, result[1]);
    }

    @Test
    public void nextPrice_DuplicateElementsArray() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 70, 100};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(1, result[0]);
        assertEquals(3, result[1]);
        assertEquals(2, result[2]);
    }

}