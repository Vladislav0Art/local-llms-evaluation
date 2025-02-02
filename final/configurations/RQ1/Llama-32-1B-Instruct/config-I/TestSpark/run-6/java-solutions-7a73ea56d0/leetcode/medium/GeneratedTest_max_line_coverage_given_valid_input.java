package leetcode.medium;

public class GeneratedTest_max_line_coverage_given_valid_input {

    @Test
    public void test_max_line_coverage_given_valid_input() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {7, 6, 4, 3, 1};
        int[] expectedSpans = {1, 2, 1, 2, 1};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        compareArrays(expectedSpans, actualSpans);
    }

}