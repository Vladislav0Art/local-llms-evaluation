package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void testMaxLineCoverage_1() {
        OnlineStockSpan stock = new OnlineStockSpan();
        when(stock.next(10)).thenReturn(2);
        int result = stock.calculateSpans(new int[]{10, 20, 30});
        assertEquals(3, result[0]);
        assertEquals(4, result[1]);
    }

    @Test
    public void testMaxLineCoverage_2() {
        OnlineStockSpan stock = new OnlineStockSpan();
        when(stock.next(1)).thenReturn(-1);
        int[] prices = {1};
        int[] result = stock.calculateSpans(prices);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    public void testMaxLineCoverage_3() {
        OnlineStockSpan stock = new OnlineStockSpan();
        when(stock.next(2)).thenReturn(-1);
        when(stock.next(20)).thenReturn(4);
        int[] prices = {2};
        int[] result = stock.calculateSpans(prices);
        assertEquals(0, result[0]);
    }

    @Test
    public void testMaxLineCoverage_4() {
        OnlineStockSpan stock = new OnlineStockSpan();
        when(stock.next(100)).thenReturn(-1);
        int[] prices = {100};
        int[] result = stock.calculateSpans(prices);
        assertEquals(1, result[0]);
    }

    @Test
    public void testMaxLineCoverage_5() {
        OnlineStockSpan stock = new OnlineStockSpan();
        when(stock.next(50)).thenReturn(-1);
        int[] prices = {50};
        int[] result = stock.calculateSpans(prices);
        assertEquals(1, result[0]);
    }

    @Test
    public void testMaxLineCoverage_6() {
        OnlineStockSpan stock = new OnlineStockSpan();
        when(stock.next(200)).thenReturn(-1);
        int[] prices = {200};
        int[] result = stock.calculateSpans(prices);
        assertEquals(2, result[0]);
        assertEquals(3, result[1]);
    }

    @Test
    public void testMaxLineCoverage_7() {
        OnlineStockSpan stock = new OnlineStockSpan();
        when(stock.next(300)).thenReturn(-1);
        int[] prices = {300};
        int[] result = stock.calculateSpans(prices);
        assertEquals(4, result[0]);
        assertEquals(5, result[1]);
    }

}