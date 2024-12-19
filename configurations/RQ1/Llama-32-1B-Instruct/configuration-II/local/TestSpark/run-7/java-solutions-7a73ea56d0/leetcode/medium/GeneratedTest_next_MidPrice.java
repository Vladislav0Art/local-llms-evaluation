package leetcode.medium;

public class GeneratedTest_next_MidPrice {

    @Test
    public void test_next_MidPrice() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {10, 22, 9};
        int expected = 3;
        int actual = instance.next(prices[0]);
        assert actual == expected;
    }

}