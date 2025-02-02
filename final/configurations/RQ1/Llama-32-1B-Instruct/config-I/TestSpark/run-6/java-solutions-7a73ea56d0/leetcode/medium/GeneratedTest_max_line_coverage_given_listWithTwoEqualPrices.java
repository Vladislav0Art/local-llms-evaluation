package leetcode.medium;

public class GeneratedTest_max_line_coverage_given_listWithTwoEqualPrices {

    @Test
    public void test_max_line_coverage_given_listWithTwoEqualPrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        List<Integer> prices = new ArrayList<>();
        int price1 = 7;
        int price2 = 7;
        onlineStockSpan.list.add(price1);
        onlineStockSpan.list.add(price2);
        int[] expectedSpans = {2, 3};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        compareArrays(expectedSpans, actualSpans);
    }

}