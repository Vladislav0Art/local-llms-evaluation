package leetcode.medium;

public class GeneratedTest_maxLineCoverage2 {

    private OnlineStockSpan onlineStockSpan;

    @Test
    public void test_maxLineCoverage2() {
        List<Integer> prices = new ArrayList<>();
        prices.add(5);
        prices.add(3);
        prices.add(4);
        prices.add(7);

        onlineStockSpan = new OnlineStockSpan();
        int[] spans = onlineStockSpan.calculateSpans(prices);

        assertEquals(5, spans[0]);
    }

}