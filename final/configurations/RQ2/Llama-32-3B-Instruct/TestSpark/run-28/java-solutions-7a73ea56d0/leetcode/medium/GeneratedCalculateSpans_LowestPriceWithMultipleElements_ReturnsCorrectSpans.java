package leetcode.medium;

public class GeneratedCalculateSpans_LowestPriceWithMultipleElements_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_LowestPriceWithMultipleElements_ReturnsCorrectSpans() {
        // given
        int[] prices = {100, 80, 60};
        OnlineStockSpan stockSpan = new OnlineStack(); // mock

        // when
        int[] result = stockSpan.calculateSpans(prices);

        // then
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }
}

class OnlineStack {
    private Stack<Integer> stack;
    private Stack<Integer> priceStack;

    public OnlineStockSpanTest() {
        this.stack = new Stack<>();
        this.priceStack = new Stack<>();
    }

    public int next(int price) {
        if (price == priceStack.peek()) {
            return 1 + getTopPrice();
        } else {
            while (!priceStack.isEmpty() && priceStack.peek() < price) {
                stack.push(priceStack.pop());
            }
            priceStack.push(price);
            return 1 + getTopPrice();
        }
    }

    private int getTopPrice() {
        if (stack.isEmpty()) {
            return priceStack.pop();
        } else {
            return priceStack.get(stack.peek());
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