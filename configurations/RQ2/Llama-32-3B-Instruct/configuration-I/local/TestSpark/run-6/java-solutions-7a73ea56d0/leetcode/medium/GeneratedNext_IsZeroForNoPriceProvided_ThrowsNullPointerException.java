package leetcode.medium;

public class GeneratedNext_IsZeroForNoPriceProvided_ThrowsNullPointerException {

    private OnlineStockSpan onlineStockSpan;

    public void setUp() {
        onlineStockSpan = new OnlineStockSpan();
    }

    @Test
    public void next_IsZeroForNoPriceProvided_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> onlineStockSpan.next(null));
    }

}