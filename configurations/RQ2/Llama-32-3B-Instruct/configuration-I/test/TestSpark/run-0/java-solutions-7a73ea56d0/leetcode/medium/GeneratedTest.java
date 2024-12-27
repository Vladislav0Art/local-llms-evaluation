package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

public class GeneratedTest {

    private int count = 0;

    public int[] next(int price) {
        count++;
        return new int[]{count};
    }

    public int[] calculateSpans(int[] heights) {
        int[] result = new int[heights.length];
        result[0] = heights[0];

        for (int i = 1; i < heights.length; i++) {
            if (heights[i - 1] >= heights[i]) {
                result[i] = result[i - 1];
            } else {
                result[i] = heights[i] + heights.length;
            }
        }

        return result;
    }
}

public class OnlineStockSpanTest {

    private OnlineStockSpan stockSpan;

    @Before
    public void setUp() {
        stockSpan = new OnlineStockSpan();
    }

    @Test
    public void testNext_GivenPriceZero_ReturnsOne() {
        int[] result = stockSpan.next(0);
        assertEquals(new int[]{1}, result);
    }

    @Test
    public void testNext_GivenPositivePrice_ReturnsOne() {
        int[] result = stockSpan.next(10);
        assertEquals(new int[]{1}, result);
    }

    @Test
    public void testNext_GivenNegativePrice_ReturnsOne() {
        int[] result = stockSpan.next(-5);
        assertEquals(new int[]{1}, result);
    }

    @Test
    public void testCalculateSpans_EmptyArray_ReturnsEmptyArray() {
        int[] result = stockSpan.calculateSpans(new int[0]);
        assertArrayEquals(new int[0], result);
    }

    @Test
    public void testCalculateSpans_SingleElementArray_ReturnsCorrectSpan() {
        int[] prices = {10};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(new int[]{1}, result);
    }

    @Test
    public void testCalculateSpans_MultipleElementsArray_ReturnsCorrectSpans() {
        int[] prices = {10, 7, 5, 8, 11, 9};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(new int[]{1, 2, 1, 4, 5, 6}, result);
    }

    @Test
    public void testCalculateSpans_MultipleElementsArray_DuplicatePrices_ReturnsCorrectSpans() {
        int[] prices = {10, 7, 5, 8, 11, 9, 4, 2, 10};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(new int[]{1, 2, 1, 4, 5, 6, 3, 2, 1}, result);
    }

    @Test
    public void testCalculateSpans_MultipleElementsArray_DuplicatePricesAtEnd_ReturnsCorrectSpans() {
        int[] prices = {10, 7, 5, 8, 11, 9, 4, 2};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(new int[]{1, 2, 1, 4, 5, 6, 3, 2}, result);
    }

}