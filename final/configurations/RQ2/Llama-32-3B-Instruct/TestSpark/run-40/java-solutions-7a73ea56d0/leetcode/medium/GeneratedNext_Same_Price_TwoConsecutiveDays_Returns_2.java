package leetcode.medium;

public class GeneratedNext_Same_Price_TwoConsecutiveDays_Returns_2 {


    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_Same_Price_TwoConsecutiveDays_Returns_2() {
        onlineStockSpan.next(10);
        onlineStockSpan.next(10);
        assertEquals(2, onlineStockSpan.next(10));
    }

}