package leetcode.medium;

public class GeneratedNext_ReturnsCorrectValueWhenPriceIsZero {

    private OnlineStockSpan onlineStockSpan;

    public void setUp() {
        onlineStockSpan = new OnlineStockSpan();
    }

    @Test
    public void next_ReturnsCorrectValueWhenPriceIsZero() {
        assertEquals(0, (int) onlineStockSpan.next(0));
    }
}

public class OnlineStockSpan {

    private int price;

    public void update(int p) {
        this.price = p;
    }

    public int next() {
        if (price == null) return 0;
        return price == -1 ? 0 : price;
    }

}