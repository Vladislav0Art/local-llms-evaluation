package leetcode.medium;

public class GeneratedNextTest {

    @Test
    public void nextTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(1, onlineStockSpan.next(10));
        assertEquals(2, onlineStockSpan.next(11));
        assertEquals(1, onlineStockSpan.next(10));
    }

}