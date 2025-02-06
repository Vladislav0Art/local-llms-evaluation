package leetcode.medium;

public class GeneratedNext_ThrowsNullPointerExceptionWhenStackIsEmpty {

    private OnlineStockSpan stockSpan;

    @Before
    public void setUp() {
        stockSpan = new OnlineStockSpan();
    }

    @Test
    public void next_ThrowsNullPointerExceptionWhenStackIsEmpty() {
        stockSpan.next(10);
        stockSpan.next(20);
        NullPointerException expect = null;
        try {
            stockSpan.next(30);
        } catch (NullPointerException e) {
            assertEquals(expect, e);
        }
    }

}