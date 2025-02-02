package leetcode.medium;

public class GeneratedTest_next_Pricing_Increasing {

    @Test
    public void test_next_Pricing_Increasing() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {1, 3};
        int expected = 2;
        onlineStockSpan.next(2);
        assertEquals(expected, onlineStockSpan.next(prices));
    }

}