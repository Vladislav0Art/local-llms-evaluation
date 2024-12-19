package leetcode.medium;

public class GeneratedNext_ReturnsCorrectValueWhenNull {

    private OnlineStockSpan onlineStockSpan;

    public void setUp() {
        onlineStockSpan = new OnlineStockSpan();
    }

    @Test
    public void next_ReturnsCorrectValueWhenNull() {
        assertEquals(0, (int) onlineStockSpan.next(null));
    }

}