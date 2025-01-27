package leetcode.medium;

public class GeneratedNextPriceZeroTest {

    private Stack<Integer> stack;

    public OnlineStockSpan() {
        this.stack = new java.util.Stack<>();
    }

    @Test
    public void nextPriceZeroTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stack = new java.util.Stack<>();
        stock.push(100);
        stock.push(50);
        stock.push(-1);
        stock.push(2);
        stock.push(3);
        int price = -1;
        stockSpan.next(price);
        assertEquals(4, stack.size());
    }

}