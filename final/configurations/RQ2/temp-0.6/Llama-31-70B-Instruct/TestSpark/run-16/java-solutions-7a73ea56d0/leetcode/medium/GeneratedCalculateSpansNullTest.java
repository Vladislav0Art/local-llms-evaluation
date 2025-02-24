package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedCalculateSpansNullTest {

    @Mock
    private OnlineStockSpan onlineStockSpan;

    @Test
    public void calculateSpansNullTest() {
        MockitoAnnotations.initMocks(this);
        int[] prices = null;
        int[] expected = null;
        when(onlineStockSpan.calculateSpans(prices)).thenReturn(expected);
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

}