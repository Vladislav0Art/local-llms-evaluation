package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void next_EmptyList_Returns0() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.next(10);
        assertEquals(0, result);
    }

    @Test
    public void next_SingleElementList_Returns1() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(10);
        int result = onlineStockSpan.next(10);
        assertEquals(1, result);
    }

    @Test
    public void next_IncreasingList_Returns1() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(10);
        onlineStockSpan.next(20);
        onlineStockSpan.next(30);
        int result = onlineStockSpan.next(10);
        assertEquals(1, result);
    }

    @Test
    public void next_DecreasingList_ReturnsCount() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(30);
        onlineStockSpan.next(20);
        onlineStockSpan.next(10);
        int result = onlineStockSpan.next(5);
        assertEquals(3, result);
    }

    @Test
    public void next_SamePrice_ReturnsCount() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(10);
        onlineStockSpan.next(10);
        onlineStockSpan.next(10);
        int result = onlineStockSpan.next(10);
        assertEquals(3, result);
    }

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[0]);
        assertTrue(result.length == 0);
    }

}