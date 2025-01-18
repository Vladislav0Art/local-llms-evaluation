package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void nextSingleCallTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(100));
    }

    @Test
    public void nextMultipleCallsTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(100));
        assertEquals(1, stockSpan.next(80));
        assertEquals(1, stockSpan.next(60));
        assertEquals(1, stockSpan.next(70));
        assertEquals(2, stockSpan.next(60));
        assertEquals(1, stockSpan.next(75));
        assertEquals(4, stockSpan.next(85));
    }

    @Test
    public void nextPriceEqualsPreviousPriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(100));
        assertEquals(2, stockSpan.next(100));
    }

    @Test
    public void calculateSpansEmptyArrayTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[0];
        int[] spans = stockSpan.calculateSpans(prices);
        assertEquals(0, spans.length);
    }

    @Test
    public void calculateSpansSingleElementTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{100};
        int[] spans = stockSpan.calculateSpans(prices);
        assertEquals(1, spans.length);
        assertEquals(1, spans[0]);
    }

    @Test
    public void calculateSpansMultipleElementsTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{100, 80, 60, 70, 60, 75, 85};
        int[] spans = stockSpan.calculateSpans(prices);
        assertEquals(prices.length, spans.length);
        assertEquals(1, spans[0]);
        assertEquals(1, spans[1]);
        assertEquals(1, spans[2]);
        assertEquals(1, spans[3]);
        assertEquals(2, spans[4]);
        assertEquals(1, spans[5]);
        assertEquals(4, spans[6]);
    }

}