package leetcode.medium;

public class GeneratedNextTest3 {

    private OnlineStockSpan stockSpan;

    @Before
    public void setUp() {
        stockSpan = new OnlineStockSpan();
    }

    @Test
    public void nextTest3() {
        stockSpan.next(5);
        stockSpan.next(4);
        int result = stockSpan.next(3);
        assertEquals(3, result);
    }

}