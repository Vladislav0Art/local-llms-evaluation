package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedTest {

    private final OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_EmptyList_ReturnsZero() {
        assertEquals(0, onlineStockSpan.next(-100));
    }

    @Test
    public void next_NewElement_ReturnsOne() {
        onlineStockSpan.next(50);
        assertEquals(1, onlineStockSpan.next(50));
        assertEquals(2, onlineStockSpan.next(60));
    }

    @Test
    public void next_IncreasingSequence_ReturnsIncreasingNumber() {
        for (int i = 0; i < 10; i++) {
            int price = (i * 100) - 50;
            onlineStockSpan.next(price);
        }
        assertEquals(10, onlineStockSpan.next((11 * 100) + 20));
    }

    @Test
    public void next_DecreasingSequence_ReturnsDecreasingNumber() {
        for (int i = 0; i < 10; i++) {
            int price = (i * 100) - 50;
            onlineStockSpan.next(price);
        }
        assertEquals(1, onlineStockSpan.next((9 * 100) + 80));
    }

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        assertArrayEquals(new int[0], onlineStockSpan.calculateSpans(new int[0]));
    }

    @Test
    public void calculateSpans_SingleElement_ReturnsIntArrayWithOneElement() {
        int[] prices = {100};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{2}, result);
    }

    @Test
    public void next_MockStack_ReturnsCorrectCount() throws Exception {
        Stack<Integer> mockStack = new Stack<>();
        mockStack.push(10);
        assertEquals((Integer) 1, onlineStockSpan.next(-100, mockStack));
    }

}