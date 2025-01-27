package leetcode.medium;

public class GeneratedNextPriceIsIncrasedTest {

    private Stack<Integer> stack;

    public OnlineStockSpan() {
        this.stack = new java.util.Stack<>();
    }

    @Test
    public void nextPriceIsIncrasedTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        assertEquals(1, stack.size());
    }

}