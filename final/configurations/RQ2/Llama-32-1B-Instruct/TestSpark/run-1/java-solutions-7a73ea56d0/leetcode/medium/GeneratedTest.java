package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void next_WhenPriceIs_0_ThenExpectedPriceReturns_1() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int price = 0;
        int expectedValue = 1;
        int actualValue = instance.next(price);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void next_WhenPriceIs_Negative_ThenExpectedZeroReturns_1() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int price = -1;
        int expectedValue = 1;
        int actualValue = instance.next(price);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void next_WhenPriceIs_NegativeAndZeroThenExpectedToThrow_NonNegativeZeroException() {
        OnlineStockSpan instance = new OnlineStockSpan();
        Mockito.when(instance.next(-1)).thenReturn(0);
        try {
            int price = -2;
            int actualValue = instance.next(price);
            fail("Expected NonNegativeZeroException");
        } catch (NonNegativeZeroException e) {
        }
    }

    @Test
    public void next_WhenPriceIs_NegativeAndOneThenExpectedToThrow_NonNegativeZeroException() {
        OnlineStockSpan instance = new OnlineStockSpan();
        Mockito.when(instance.next(-1)).thenReturn(0);
        try {
            int price = -2;
            int actualValue = instance.next(price);
            fail("Expected NonNegativeZeroException");
        } catch (NonNegativeZeroException e) {
        }
    }

    @Test
    public void next_WhenPriceIs_NegativeAndMultipleThenExpectedToThrow_NonNegativeZeroException() {
        OnlineStockSpan instance = new OnlineStockSpan();
        Mockito.when(instance.next(-1)).thenReturn(0);
        try {
            int price = -3;
            int actualValue = instance.next(price);
            fail("Expected NonNegativeZeroException");
        } catch (NonNegativeZeroException e) {
        }
    }

    @Test
    public void next_WhenPriceIsPositiveThenExpectedValueReturnsTheValue() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int price = 10;
        int expectedValue = 1;
        int actualValue = instance.next(price);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void next_WhenPriceIsZeroThenExpectedToReturnTheValue() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int price = 0;
        int expectedValue = 1;
        int actualValue = instance.next(price);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void next_WhenPriceIsPositiveAndZeroThenExpectedToThrow_NonNegativeZeroException() {
        OnlineStockSpan instance = new OnlineStockSpan();
        Mockito.when(instance.next(0)).thenReturn(1);
        try {
            int price = 0;
            int actualValue = instance.next(price);
            fail("Expected NonNegativeZeroException");
        } catch (NonNegativeZeroException e) {
        }
    }

    @Test
    public void next_WhenPriceIsPositiveAndOneThenExpectedToThrow_NonNegativeZeroException() {
        OnlineStockSpan instance = new OnlineStockSpan();
        Mockito.when(instance.next(1)).thenReturn(0);
        try {
            int price = 2;
            int actualValue = instance.next(price);
            fail("Expected NonNegativeZeroException");
        } catch (NonNegativeZeroException e) {
        }
    }

    @Test
    public void next_WhenPriceIsPositiveAndMultipleThenExpectedToThrow_NonNegativeZeroException() {
        OnlineStockSpan instance = new OnlineStockSpan();
        Mockito.when(instance.next(1)).thenReturn(0);
        try {
            int price = 2;
            int actualValue = instance.next(price);
            fail("Expected NonNegativeZeroException");
        } catch (NonNegativeZeroException e) {
        }
    }

    @Test
    public void calculateSpans_WhenPricesArePositiveAndMultipleThenReturnsTheCorrectArray() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {10, 20, 30, 40};
        int[] expectedValues = {1, 2, 3, 4};
        OnlineStockSpan.Span[] actualSpans = instance.calculateSpans(prices);
        assertArrayEquals(expectedValues, actualSpans);
    }

    @Test
    public void calculateSpans_WhenPricesArePositiveAndOneThenReturnsTheCorrectArray() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {10, 20, 30, 40};
        int[] expectedValues = {1, 2, 3, 4};
        OnlineStockSpan.Span[] actualSpans = instance.calculateSpans(prices);
        assertArrayEquals(expectedValues, actualSpans);
    }

    @Test
    public void calculateSpans_WhenPricesAreNegativeAndZeroThenReturnsTheCorrectArray() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {-1, -2, -3};
        int[] expectedValues = {0, 0, 0};
        OnlineStockSpan.Span[] actualSpans = instance.calculateSpans(prices);
        assertArrayEquals(expectedValues, actualSpans);
    }

    @Test
    public void calculateSpans_WhenPricesAreNegativeAndOneThenReturnsTheCorrectArray() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {-1, -2, -3};
        int[] expectedValues = {0, 0, 0};
        OnlineStockSpan.Span[] actualSpans = instance.calculateSpans(prices);
        assertArrayEquals(expectedValues, actualSpans);
    }

    @Test
    public void calculateSpans_WhenPricesAreNegativeAndMultipleThenReturnsTheCorrectArray() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {-1, -2, -3};
        int[] expectedValues = {0, 0, 0};
        OnlineStockSpan.Span[] actualSpans = instance.calculateSpans(prices);
        assertArrayEquals(expectedValues, actualSpans);
    }

}