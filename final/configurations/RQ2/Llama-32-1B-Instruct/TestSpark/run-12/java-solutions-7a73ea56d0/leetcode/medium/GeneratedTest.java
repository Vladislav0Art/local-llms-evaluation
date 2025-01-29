package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Test
    public void testMaxLineCoverage_0Prices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {1, 2, 3};
        assertEquals(6, onlineStockSpan.calculateSpans(prices));
    }

    @Test
    public void testMaxLineCoverage_1Price() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = 1;
        int[] prices = {1, 2};
        assertEquals(0, onlineStockSpan.calculateSpans(prices));
    }

    @Test
    public void testMaxLineCoverage_MultiplePrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 30};
        assertEquals(3, onlineStockSpan.calculateSpans(prices));
    }

    @Test
    public void testMaxLineCoverage_TwoNonIncreasingPrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price1 = 10;
        int price2 = 20;
        assertEquals(0, onlineStockSpan.calculateSpans(new int[]{price1, price2}));
    }

    @Test
    public void testMaxLineCoverage_ThreeNonIncreasingPrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price1 = 10;
        int price2 = 20;
        int price3 = 30;
        assertEquals(0, onlineStockSpan.calculateSpans(new int[]{price1, price2, price3}));
    }

    @Test
    public void testMaxLineCoverage_ThreeIncreasingPrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price1 = 10;
        int price2 = 20;
        int price3 = 30;
        assertEquals(0, onlineStockSpan.calculateSpans(new int[]{price1, price2, price3}));
    }

    @Test
    public void testMaxLineCoverage_NegativePrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = -10;
        int[] prices = {-20, -30};
        assertEquals(0, onlineStockSpan.calculateSpans(prices));
    }

}