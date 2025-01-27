package leetcode.medium;

public class GeneratedNextPriceNegativeTest {

    private Stack<Integer> stack;

    public OnlineStockSpan() {
        this.stack = new java.util.Stack<>();
    }

    @Test
    public void nextPriceNegativeTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[]{0});
        assertEquals(new int[]{0}, result);
    }

}