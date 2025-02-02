package leetcode.medium;

public class GeneratedTest_max_line_coverage_given_zero_price {

    @Test
    public void test_max_line_coverage_given_zero_price() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        List<Integer> prices = new ArrayList<>();
        int price = 0;
        int[] expectedSpans = {1};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        compareArrays(expectedSpans, actualSpans);
    }

}