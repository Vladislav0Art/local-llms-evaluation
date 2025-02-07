package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest {

    @Test
    public void test_maxLineCoverage_1() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {7, 6, 4, 3, 1};
        int expected[] = {0, 1, 2, 3, 4};
        assertEquals(expected, stock.calculateSpans(prices));
    }

    @Test
    public void test_maxLineCoverage_2() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {10, 5, 15, 20};
        int expected[] = {1, 6, 19, 100};
        assertEquals(expected, stock.calculateSpans(prices));
    }

    @Test
    public void test_maxLineCoverage_3() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {7, 9, 4, 1, 6, 3};
        int expected[] = {0, 8, 10, 12, 16, 13};
        assertEquals(expected, stock.calculateSpans(prices));
    }

    @Test
    public void test_maxLineCoverage_4() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {1, 2, 3, 4, 5, 6, 7};
        int expected[] = {0, 2, 6, 18, 64, 230, 739};
        assertEquals(expected, stock.calculateSpans(prices));
    }

    @Test
    public void test_maxLineCoverage_5() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {0, 1, 2, 3, 4};
        int expected[] = {};
        assertEquals(expected, stock.calculateSpans(prices));
    }

    @Test
    public void test_maxLineCoverage_6() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {10, 9, 8, 7, 6};
        int expected[] = {};
        assertEquals(expected, stock.calculateSpans(prices));
    }

    @Test
    public void test_maxLineCoverage_7() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {1, 2, 3, 4, 5};
        int expected = 0;
        assertEquals(expected, stock.calculateSpans(prices));
    }

    @Test
    public void test_maxLineCoverage_8() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {10, 9, 8, 7};
        int expected = 1;
        assertEquals(expected, stock.calculateSpans(prices));
    }

}