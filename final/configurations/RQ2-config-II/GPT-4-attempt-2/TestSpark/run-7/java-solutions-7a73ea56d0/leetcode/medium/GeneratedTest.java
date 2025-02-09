package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void nextPriceLessThanPreviousPriceTest() {
        onlineStockSpan.next(100);
        Assert.assertEquals(1, onlineStockSpan.next(80));
    }

    @Test
    public void nextPriceEqualToPreviousPriceTest() {
        onlineStockSpan.next(100);
        Assert.assertEquals(1, onlineStockSpan.next(100));
    }

    @Test
    public void nextPriceMoreThanPreviousPriceTest() {
        onlineStockSpan.next(100);
        Assert.assertEquals(2, onlineStockSpan.next(120));
    }

    @Test
    public void calculateSpansAllPricesSameTest() {
        int[] prices = {100, 100, 100, 100, 100};
        int[] expected = {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpansAllPricesInAscendingOrderTest() {
        int[] prices = {100, 200, 300, 400, 500};
        int[] expected = {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpansAllPricesInDescendingOrderTest() {
        int[] prices = {500, 400, 300, 200, 100};
        int[] expected = {1, 1, 1, 1, 1};
        Assert.assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpansMixedPricesTest() {
        int[] prices = {100, 200, 300, 250, 260, 150, 350};
        int[] expected = {1, 2, 3, 1, 2, 1, 3};
        Assert.assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

}