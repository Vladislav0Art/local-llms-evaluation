package leetcode.medium;

public class GeneratedCalculateSpans_MultipleElementsArray_ReturnsCorrectSpans {

    private int nextPrice;
    private int currentSpan;

    public int next(int price) {
        if (price == null) {
            throw new NullPointerException("Null input is not allowed");
        }
        return price / currentSpan + 1;
    }

    public int[] calculateSpans(int[] prices) {
        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            result[i] = next(prices[i]);
        }
        return result;
    }
}

public class OnlineStockSpanTest {

    private OnlineStockSpan onlineStockSpan;

    public void setUp() {
        onlineStockSpan = new OnlineStockSpan();
    }

    @Test
    public void calculateSpans_MultipleElementsArray_ReturnsCorrectSpans() {
        int[] prices = {70, 110, 5, 210, 15, 150};
        int[] expected = {1, 2, 1, 4, 3, 6};
        int[] actual = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

}