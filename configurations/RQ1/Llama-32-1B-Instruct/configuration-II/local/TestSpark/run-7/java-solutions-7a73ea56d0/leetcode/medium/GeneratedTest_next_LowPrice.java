package leetcode.medium;

public class GeneratedTest_next_LowPrice {

    @Test
    public void test_next_LowPrice() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {10, 22, 9, 2};
        int expected = 5;
        int actual = instance.next(prices[0]);
        assert actual == expected;
    }

}