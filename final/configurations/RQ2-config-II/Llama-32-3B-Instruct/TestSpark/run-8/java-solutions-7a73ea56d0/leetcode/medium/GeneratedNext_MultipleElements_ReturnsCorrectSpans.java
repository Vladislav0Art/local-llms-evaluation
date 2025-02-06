package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNext_MultipleElements_ReturnsCorrectSpans {

    private OnlineStockSpan stockSpan = new OnlineStack();

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