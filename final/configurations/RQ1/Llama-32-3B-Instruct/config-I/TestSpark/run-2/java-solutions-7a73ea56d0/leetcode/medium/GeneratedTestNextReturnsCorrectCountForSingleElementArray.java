package leetcode.medium;

public class GeneratedTestNextReturnsCorrectCountForSingleElementArray {

    private final OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void testNextReturnsCorrectCountForSingleElementArray() {
        int price = 10;
        onlineStockSpan.next(price);
        assertEquals(1, onlineStockSpan.next(price));
    }

}