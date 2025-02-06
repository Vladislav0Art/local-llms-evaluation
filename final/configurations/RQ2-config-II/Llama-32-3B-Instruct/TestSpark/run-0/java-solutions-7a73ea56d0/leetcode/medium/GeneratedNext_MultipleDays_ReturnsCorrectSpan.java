package leetcode.medium;

public class GeneratedNext_MultipleDays_ReturnsCorrectSpan {

    @Test
    public void next_MultipleDays_ReturnsCorrectSpan() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        for (int i = 0; i < 10; i++) {
            stockSpan.next(i);
        }
        assertEquals(10, stockSpan.next(5));
    }

}