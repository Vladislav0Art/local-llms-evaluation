package leetcode.medium;

public class GeneratedTest_max_line_coverage_given_zero_prices {

    @Test
    public void test_max_line_coverage_given_zero_prices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        List<Integer> prices = new ArrayList<>();
        int price1 = 0;
        int price2 = 0;
        onlineStockSpan.list.add(price1);
        onlineStockSpan.list.add(price2);
        int[] expectedSpans = {1, 1};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        compareArrays(expectedSpans, actualSpans);
    }

}