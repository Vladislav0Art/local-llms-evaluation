package leetcode.medium;

public class GeneratedTest {

    private static final int[][] prices = {
            {10, 9, 8, 7, 6, 5},
            {4, 5}
    };

    public void whenPricesAnyOf(int[] arrays) {
        for (int[] array : arrays) {
            if (isArrayAnyOf(array)) {
                return true;
            }
        }
        return false;
    }

    private boolean isArrayAnyOf(int[] array) {
        Stack<Integer> stack = new Stack<>();
        int minPrice = prices[0][0];
        int maxPrice = prices[0][prices[0].length - 1];

        for (int price : array) {
            if (price < minPrice || price > maxPrice) {
                return true;
            }

            while (!stack.isEmpty() && stack.peek() >= price) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                stack.push(price);
            } else {
                stack.push(price);
                stack.pop();
            }
        }

        return stack.size() == 0;
    }

    public int calculateSpans(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && stock.peek() >= prices[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                stack.push(prices[i]);
            } else {
                stack.push(prices[i]);
                stack.pop();
            }
        }
        return stack.size();
    }

    public void assertEquals(int expected, int actual) {
        if (expected != actual) {
            throw new AssertionError("Expected " + expected + ", but got " + actual);
        }
    }

}