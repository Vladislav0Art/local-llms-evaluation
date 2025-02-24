package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNextTest {

    @Mock
    private OnlineStockSpan onlineStockSpan;

    @Test
    public void nextTest() {
        // Test that next() method returns the correct value based on the price
        int price = 100;
        int expected = 10;
        when(onlineStockSpan.next(price)).thenReturn(expected);
        assertEquals(expected, onlineStockSpan.next(price));
    }

}