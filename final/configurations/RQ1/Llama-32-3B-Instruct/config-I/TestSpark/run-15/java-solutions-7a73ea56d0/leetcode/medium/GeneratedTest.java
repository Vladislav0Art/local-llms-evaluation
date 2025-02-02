package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTest {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void next_HappyPathTest() {
        assertEquals(1, stockSpan.next(100));
        stockSpan.list.add(50);
        stockSpan.next(40);
        stockSpan.next(30);
        stockSpan.next(20);
        stockSpan.next(10);
        assertEquals(4, stockSpan.next(5));
    }

    @Test
    public void next_LowerPathTest() {
        stockSpan.next(100);
        stockSpan.list.add(50);
        stockSpan.next(40);
        stockSpan.next(30);
        stockSpan.next(20);
        stockSpan.next(10);
        assertEquals(2, stockSpan.next(5));
    }

    @Test
    public void next_SamePathTest() {
        stockSpan.next(100);
        stockSpan.list.add(50);
        stockSpan.next(40);
        stockSpan.next(30);
        stockSpan.next(20);
        stockSpan.next(10);
        stockSpan.next(5);
        assertEquals(1, stockSpan.next(5));
    }

    @Test
    public void calculateSpans_EmptyInput_HappyPathTest() {
        int[] prices = new int[0];
        int[] expected = {};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpans_SingleElementInput_HappyPathTest() {
        int[] prices = {100};
        int[] expected = {1};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpans_MultipleElementsInput_HappyPathTest() {
        int[] prices = {100, 50, 40, 30, 20, 10};
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpans_MultipleElementsInput_LowerPrices_HappyPathTest() {
        int[] prices = {100, 50, 40, 30, 20, 10};
        Stack<Integer> indexStack = new Stack<>();
        int[] expected = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < prices.length; i++) {
            while (!indexStack.isEmpty() && prices[indexStack.peek()] <= prices[i])
                indexStack.pop();
            if (indexStack.isEmpty())
                expected[i] = i + 1;
            else
                expected[i] = i - indexStack.peek();
            indexStack.push(i);
        }
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

    @Test
    public void next_SamePathTest() {
        stockSpan.next(100);
        stockSpan.list.add(50);
        stockSpan.next(40);
        stockSpan.next(30);
        stockSpan.next(20);
        stockSpan.next(10);
        assertEquals(4, stockSpan.next(5));
    }

    @Test
    public void testList() {
        assertTrue(stockSpan.list.isEmpty());
    }

    @Test
    public void testNext() throws Exception {
        assertEquals(1, stockSpan.next(100));
        assertNotEquals(2, stockSpan.next(50));

        stockSpan.next(50);
        stockSpan.next(40);

        assertEquals(3, stockSpan.next(10));

        assertEquals(4, stockSpan.next(5));
    }

    @Test
    public void next_HappyPathTest() {
        assertEquals(1L, (long) stockSpan.next(100));
        stockSpan.list.add(50);
        stockSpan.next(40);
        stockSpan.next(30);
        stockSpan.next(20);
        stockSpan.next(10);
        assertEquals(4L, (long) stockSpan.next(5));
    }

    @Test
    public void next_LowerPathTest() {
        stockSpan.next(100);
        stockSpan.list.add(50);
        stockSpan.next(40);
        stockSpan.next(30);
        stockSpan.next(20);
        stockSpan.next(10);
        assertEquals(2L, (long) stockSpan.next(5));
    }

    @Test
    public void next_SamePathTest() {
        stockSpan.next(100);
        stockSpan.list.add(50);
        stockSpan.next(40);
        stockSpan.next(30);
        stockSpan.next(20);
        stockSpan.next(10);
        assertEquals(4L, (long) stockSpan.next(5));
    }

    @Test
    public void testNext() throws Exception {
        assertEquals(1L, stockSpan.next(100));
        assertNotEquals(2L, stockSpan.next(50));

        stockSpan.next(50);
        stockSpan.next(40);

        assertEquals(3L, stockSpan.next(10));

        assertEquals(4L, stockSpan.next(5));
    }

    @Test
    public void testNext() throws Exception {
        assertEquals((long) 1, stockSpan.next(100));
        assertNotEquals((long) 2, stockSpan.next(50));

        stockSpan.next(50);
        stockSpan.next(40);

        assertEquals((long) 3, stockSpan.next(10));

        assertEquals((long) 4, stockSpan.next(5));
    }

}