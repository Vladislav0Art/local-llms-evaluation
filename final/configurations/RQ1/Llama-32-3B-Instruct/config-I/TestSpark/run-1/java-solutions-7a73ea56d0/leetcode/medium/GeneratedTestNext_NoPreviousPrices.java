package leetcode.medium;

public class GeneratedTestNext_NoPreviousPrices {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void testNext_NoPreviousPrices() {
        int price = 7;
        stockSpan.reset();
        assertEquals(1, stockSpan.next(price));
    }

}