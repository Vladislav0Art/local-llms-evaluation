package leetcode.medium;

public class GeneratedCalculateSpansMultiplePricesTest {

    private Stack<Integer> stack;

    public OnlineStockSpan() {
        this.stack = new java.util.Stack<>();
    }

    @Test
    public void calculateSpansMultiplePricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stack = new java.util.Stack<>();
        stack.push(2);
        stack.push(3);
        int price = 4;
        stockSpan.next(price);
        assertEquals(5, stack.size());
    }

}