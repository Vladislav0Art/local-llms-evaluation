package leetcode.medium;

public class GeneratedTestCalculateSpans_SingleElementArray {

    private static final int[][] prices = {
            {10, 9, 8, 7, 6, 5},
            {4, 5}
    };

    public void whenPricesAnyOf(int[] arrays) {
        for (int[] array : arrays) {
            if (array.length > 0 && isArrayAnyOf(array)) {
                return true;
            }
        }
        return false;
    }

    private boolean isArrayAnyOf(int[] array) {
        for (int price : array) {
            if (price < prices[0][0] || price >= prices[0][prices[0].length - 1]) {
                return true;
            }
        }
        return false;
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

    @Test
    public void testCalculateSpans_SingleElementArray() {
        GeneratedTest generatedTest = new GeneratedTest();
        assertEquals(1, generatedTest.calculateSpans(prices[0]));
    }

}