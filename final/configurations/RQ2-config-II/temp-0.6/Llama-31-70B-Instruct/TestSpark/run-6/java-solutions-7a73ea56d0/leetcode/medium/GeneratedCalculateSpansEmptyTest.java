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
public class GeneratedCalculateSpansEmptyTest {

    @Mock
    private OnlineStockSpan onlineStockSpan;

    @Test
    public void calculateSpansEmptyTest() {
        // Test that calculateSpans() method returns an empty array when prices is empty
        int[] prices = {};
        int[] expected = {};
        when(onlineStockSpan.calculateSpans(prices)).thenReturn(expected);
        assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

}