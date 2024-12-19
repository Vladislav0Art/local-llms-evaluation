package leetcode.medium;

public class GeneratedTest_maxLineCoverage5 {

    private OnlineStockSpan onlineStockSpan;

    @Test
    public void test_maxLineCoverage5() {
        List<Integer> prices = new ArrayList<>();
        prices.add(20);
        prices.add(15);
        prices.add(18);
        prices.add(25);

        onlineStockSpan = new OnlineStockSpan();
        int[] spans = onlineStockSpan.calculateSpans(prices);

        assertEquals(4, spans[0]);
    }

}