package leetcode.medium;

public class GeneratedTest_next_SmallPrice {

    @Test
    public void test_next_SmallPrice() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {3, 2, 1};
        int expected = 4;
        int actual = instance.next(prices[0]);
        assert actual == expected;
    }

}