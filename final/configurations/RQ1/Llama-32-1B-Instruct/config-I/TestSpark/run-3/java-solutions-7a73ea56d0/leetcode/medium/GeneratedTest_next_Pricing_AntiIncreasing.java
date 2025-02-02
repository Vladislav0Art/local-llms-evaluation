package leetcode.medium;

public class GeneratedTest_next_Pricing_AntiIncreasing {

    @Test
    public void test_next_Pricing_AntiIncreasing() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {1, 2, 3};
        int expected = 2;
        onlineStockSpan.next(1);
        onlineStockSpan.next(2);
        onlineStockSpan.next(3);
        assertEquals(expected, onlineStockSpan.next(prices));
    }

}