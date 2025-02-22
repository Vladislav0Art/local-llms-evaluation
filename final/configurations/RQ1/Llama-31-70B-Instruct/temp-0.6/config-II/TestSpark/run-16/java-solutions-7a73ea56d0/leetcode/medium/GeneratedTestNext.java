package leetcode.medium;

public class GeneratedTestNext {

    private OnlineStockSpan onlineStockSpan;

    @Before
    public void setUp() {
        onlineStockSpan = new OnlineStockSpan();
    }

    @Test
    public void testNext() {
        int price = 100;
        assertEquals(1, onlineStockSpan.next(price));
    }

}