package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import leetcode.medium.OnlineStockSpan;

public class GeneratedTest {

    @Test
    public void nextNegativePriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(-1);
    }

    @Test
    public void nextFirstPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.next(100);

        assertEquals(1, result);
    }

    @Test
    public void nextLowerPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        int result = onlineStockSpan.next(80);

        assertEquals(1, result);
    }

    @Test
    public void nextHigherPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        int result = onlineStockSpan.next(120);

        assertEquals(2, result);
    }

    @Test
    public void calculateSpansNullTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.calculateSpans(null);
    }

    @Test
    public void calculateSpansEmptyTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{});

        assertEquals(0, result.length);
    }

    @Test
    public void calculateSpansMultipleTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{100, 80, 60, 70, 60, 75, 85});

        assertEquals(result[0], 1);
        assertEquals(result[1], 1);
        assertEquals(result[2], 1);
        assertEquals(result[3], 2);
        assertEquals(result[4], 1);
        assertEquals(result[5], 4);
        assertEquals(result[6], 6);
    }

}