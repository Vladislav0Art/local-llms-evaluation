package leetcode.medium;

public class GeneratedTest_maxLineCoverage3 {

    private OnlineStockSpan onlineStockSpan;

    @Test
    public void test_maxLineCoverage3() {
        List<Integer> prices = new ArrayList<>();
        prices.add(4);
        prices.add(9);
        prices.add(2);
        prices.add(6);

        onlineStockSpan = new OnlineStockSpan();
        int[] spans = onlineStockSpan.calculateSpans(prices);

        assertEquals(5, spans[0]);
    }

}