package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void next[
    Int]

    Test() {
        OnlineStockSpan underTest = new OnlineStockSpan();
        assertEquals(1, underTest.next(100));
    }

    @Test
    public void next[
    MultiplePricesTest]()

    {
        OnlineStockSpan underTest = new OnlineStockSpan();
        int[] result = underTest.next(new int[]{100});
        assertEquals(1, result[0]);
    }

    @Test
    public void next[
    BulkPricesTest]()

    {
        OnlineStockSpan underTest = new OnlineStockSpan();
        int[][] expectedResults = {{1}, {2}, {3}};
        for (int[] expectedResult : expectedResults) {
            assertArrayEquals(expectedResult, underTest.next(new int[]{100, 80, 75, 100}));
        }
    }

    @Test
    public void calculateSpans[
    Int]

    Test() {
        OnlineStockSpan underTest = new OnlineStack();
        assertEquals(new int[]{1}, underTest.calculateSpans(new int[]{100}));
    }

    @Test
    public void calculateSpans[
    MultiplePricesTest]()

    {
        OnlineStockSpan underTest = new OnlineStack();
        int[][] expectedResults = {{1}, {2, 1}, {3, 1, 2}};
        for (int[] expectedResult : expectedResults) {
            assertArrayEquals(expectedResult, underTest.calculateSpans(new int[]{100, 80, 75, 100}));
        }
    }

    @Test
    public void calculateSpans[
    BulkPricesTest]()

    {
        OnlineStockSpan underTest = new OnlineStack();
        int[][] expectedResults = {{{1}, {2, 1}, {3, 1, 2}}, {{1}, {2}, {3}}};
        for (int[][] expectedResult : expectedResults) {
            assertArrayEquals(expectedResult, underTest.calculateSpans(new int[]{100, 80, 75, 100, 120, 65}));
        }
    }

    @Test
    public void calculateSpans[
    InvalidInputTest]()

    {
        OnlineStockSpan underTest = new OnlineStack();
        assertThrows(NullPointerException.class, () -> underTest.calculateSpans(null));
    }
}

class OnlineStack {
    private Stack<Integer> stack;
    private int index;

    public OnlineStack() {
        this.stack = new Stack<>();
        this.index = 0;
    }

    public void next(int price) {
        while (!stack.isEmpty()) {
            if (stack.peek() <= price) {
                stack.pop();
            } else {
                break;
            }
        }
        stack.push(index);
        index++;
    }

    public int[] calculateSpans(int[] prices) {
        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            int currentPrice = prices[i];
            while (!stack.isEmpty()) {
                if (currentPrice >= stack.peek()) {
                    stack.pop();
                } else {
                    break;
                }
            }
            result[i] = stack.size() + 1;
        }
        return result;
    }

}