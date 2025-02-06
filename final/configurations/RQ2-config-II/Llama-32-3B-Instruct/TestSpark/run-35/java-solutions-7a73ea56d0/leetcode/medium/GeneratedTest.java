package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedTest {

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        int[] prices = new int[0];
        int[] result = OnlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[0], result);
    }

    @Test
    public void calculateSpans_SingleElementArray_ReturnsSingleElementArray() {
        int[] prices = {100};
        int[] result = OnlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void next_NoPreviousPrice_ReturnsOne() {
        int price = 10;
        int result = OnlineStockSpan.next(price);
        assertEquals(1, result);
    }

    @Test
    public void next_PreviousPriceKnown_ReturnsCorrectValue() {
        int price = 20;
        int prevPrice = 15;
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(prevPrice);
        int result = stockSpan.next(price);
        assertEquals(2, result);
    }

    @Test
    public void next_PreviousPriceUnknown_ReturnsCorrectValue() {
        int price = 10;
        OnlineStockSpan stockSpan = new OnlineStackSpan();
        int result = stockSpan.next(price);
        assertEquals(1, result);
    }

    private static class OnlineStackSpan extends OnlineStockSpan {

        @Override
        public List<Integer> calculateSpans(int[] prices) {
            // implementation using Stack
            return null;
        }
    }

    @Test
    public void next_PreviousPricesKnown_ReturnsCorrectValue() {
        int price = 10;
        int prevPrice1 = 15;
        int prevPrice2 = 20;
        OnlineStockSpan stockSpan = new OnlineStackSpan();
        stockSpan.next(prevPrice1);
        stockSpan.next(prevPrice2);
        int result = stockSpan.next(price);
        assertEquals(3, result);
    }

    @Test
    public void next_PreviousPricesUnknown_ReturnsCorrectValue() {
        int price = 10;
        OnlineStockSpan stockSpan = new OnlineStackSpan();
        for (int i = 0; i < 5; i++) {
            stockSpan.next(i * 15);
        }
        int result = stockSpan.next(price);
        assertEquals(1, result);
    }

    @Test
    public void next_PreviousPriceSequenceKnown_ReturnsCorrectValue() {
        int price = 10;
        int prevPrice1 = 15;
        int prevPrice2 = 20;
        OnlineStockSpan stockSpan = new OnlineStackSpan();
        stockSpan.next(prevPrice1);
        stockSpan.next(prevPrice2);
        for (int i = 0; i < 5; i++) {
            stockSpan.next(i * 10);
        }
        int result = stockSpan.next(price);
        assertEquals(4, result);
    }

    @Test
    public void next_PreviousPricesSequenceUnknown_ReturnsCorrectValue() {
        int price = 10;
        OnlineStockSpan stockSpan = new OnlineStackSpan();
        for (int i = 0; i < 6; i++) {
            stockSpan.next(i * 10);
        }
        int result = stockSpan.next(price);
        assertEquals(1, result);
    }

    @Test
    public void next_PreviousPricesSequenceKnownAndPriceLow_ReturnsCorrectValue() {
        int price = 5;
        int prevPrice1 = 10;
        int prevPrice2 = 15;
        OnlineStockSpan stockSpan = new OnlineStackSpan();
        stockSpan.next(prevPrice1);
        stockSpan.next(prevPrice2);
        for (int i = 0; i < 6; i++) {
            stockSpan.next(i * 20);
        }
        int result = stockSpan.next(price);
        assertEquals(3, result);
    }

    @Test
    public void next_PreviousPricesSequenceUnknownAndPriceLow_ReturnsCorrectValue() {
        int price = 5;
        OnlineStockSpan stockSpan = new OnlineStackSpan();
        for (int i = 0; i < 6; i++) {
            stockSpan.next(i * 20);
        }
        int result = stockSpan.next(price);
        assertEquals(1, result);
    }

}