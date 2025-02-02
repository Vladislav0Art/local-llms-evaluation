package leetcode.medium;

public class GeneratedTest_max_line_coverage_given_single_element_list {

    @Test
    public void test_max_line_coverage_given_single_element_list() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        List<Integer> prices = new ArrayList<>();
        int[] expectedSpans = {1};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        compareArrays(expectedSpans, actualSpans);
    }

}