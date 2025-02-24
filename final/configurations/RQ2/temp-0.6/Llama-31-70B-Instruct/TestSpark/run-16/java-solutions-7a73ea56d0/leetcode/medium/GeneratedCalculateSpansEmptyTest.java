package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedCalculateSpansEmptyTest {

    @Mock
    private OnlineStockSpan onlineStockSpan;

    @Test
    public void calculateSpansEmptyTest() {
        MockitoAnnotations.initMocks(this);
        int[] prices = new int[0];
        int[] expected = new int[0];
        when(onlineStockSpan.calculateSpans(prices)).thenReturn(expected);
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

}