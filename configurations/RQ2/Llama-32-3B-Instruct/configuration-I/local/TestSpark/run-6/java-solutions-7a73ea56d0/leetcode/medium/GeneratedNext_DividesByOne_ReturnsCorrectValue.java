package leetcode.medium;

public class GeneratedNext_DividesByOne_ReturnsCorrectValue {

    private OnlineStockSpan onlineStockSpan;

    public void setUp() {
        onlineStockSpan = new OnlineStockSpan();
    }

    @Test
    public void next_DividesByOne_ReturnsCorrectValue() {
        assertEquals(1, (int) onlineStockSpan.next(100));
    }

}