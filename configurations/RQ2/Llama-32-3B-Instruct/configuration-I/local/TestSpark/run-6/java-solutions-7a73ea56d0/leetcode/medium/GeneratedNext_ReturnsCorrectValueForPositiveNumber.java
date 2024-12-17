package leetcode.medium;

public class GeneratedNext_ReturnsCorrectValueForPositiveNumber {

    private OnlineStockSpan onlineStockSpan;

    public void setUp() {
        onlineStockSpan = new OnlineStockSpan();
    }

    @Test
    public void next_ReturnsCorrectValueForPositiveNumber() {
        assertEquals(1, (int) onlineStockSpan.next(100));
    }

}