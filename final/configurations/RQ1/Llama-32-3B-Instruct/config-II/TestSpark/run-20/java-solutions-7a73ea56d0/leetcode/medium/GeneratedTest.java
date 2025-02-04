package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedTest {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_[
    PositivePrice]

    Test() {
        int price = 100;
        assertEquals(1, onlineStockSpan.next(price));
    }

    @Test
    public void next_[
    NegativePrice]

    Test() {
        int price = -100;
        assertEquals(1, onlineStockSpan.next(price));
    }

    @Test
    public void next_[
    ZeroPrice]

    Test() {
        int price = 0;
        assertEquals(1, onlineStockSpan.next(price));
    }

    @Test
    public void calculateSpans_[
    SingleElementPrices]

    Test() {
        int[] prices = {100};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(new int[]{1}, result);
    }

    @Test
    public void calculateSpans_[
    MultipleElementPrices]

    Test() {
        int[] prices = {10, 7, 5, 8, 11, 9};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 2, 3, 4, 3}, result);
    }

    @Test
    public void calculateSpans_[
    PricesInAscendingOrder]

    Test() {
        int[] prices = {5, 7, 11, 8, 9};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 3, 1, 1}, result);
    }

    @Test
    public void calculateSpans_[
    PricesInDescendingOrder]

    Test() {
        int[] prices = {9, 8, 11, 7, 5};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 3, 4, 1}, result);
    }

}