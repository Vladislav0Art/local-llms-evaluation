package leetcode.medium;

public class GeneratedCalculateSpansZeroPricesTest {

    private Stack<Integer> stack;

    public OnlineStockSpan() {
        this.stack = new java.util.Stack<>();
    }

    @Test
    public void calculateSpansZeroPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[]{0, 2, -1});
        assertEquals(new int[]{3, 5, 2}, result);
    }

}