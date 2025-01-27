package leetcode.medium;

public class GeneratedTestCalculateSpans {

    private int pointer;

    public OnlineStockSpan(int initialPointer) {
        this.pointer = initialPointer;
    }

    public int next(int price) {
        return pointer + 1;
    }

    public int[] calculateSpans(int[] prices) {
        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            result[i] = pointer - prices[i] + 1;
        }
        return result;
    }
}

public class GeneratedTest {

    @Test
    public void testCalculateSpans() {
        OnlineStockSpan stockSpan = new OnlineStockSpan(0);
        int[] prices = {1, 2, 3, 4, 5};
        int[] expected = {1, 3, 4, 5, 6};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}