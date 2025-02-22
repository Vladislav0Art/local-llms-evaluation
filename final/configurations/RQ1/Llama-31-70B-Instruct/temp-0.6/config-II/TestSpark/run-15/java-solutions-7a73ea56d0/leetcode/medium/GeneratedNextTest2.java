package leetcode.medium;

public class GeneratedNextTest2 {

    private OnlineStockSpan onlineStockSpan;

    @Before
    public void setUp() {
        onlineStockSpan = new OnlineStockSpan();
    }

    @Test
    public void nextTest2() {
        int price = 10;
        int expected = 1;
        int actual = onlineStockSpan.next(price);
        assertEquals(expected, actual);
    }

}