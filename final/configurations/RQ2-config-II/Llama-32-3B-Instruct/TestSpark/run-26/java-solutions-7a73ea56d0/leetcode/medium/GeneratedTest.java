package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedTest {

    private OnlineStockSpan underTest = new OnlineStockSpan();

    @Test
    public void calculateSpans_EmptyInput_ReturnsEmptyArray() {
        int[] prices = {};
        int[] result = underTest.calculateSpans(prices);
        assertEquals(0, result.length);
    }

    @Test
    public void calculateSpans_OneElementInput_ReturnsSpanOne() {
        int[] prices = {1};
        int[] result = underTest.calculateSpans(prices);
        assertEquals(new int[]{1}, result);
    }

    @Test
    public void next_EmptyStack_ReturnsZero() {
        Stack<Integer> stack = new Stack<>();
        int price = 100;
        int result = underTest.next(price, stack);
        assertEquals(0, result);
    }

    @Test
    public void next_AddPriceToStack_ReturnsCorrectSpan() {
        Stack<Integer> stack = new Stack<>();
        underTest.next(10, stack); // push 10 onto the stack
        underTest.next(20, stack); // push 20 onto the stack
        int price = 30;
        int result = underTest.next(price, stack);
        assertEquals(1, result); // span is 2 (20-10)
    }

    @Test
    public void next_PriceDecreaseSpan_CorrectlyUpdate() {
        Stack<Integer> stack = new Stack<>();
        underTest.next(100, stack); // push 100 onto the stack
        underTest.next(90, stack); // push 90 onto the stack
        underTest.next(80, stack); // push 80 onto the stack
        int price = 70;
        int result = underTest.next(price, stack);
        assertEquals(3, result); // span is 1 (100-80)
    }

    @Test
    public void next_NoChangeSpan_ReturnsCorrectValue() {
        Stack<Integer> stack = new Stack<>();
        underTest.next(10, stack); // push 10 onto the stack
        int price = 20;
        int result = underTest.next(price, stack);
        assertEquals(1, result); // span is still 1 (20-10)
    }

    @Test
    public void calculateSpans_SingleElementInput_ReturnsCorrectValue() {
        int[] prices = {100};
        int[] result = underTest.calculateSpans(prices);
        assertEquals(new int[]{1}, result);
    }

    @Test
    public void calculateSpans_MultipleElementsInput_ReturnsCorrectValues() {
        int[] prices = {10, 20, 30, 40, 50};
        int[] result = underTest.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

    @Test
    public void calculateSpans_EqualConsecutiveElements_ReturnsCorrectSpan() {
        int[] prices = {10, 20, 30, 40};
        int[] result = underTest.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 3, 4}, result);
    }

    @Test
    public void calculateSpans_NonConsecutiveDecrease_ReturnsCorrectSpan() {
        int[] prices = {10, 40, 30, 20};
        int[] result = underTest.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 3, 2, 4}, result);
    }

    @Test
    public void calculateSpans_NonConsecutiveIncrease_ReturnsCorrectSpan() {
        int[] prices = {10, 40, 30, 50};
        int[] result = underTest.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 3, 5}, result);
    }

}