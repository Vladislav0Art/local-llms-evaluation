package leetcode.medium;

public class GeneratedNext_StackPopTwo {

    @Test
    public void next_StackPopTwo() {
        OnlineStockSpan onlineStockSpan = new OnlineStackSpan();
        int result = onlineStockSpan.next(0);
        assertNull(onlineStockSpan.priceStack.pop());
        result = onlineStockSpan.next(1);
        assertNull(onlineStockSpan.priceStack.pop());
        result = onlineStockSpan.next(-2);
        assertNotEquals(1, onlineStockSpan.priceStack.pop());
    }

}