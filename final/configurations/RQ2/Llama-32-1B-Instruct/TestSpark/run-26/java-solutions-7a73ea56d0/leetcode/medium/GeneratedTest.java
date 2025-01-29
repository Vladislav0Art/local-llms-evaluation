package leetcode.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @BeforeEach
    public void setUp() {
        prices = new int[]{1, 2, 3, 0, 2};
        spans = new int[prices.length];
    }

    @Test
    public void testMaxLineCoverage_SimpleScenario() {
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(5, result.length);
        assertEquals(1, result[0]);
        assertEquals(1, result[1]);
        assertEquals(2, result[2]);
        assertEquals(3, result[3]);
        assertEquals(4, result[4]);
    }

    @Test
    public void testMaxLineCoverage_SingleInterval() {
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(5, result.length);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(3, result[2]);
        assertEquals(4, result[3]);
        assertEquals(4, result[4]);
    }

    @Test
    public void testMaxLineCoverage_MultipleIntervals() {
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(10, result.length);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(3, result[2]);
        assertEquals(4, result[3]);
        assertEquals(5, result[4]);
        assertEquals(6, result[5]);
    }

    @Test
    public void testMaxLineCoverage_NoSales() {
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(0, result.length);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(3, result[2]);
        assertEquals(4, result[3]);
    }

    @Test
    public void testMaxLineCoverage_PreciseSpan() {
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(5, result.length);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(3, result[2]);
        assertEquals(4, result[3]);
        assertEquals(4, result[4]);
    }

}