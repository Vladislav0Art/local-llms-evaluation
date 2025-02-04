package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private OnlineStockSpan onlineStockSpan;

    @Test
    public void next_SinglePriceTest() {
        onlineStockSpan.next(10);
        assertEquals(1, onlineStockSpan.list.size());
        assertEquals(10, onlineStockSpan.list.get(0));
    }

    @Test
    public void next_IncreasingPricesTest() {
        onlineStockSpan.next(10);
        onlineStockSpan.next(20);
        onlineStockSpan.next(30);
        assertEquals(3, onlineStockSpan.list.size());
        assertEquals(10, onlineStockSpan.list.get(0));
        assertEquals(20, onlineStockSpan.list.get(1));
        assertEquals(30, onlineStockSpan.list.get(2));
    }

    @Test
    public void next_DecreasingPricesTest() {
        onlineStockSpan.next(30);
        onlineStockSpan.next(20);
        onlineStockSpan.next(10);
        assertEquals(3, onlineStockSpan.list.size());
        assertEquals(30, onlineStockSpan.list.get(0));
        assertEquals(20, onlineStockSpan.list.get(1));
        assertEquals(10, onlineStockSpan.list.get(2));
    }

    @Test
    public void next_ConsecutiveEqualPricesTest() {
        onlineStockSpan.next(10);
        onlineStockSpan.next(10);
        onlineStockSpan.next(10);
        assertEquals(3, onlineStockSpan.list.size());
        assertEquals(10, onlineStockSpan.list.get(0));
        assertEquals(10, onlineStockSpan.list.get(1));
        assertEquals(10, onlineStockSpan.list.get(2));
    }

    @Test
    public void next_EmptyListTest() {
        assertEquals(0, onlineStockSpan.list.size());
    }

    @Test
    public void calculateSpans_EmptyArrayTest() {
        int[] prices = {};
        int[] expected = {};
        int[] actual = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void calculateSpans_SingleElementArrayTest() {
        int[] prices = {10
        }

    }