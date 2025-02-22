package leetcode.medium;

public class GeneratedNextTest1 {

    private OnlineStockSpan stockSpan;

    @Before
    public void setUp() {
        stockSpan = new OnlineStockSpan();
    }

    @Test
    public void nextTest1() {
        int result = stockSpan.next(5);
        assertEquals(1, result);
    }

}