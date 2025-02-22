package leetcode.medium;

public class GeneratedNextTest {

    private OnlineStockSpan onlineStockSpan;

    @Before
    public void setUp() {
        onlineStockSpan = new OnlineStockSpan();
    }

    @Test
    public void nextTest() {
        int price = 5;
        int expected = 1;
        int actual = onlineStockSpan.next(price);
        assertEquals(expected, actual);
    }

}