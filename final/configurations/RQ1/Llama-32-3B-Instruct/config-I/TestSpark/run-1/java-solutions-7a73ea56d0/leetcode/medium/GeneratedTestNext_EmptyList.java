package leetcode.medium;

public class GeneratedTestNext_EmptyList {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void testNext_EmptyList() {
        stockSpan.reset();
        assertEquals(0, stockSpan.next(null));
    }

}