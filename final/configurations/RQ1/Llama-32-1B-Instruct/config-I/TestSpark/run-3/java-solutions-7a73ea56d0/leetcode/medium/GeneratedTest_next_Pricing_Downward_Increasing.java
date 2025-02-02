package leetcode.medium;

public class GeneratedTest_next_Pricing_Downward_Increasing {

    @Test
    public void test_next_Pricing_Downward_Increasing() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {1, 4};
        int expected = 3;
        onlineStockSpan.next(2);
        onlineStockSpan.next(3);
        assertEquals(expected, onlineStockSpan.next(prices));
    }

}