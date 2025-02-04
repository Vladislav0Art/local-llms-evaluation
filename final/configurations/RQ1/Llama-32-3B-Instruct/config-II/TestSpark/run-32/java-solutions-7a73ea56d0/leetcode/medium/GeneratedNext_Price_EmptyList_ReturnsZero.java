package leetcode.medium;

public class GeneratedNext_Price_EmptyList_ReturnsZero {

    @Test
    public void next_Price_EmptyList_ReturnsZero() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int result = stockSpan.next(100);
        assertEquals(0, result);
    }

}