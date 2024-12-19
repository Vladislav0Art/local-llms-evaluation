package leetcode.medium;

public class GeneratedTest {

    @Test
    public void test_next_BigPrice() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {1, 2, 3};
        int expected = 1;
        int actual = instance.next(prices[0]);
        assert actual == expected;
    }

    @Test
    public void test_next_SmallPrice() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {3, 2, 1};
        int expected = 4;
        int actual = instance.next(prices[0]);
        assert actual == expected;
    }

    @Test
    public void test_next_MidPrice() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {10, 22, 9};
        int expected = 3;
        int actual = instance.next(prices[0]);
        assert actual == expected;
    }

    @Test
    public void test_next_LowPrice() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {10, 22, 9, 2};
        int expected = 5;
        int actual = instance.next(prices[0]);
        assert actual == expected;
    }

    @Test
    public void test_next_HighPrice() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {10, 22, 9, 2, 3};
        int expected = 4;
        int actual = instance.next(prices[0]);
        assert actual == expected;
    }

    @Test
    public void test_calculateSpans_BigPrices() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {100, 200, 300};
        int[] expected = {1, 2, 3};
        int[] actual = instance.calculateSpans(prices);
        assert java.util.Arrays.equals(actual, expected);
    }

    @Test
    public void test_calculateSpans_SmallPrices() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {10, 22, 9};
        int[] expected = {3, 2, 1};
        int[] actual = instance.calculateSpans(prices);
        assert java.util.Arrays.equals(actual, expected);
    }

    @Test
    public void test_calculateSpans_MidPrices() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {10, 22, 9, 2};
        int[] expected = {3, 1, 0};
        int[] actual = instance.calculateSpans(prices);
        assert java.util.Arrays.equals(actual, expected);
    }

    @Test
    public void test_calculateSpans_LowPrices() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {10, 22, 9, 2, 3};
        int[] expected = {5, 4, 3, 2, 1};
        int[] actual = instance.calculateSpans(prices);
        assert java.util.Arrays.equals(actual, expected);
    }

    @Test
    public void test_calculateSpans_HighPrices() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {100, 200, 300};
        int[] expected = {4, 3, 2};
        int[] actual = instance.calculateSpans(prices);
        assert java.util.Arrays.equals(actual, expected);
    }

}