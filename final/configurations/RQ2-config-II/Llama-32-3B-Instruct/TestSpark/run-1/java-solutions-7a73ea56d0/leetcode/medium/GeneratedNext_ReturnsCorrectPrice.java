package leetcode.medium;

public class GeneratedNext_ReturnsCorrectPrice {

    private OnlineStockSpan stockSpan;

    @Before
    public void setUp() {
        stockSpan = new OnlineStockSpan();
    }

    @Test
    public void next_ReturnsCorrectPrice() {
        int price = 10;
        int expected = 1;
        assertEquals(expected, stockSpan.next(price));
    }

}