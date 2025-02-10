package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void testNext_Span1() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = 10;
        int expected = 1;
        int[] result = onlineStockSpan.next(price);
        assertEquals(expected, result);
    }

    @Test
    public void testNext_Span2() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = 12;
        int expected = 3;
        int[] result = onlineStockSpan.next(price);
        assertEquals(expected, result);
    }

    @Test
    public void testNext_Span3() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = 9;
        int expected = 1;
        int[] result = onlineStockSpan.next(price);
        assertEquals(expected, result);
    }

    @Test
    public void testNext_Span4() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = 13;
        int expected = 2;
        int[] result = onlineStockSpan.next(price);
        assertEquals(expected, result);
    }

    @Test
    public void testNext_Span5() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = 10;
        int[] result = onlineStockSpan.next(price);
        assertEquals(1, result);
    }

    @Test
    public void testNext_Span6() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = 12;
        int[] result = onlineStockSpan.next(price);
        assertEquals(3, result);
    }

    @Test
    public void testNext_Span7() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = 9;
        int[] result = onlineStockSpan.next(price);
        assertEquals(1, result);
    }

    @Test
    public void testCalculateSpans_SinglePriceArray() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10};
        int[] expected = {1};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(expected, result);
    }

    @Test
    public void testCalculateSpansMultiplePricesArray() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 12, 9};
        int[] expected = {3, 2, 1};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assert Arrays.equals(result, expected);
    }

}