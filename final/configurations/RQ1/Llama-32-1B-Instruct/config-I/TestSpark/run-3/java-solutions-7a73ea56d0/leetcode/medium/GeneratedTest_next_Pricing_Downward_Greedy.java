package leetcode.medium;

public class GeneratedTest_next_Pricing_Downward_Greedy {

    @Test
    public void test_next_Pricing_Downward_Greedy() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {1, 4};
        int expected = 2;
        onlineStockSpan.next(3);
        assertEquals(expected, onlineStockSpan.next(prices));
    }

}