package leetcode.medium;

public class GeneratedCalculateSpansSinglePriceTest {

    private Stack<Integer> stack;

    public OnlineStockSpan() {
        this.stack = new java.util.Stack<>();
    }

    @Test
    public void calculateSpansSinglePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stack = new java.util.Stack<>();
        stack.push(100);
        int price = 1;
        stockSpan.next(price);
        assertEquals(0, stack.size());
    }

}