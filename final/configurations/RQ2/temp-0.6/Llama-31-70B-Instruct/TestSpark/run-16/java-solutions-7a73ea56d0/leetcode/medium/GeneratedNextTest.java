package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedNextTest {

    @Mock
    private OnlineStockSpan onlineStockSpan;

    @Test
    public void nextTest() {
        MockitoAnnotations.initMocks(this);
        int price = 10;
        int expected = 1;
        when(onlineStockSpan.next(price)).thenReturn(expected);
        int result = onlineStockSpan.next(price);
        assertEquals(expected, result);
    }

}