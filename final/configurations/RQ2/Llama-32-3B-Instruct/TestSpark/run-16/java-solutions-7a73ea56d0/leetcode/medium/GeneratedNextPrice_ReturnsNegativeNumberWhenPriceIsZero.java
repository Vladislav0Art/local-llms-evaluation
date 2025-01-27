package leetcode.medium;

public class GeneratedNextPrice_ReturnsNegativeNumberWhenPriceIsZero {

    private Stack<Integer> stack = new Stack<>();
    private int currentDay = 0;

    public static OnlineStockSpan createOnlineStockSpan() {
        return new OnlineStockSpan();
    }

    public int next(int price) {
        if (stack.isEmpty()) {
            currentDay++;
        } else {
            while (!stack.isEmpty() && price >= stack.peek()) {
                currentDay++;
                stack.pop();
            }
            currentDay++;
        }
        return currentDay;
    }

    public int[] calculateSpans(int[] prices) {
        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            if (i == 0) {
                result[i] = next(prices[i]);
            } else {
                result[i] = next(prices[i]) - next(prices[i - 1]);
            }
        }
        return result;
    }

}

public class OnlineStockSpanTest {

    private OnlineStockSpan onlineStockSpan;

    public void setUp() throws Exception {
        onlineStockSpan = OnlineStockSpan.createOnlineStockSpan();
    }

    @Test
    public void nextPrice_ReturnsNegativeNumberWhenPriceIsZero() {
        setupTest();
        assertEquals(-1, onlineStockSpan.next(0));
    }

}