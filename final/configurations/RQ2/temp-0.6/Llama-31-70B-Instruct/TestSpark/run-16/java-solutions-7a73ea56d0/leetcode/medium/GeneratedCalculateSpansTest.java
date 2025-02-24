package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedCalculateSpansTest {

    @Mock
    private OnlineStockSpan onlineStockSpan;

    @Test
    public void calculateSpansTest() {
        MockitoAnnotations.initMocks(this);
        int[] prices = {1, 2, 3};
        int[] expected = {1, 2, 3};
        when(onlineStockSpan.calculateSpans(prices)).thenReturn(expected);
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

}