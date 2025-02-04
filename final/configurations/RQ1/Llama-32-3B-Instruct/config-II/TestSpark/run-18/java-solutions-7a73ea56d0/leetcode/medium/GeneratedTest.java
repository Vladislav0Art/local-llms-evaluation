package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private List<Integer> list;

    @Mock
    private Stack<Integer> indexStack;

    public void initMocks() {
        when(indexStack.isEmpty()).thenReturn(true);
        when(indexStack.pop()).thenReturn(0);
        when(indexStack.push(anyInt())).thenReturn(indexStack);
        when(list.add(anyInt())).thenReturn(list);
    }

    @Test
    public void next_SingleElement_Returns1() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.list = list;
        int price = 10;
        onlineStockSpan.next(price);
        assertEquals(1, onlineStockSpan.list.get(0));
    }

    @Test
    public void next_DuplicateElement_ReturnsSameValue() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.list = list;
        int price = 10;
        onlineStockSpan.next(price);
        onlineStockSpan.next(price);
        assertEquals(1, onlineStockSpan.list.get(0));
    }

    @Test
    public void next_DifferentElement_ReturnsCount() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.list = list;
        int price = 10;
        onlineStockSpan.next(price);
        onlineStockSpan.next(20);
        assertEquals(2, onlineStockSpan.list.get(0));
    }

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] expectedSpans = {};
        onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, onlineStockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpans_SingleElement_Returns1() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10};
        int[] expectedSpans = {1};
        onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, onlineStockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpans_DuplicateElements_ReturnsCorrectSpans() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 30, 40, 50};
        int[] expectedSpans = {1, 2, 3, 4, 5};
        onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, onlineStockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpans_NoDecreasingSequence_ReturnsCorrectSpans() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 40, 30, 60, 50};
        int[] expectedSpans = {1, 2, 3, 4, 5};
        onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, onlineStockSpan.calculateSpans(prices));
    }

    @Test
    public void next_InvalidInput_ThrowsNullPointerException() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.list = list;
        int price = null;
        assertThrows(NullPointerException.class, () -> onlineStockSpan.next(price));
    }

}