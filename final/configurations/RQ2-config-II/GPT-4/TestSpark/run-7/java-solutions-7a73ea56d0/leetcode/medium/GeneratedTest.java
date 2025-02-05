package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void nextNewPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(1, onlineStockSpan.next(50));
        assertEquals(2, onlineStockSpan.next(60));
        assertEquals(1, onlineStockSpan.next(40));
    }

    @Test
    public void nextExistingPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(1, onlineStockSpan.next(50));
        assertEquals(2, onlineStockSpan.next(60));
        assertEquals(3, onlineStockSpan.next(70));
        assertEquals(4, onlineStockSpan.next(80));
        assertEquals(1, onlineStockSpan.next(60));
    }

    @Test
    public void calculateSpansEmptyArrayTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(0, onlineStockSpan.calculateSpans(new int[]{}).length);
    }

    @Test
    public void calculateSpansOneElementArrayTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

        int[] spans = onlineStockSpan.calculateSpans(new int[]{20});

        assertEquals(1, spans.length);
        assertEquals(1, spans[0]);
    }

    @Test
    public void calculateSpansMultipleElementsArrayTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = new int[]{100, 80, 60, 70, 60, 75, 85};
        int[] expectedSpans = new int[]{1, 1, 1, 2, 1, 4, 6};

        int[] spans = onlineStockSpan.calculateSpans(prices);

        assertEquals(prices.length, spans.length);
        assertEquals(Arrays.toString(expectedSpans), Arrays.toString(spans));
    }

}