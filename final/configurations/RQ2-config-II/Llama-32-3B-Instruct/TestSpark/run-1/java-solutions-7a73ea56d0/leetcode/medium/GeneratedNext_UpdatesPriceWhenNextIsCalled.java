package leetcode.medium;

public class GeneratedNext_UpdatesPriceWhenNextIsCalled {

    private OnlineStockSpan stockSpan;

    @Before
    public void setUp() {
        stockSpan = new OnlineStockSpan();
    }

    @Test
    public void next_UpdatesPriceWhenNextIsCalled() {
        stockSpan.next(price);
        int expected = price;
        assertEquals(expected, stockSpan.next(price));
    }

}