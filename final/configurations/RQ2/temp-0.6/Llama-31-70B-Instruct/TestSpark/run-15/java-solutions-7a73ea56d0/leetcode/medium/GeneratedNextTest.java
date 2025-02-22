package leetcode.medium;

public class GeneratedNextTest {

    private OnlineStockSpan onlineStockSpan;

    @Before
    public void setup() {
        onlineStockSpan = new OnlineStockSpan();
    }

    @Test
    public void nextTest() {
        int price = 10;
        int expected = 1;
        int actual = onlineStockSpan.next(price);
        assertEquals(expected, actual);
    }

}