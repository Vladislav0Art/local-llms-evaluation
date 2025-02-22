package leetcode.medium;

public class GeneratedNextTest2 {

    private OnlineStockSpan stockSpan;

    @Before
    public void setUp() {
        stockSpan = new OnlineStockSpan();
    }

    @Test
    public void nextTest2() {
        stockSpan.next(5);
        int result = stockSpan.next(4);
        assertEquals(2, result);
    }

}