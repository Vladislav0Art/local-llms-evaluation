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
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 30};
        int[] expected = {1, 2, 3};
        int[] actual = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

}