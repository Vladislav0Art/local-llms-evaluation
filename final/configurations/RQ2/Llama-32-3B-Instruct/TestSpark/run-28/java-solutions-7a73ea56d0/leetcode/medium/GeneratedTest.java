package leetcode.medium;

public class GeneratedTest {

    @Test
    public void next_WithSinglePrice_Returns1() {
        // given
        OnlineStockSpan stockSpan = new OnlineStockSpan();

        // when
        int result = stockSpan.next(100);

        // then
        assertEquals(1, result);
    }

    @Test
    public void next_DuplicatePrices_ReturnsSameNumber() {
        // given
        OnlineStockSpan stockSpan = new OnlineStack(); // mock

        // when
        int result = stockSpan.next(100);

        // then
        assertEquals(1, result); // assume the mock returns 1
    }

    @Test
    public void next_LowestPrice_ReturnsMostSpan() {
        // given
        List<Integer> prices = Arrays.asList(100, 80, 60);
        OnlineStockSpan stockSpan = new OnlineStack(); // mock

        // when
        int result = stockSpan.next(prices.get(0));

        // then
        assertEquals(1, result); // assume the mock returns 1
    }

    @Test
    public void next_LowestPriceWithMultipleElements_ReturnsMostSpan() {
        // given
        List<Integer> prices = Arrays.asList(100, 80, 60);
        OnlineStockSpan stockSpan = new OnlineStack(); // mock

        // when
        int result = stockSpan.next(prices.get(1));

        // then
        assertEquals(2, result); // assume the mock returns 2
    }

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        // given
        OnlineStockSpan stockSpan = new OnlineStack(); // mock

        // when
        int[] result = stockSpan.calculateSpans(new int[0]);

        // then
        assertArrayEquals(new int[0], result);
    }

    @Test
    public void calculateSpans_SingleElementArray_ReturnsCorrectSpan() {
        // given
        int[] prices = {100};
        OnlineStockSpan stockSpan = new OnlineStack(); // mock

        // when
        int[] result = stockSpan.calculateSpans(prices);

        // then
        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void calculateSpans_MultipleElementsArray_ReturnsCorrectSpans() {
        // given
        int[] prices = {100, 80, 60};
        OnlineStockSpan stockSpan = new OnlineStack(); // mock

        // when
        int[] result = stockSpan.calculateSpans(prices);

        // then
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

    @Test
    public void calculateSpans_DuplicatePrices_ReturnsCorrectSpans() {
        // given
        int[] prices = {100, 80, 60};
        OnlineStockSpan stockSpan = new OnlineStack(); // mock

        // when
        int[] result = stockSpan.calculateSpans(prices);

        // then
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

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