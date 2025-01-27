package leetcode.medium;

public class GeneratedCalculateSpansPositivePricesTest {

    private Stack<Integer> stack;

    public OnlineStockSpan() {
        this.stack = new java.util.Stack<>();
    }

    @Test
    public void calculateSpansPositivePricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stack = new java.util.Stack<>();
        stack.push(2);
        stack.push(3);
        int price = 4;
        stockSpan.next(price);
        assertEquals(new int[]{5, 6}, stockSpan.calculateSpans(new int[]{}));
    }

}