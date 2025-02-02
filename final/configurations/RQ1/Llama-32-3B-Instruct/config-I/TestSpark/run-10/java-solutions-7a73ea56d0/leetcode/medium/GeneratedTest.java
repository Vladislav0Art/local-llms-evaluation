package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedTest {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void next_PriceIsGreaterOrEqualToAllPreviousPrices_ReturnsCount() {
        // given
        int price = 100;
        int expectedCount = 1;

        // when
        int actualCount = stockSpan.next(price);

        // then
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void next_PriceIsLessThanAllPreviousPrices_ReturnsCorrectCount() {
        // given
        int price = 80;
        int[] previousPrices = {100};
        int expectedCount = 2;

        stockSpan.next(100);

        // when
        int actualCount = stockSpan.next(price);

        // then
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void next_PriceIsEqualToAllPreviousPrices_ReturnsCorrectCount() {
        // given
        int price = 90;
        int[] previousPrices = {100};
        int expectedCount = 1;

        stockSpan.next(100);

        // when
        int actualCount = stockSpan.next(price);

        // then
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void calculateSpans_SpanOfFirstElementIsAlwaysOne() {
        // given
        int[] prices = {100};

        // when
        int[] spans = stockSpan.calculateSpans(prices);

        // then
        assertEquals(1, spans[0]);
    }

    @Test
    public void calculateSpans_SpanForNonConsecutiveDayIsCorrect() {
        // given
        int[] prices = {90, 100, 70};

        // when
        int[] spans = stockSpan.calculateSpans(prices);

        // then
        assertEquals(1, spans[0]);
        assertEquals(2, spans[1]);
        assertEquals(3, spans[2]);
    }

    @Test
    public void calculateSpans_SpanForConsecutiveDayIsCorrect() {
        // given
        int[] prices = {90, 100};

        // when
        int[] spans = stockSpan.calculateSpans(prices);

        // then
        assertEquals(1, spans[0]);
        assertEquals(2, spans[1]);
    }

    @Test
    public void calculateSpans_EmptyArray_ReturnsCorrectArray() {
        // given
        int[] prices = {};

        // when
        int[] spans = stockSpan.calculateSpans(prices);

        // then
        assertNull(spans);
    }

}