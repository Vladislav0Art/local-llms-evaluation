package leetcode.medium;

public class GeneratedTest_max_line_coverage_given_negative_price {

    @Test
    public void test_max_line_coverage_given_negative_price() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        List<Integer> prices = new ArrayList<>();
        int price = -1;
        int[] expectedSpans = {0};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        compareArrays(expectedSpans, actualSpans);
    }

}