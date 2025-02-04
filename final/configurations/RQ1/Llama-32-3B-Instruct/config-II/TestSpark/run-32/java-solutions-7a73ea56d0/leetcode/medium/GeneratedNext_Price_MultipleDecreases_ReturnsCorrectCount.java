package leetcode.medium;

public class GeneratedNext_Price_MultipleDecreases_ReturnsCorrectCount {

    @Test
    public void next_Price_MultipleDecreases_ReturnsCorrectCount() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(1000);
        stockSpan.next(900);
        stockSpan.next(800);
        int result = stockSpan.next(700);
        assertEquals(4, result);
    }

}