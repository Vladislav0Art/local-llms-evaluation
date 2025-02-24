package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import leetcode.medium.OnlineStockSpan;

public class GeneratedTest {

    @Test
    public void nextSpan1Test() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(1));
    }

    @Test
    public void nextSpan2Test() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(1);
        assertEquals(2, stockSpan.next(2));
    }

    @Test
    public void nextSpan3Test() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(1);
        stockSpan.next(2);
        assertEquals(1, stockSpan.next(1));
    }

    @Test
    public void calculateSpans1Test() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(new int[]{1}, stockSpan.calculateSpans(new int[]{1}));
    }

    @Test
    public void calculateSpans2Test() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(new int[]{1, 2}, stockSpan.calculateSpans(new int[]{1, 2}));
    }

    @Test
    public void calculateSpans3Test() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(new int[]{1, 2, 1}, stockSpan.calculateSpans(new int[]{1, 2, 1}));
    }

    @Test
    public void calculateSpans4Test() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(new int[]{1, 2, 2, 1}, stockSpan.calculateSpans(new int[]{1, 2, 3, 1}));
    }

}