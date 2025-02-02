package leetcode.medium;

public class GeneratedTestNextThrowsExceptionWhenNextIsCalledWithNullPrice {

    private final OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void testNextThrowsExceptionWhenNextIsCalledWithNullPrice() {
        assertThrows(NullPointerException.class, () -> onlineStockSpan.next(null));
    }

}