package leetcode.medium;

public class GeneratedTest_next_HighPrice {

    @Test
    public void test_next_HighPrice() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {10, 22, 9, 2, 3};
        int expected = 4;
        int actual = instance.next(prices[0]);
        assert actual == expected;
    }

}