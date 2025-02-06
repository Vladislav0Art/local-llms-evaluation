package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    private OnlineStockSpan stockSpan = new OnlineStack();

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        int[] result = stockSpan.calculateSpans(new int[0]);
        assertResult(result, new int[0]);
    }

    @Test
    public void calculateSpans_SingleElementReturnOneSpan() {
        int[] prices = {1};
        int[] result = stockSpan.calculateSpans(prices);
        assertResult(result, new int[]{1});
    }

    @Test
    public void calculateSpans_MultipleElements_ReturnsCorrectSpans() {
        int[] prices = {10, 7, 5, 8, 11, 9};
        int[] result = stockSpan.calculateSpans(prices);
        assertResult(result, new int[]{1, 2, 1, 3, 4, 5});
    }

    @Test
    public void next_SingleElementPrice_ReturnsOne() {
        assertEquals(1, stockSpan.next(10));
    }

    @Test
    public void next_MultipleElements_ReturnsCorrectSpans() {
        int[] prices = {10, 7, 5, 8, 11, 9};
        for (int price : prices) {
            assertEquals(price, stockSpan.next(price));
        }
    }
}

public class OnlineStack {

    private Stack<Integer> stack;
    private List<Integer> indexMap;

    public OnlineStack() {
        stack = new Stack<>();
        indexMap = new ArrayList<>();
    }

    public int next(int price) {
        if (stack.isEmpty()) {
            stack.push(price);
            indexMap.add(0, price);
            return 1;
        } else {
            while (!stack.isEmpty() && stack.peek() <= price) {
                int top = stack.pop();
                indexMap.remove(indexMap.size() - 1);
                indexMap.add(indexMap.get(indexMap.size() - 1), top);
            }
            stack.push(price);
            indexMap.add(stack.size(), price);
            return stack.size() - indexMap.get(stack.size() - 1) + 1;
        }
    }

    public int[] calculateSpans(int[] prices) {
        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            result[i] = next(prices[i]);
        }
        return result;
    }

}

public class Helper {

    private void assertResult(int[] expected, int[] actual) {
        if (!java.util.Arrays.equals(expected, actual)) {
            throw new AssertionError("Expected " + java.util.Arrays.toString(expected) + ", but got " + java.util.Arrays.toString(actual));
        }
    }

}