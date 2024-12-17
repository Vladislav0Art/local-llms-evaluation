package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest {

    private OnlineStockSpan onLineStockSpan = new OnlineStockSpan();

    @Test
    public void testNext_EmptyList() {
        int price = 0;
        onlineStockSpan.next(price);
    }

    @Test
    public void testNext_ReturnsCountOfPreviousValues_BelowPrice() {
        int price = 10;
        onlineStockSpan.next(price);
        int expected = 2;
        int actual = onLineStockSpan.next(price);
        assertEquals(expected, actual);
    }

    @Test
    public void testNext_OnlyOneElement() {
        int price = 1;
        onlineStockSpan.next(price);
        onlineStockSpan.next(0); // push the index of first element
        int expected = 1;
        int actual = onLineStockSpan.next(price);
        assertEquals(expected, actual);
    }

    @Test
    public void testNext_SingleElementPriceIsAboveAllValues() {
        int price = 2;
        onlineStockSpan.next(price);
        onlineStockSpan.next(0); // push the index of first element
        onlineStockSpan.next(1); // push the index of second element
        onlineStockSpan.next(9); // push the index of third element
        int expected = 3;
        int actual = onLineStockSpan.next(price);
        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateSpans_Example1() {
        int[] prices = {3, 6, 2, 9};
        onlineStockSpan.list = new ArrayList<>();
        onlineStockSpan.calculateSpans(prices);
        onlineStockSpan.next(1);
        onlineStockSpan.next(2);
        onlineStockSpan.next(10); // push the price of last element
    }

    @Test
    public void testCalculateSpans_EmptyPricesArray() {
        try {
            onlineStockSpan.list = new ArrayList<>();
            onLineStockSpan.calculateSpans(new int[]{});
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testCalculateSpans_NullPricesArray() {
        int[] prices = null;
        try {
            onlineStockSpan.list = new ArrayList<>();
            onLineStockSpan.calculateSpans(prices);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

}