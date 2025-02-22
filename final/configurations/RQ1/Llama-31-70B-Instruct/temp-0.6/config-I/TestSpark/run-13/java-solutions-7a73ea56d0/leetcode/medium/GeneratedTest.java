package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedTest {

    @Mock
    private OnlineStockSpan onlineStockSpan;

    @Test
    public void OnlineStockSpanConstructorTest() {
        MockitoAnnotations.initMocks(this);
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertNotNull(onlineStockSpan);
    }

    @Test
    public void nextTest() {
        MockitoAnnotations.initMocks(this);
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = 10;
        int expected = 10;
        int actual = onlineStockSpan.next(price);
        assertEquals(expected, actual);
    }

    @Test
    public void calculateSpansTest() {
        MockitoAnnotations.initMocks(this);
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 30};
        int[] expected = {1, 2, 3};
        int[] actual = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

}