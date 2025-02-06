package leetcode.medium;

public class GeneratedNext_ReturnsCorrectPriceForMultipleCalls {

    private OnlineStockSpan stockSpan;

    @Before
    public void setUp() {
        stockSpan = new OnlineStockSpan();
    }

    @Test
    public void next_ReturnsCorrectPriceForMultipleCalls() {
        int price1 = 10;
        int price2 = 20;
        int expected = new int[]{1, 2};
        assertArrayEquals(expected, new int[]{stockSpan.next(price1), stockSpan.next(price2)});
    }

}