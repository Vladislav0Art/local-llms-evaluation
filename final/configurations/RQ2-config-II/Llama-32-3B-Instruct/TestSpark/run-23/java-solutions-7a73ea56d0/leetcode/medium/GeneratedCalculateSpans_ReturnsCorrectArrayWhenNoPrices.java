package leetcode.medium;

public class GeneratedCalculateSpans_ReturnsCorrectArrayWhenNoPrices {

    @Test
    public void calculateSpans_ReturnsCorrectArrayWhenNoPrices() {
        // Arrange
        int[] prices = {};
        OnlineStackSpan onlineStockSpan = new OnlineStackSpan();

        // Act
        int[] result = onlineStockSpan.calculateSpans(prices);

        // Assert
        assertArrayEquals(new int[]{new OnlineStockSpan()[0]}, result);
    }

    private static class OnlineStackSpan extends OnlineStockSpan {
        Stack<Integer> stack;

        @Override
        public void init() {
            super.init();
            this.stack = new Stack<>();
        }
    }

}