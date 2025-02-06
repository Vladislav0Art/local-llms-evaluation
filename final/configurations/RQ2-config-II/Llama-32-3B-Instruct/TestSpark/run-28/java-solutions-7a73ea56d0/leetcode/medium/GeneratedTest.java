package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class GeneratedTest {

    @Test
    public void next_SinglePrice_ReturnsOne() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int result = solution.next(100);
        assertEquals(1, result);
    }

    @Test
    public void next_DuplicatePrice_ReturnsTwo() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int result = solution.next(100);
        int result2 = solution.next(100);
        assertEquals(2, result2);
    }

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[0]);
        assert Arrays.equals(result, new int[0]);
    }

    @Test
    public void calculateSpans_SingleElement_ReturnsIntArrayWithOneElement() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {100};
        int[] result = solution.calculateSpans(prices);
        assertEquals(1, result.length);
        assertEquals(100, result[0]);
    }

    @Test
    public void calculateSpans_DuplicateElements_ReturnsIntArrayWithCorrectSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 70};
        int[] result = solution.calculateSpans(prices);
        assertEquals(4, result.length);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(3, result[2]);
        assertEquals(4, result[3]);
    }

    @Test
    public void calculateSpans_NonAscendingPrices_ReturnsIntArrayWithCorrectSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 70};
        int[] result = solution.calculateSpans(prices);
        assertEquals(4, result.length);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(3, result[2]);
        assertEquals(4, result[3]);
    }

    @Test
    public void calculateSpans_ManyElements_ReturnsIntArrayWithCorrectSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 70, 60};
        int[] result = solution.calculateSpans(prices);
        assertEquals(5, result.length);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(3, result[2]);
        assertEquals(4, result[3]);
        assertEquals(5, result[4]);
    }

    @Test
    public void next_MockNext_ReturnsCorrectResult() {
        OnlineStockSpan solution = new OnlineStockSpan();
        final int[] price = {100};
        MockitoAnnotations.initMocks(this);
        when(solution.next(Mockito.anyInt())).thenReturn(price[0]);
        int result = solution.next(100);
        assertEquals(1, result);
    }

}