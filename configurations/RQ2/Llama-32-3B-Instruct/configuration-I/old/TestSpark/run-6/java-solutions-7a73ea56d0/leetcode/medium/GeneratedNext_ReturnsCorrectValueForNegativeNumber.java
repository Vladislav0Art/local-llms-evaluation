package leetcode.medium;

public class GeneratedNext_ReturnsCorrectValueForNegativeNumber {

    private OnlineStockSpan onlineStockSpan;

    public void setUp() {
        onlineStockSpan = new OnlineStockSpan();
    }

    @Test
    public void next_ReturnsCorrectValueForNegativeNumber() {
        assertEquals(-1, (int) onlineStockSpan.next(-100));
    }

}