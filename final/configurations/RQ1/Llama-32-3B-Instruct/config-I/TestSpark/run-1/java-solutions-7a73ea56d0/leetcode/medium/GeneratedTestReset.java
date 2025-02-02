package leetcode.medium;

public class GeneratedTestReset {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void testReset() {
        int price = 10;
        stockSpan.reset();
        assertEquals(1, stockSpan.next(price));
    }

}