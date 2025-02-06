package leetcode.medium;

public class GeneratedNext_StackPop {

    @Test
    public void next_StackPop() {
        OnlineStockSpan onlineStockSpan = new OnlineStackSpan();
        int result = onlineStockSpan.next(0);
        assertNull(onlineStockSpan.priceStack.pop());
        result = onlineStackSpan.next(1);
        assertNotEquals(1, onlineStockSpan.priceStack.pop());
    }

}