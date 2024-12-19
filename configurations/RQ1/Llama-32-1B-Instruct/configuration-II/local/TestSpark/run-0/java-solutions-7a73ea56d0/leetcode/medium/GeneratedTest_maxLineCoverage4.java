package leetcode.medium;

public class GeneratedTest_maxLineCoverage4 {

    private OnlineStockSpan onlineStockSpan;

    @Test
    public void test_maxLineCoverage4() {
        List<Integer> prices = new ArrayList<>();
        prices.add(7);
        prices.add(8);
        prices.add(10);
        prices.add(15);

        onlineStockSpan = new OnlineStockSpan();
        int[] spans = onlineStockSpan.calculateSpans(prices);

        assertEquals(3, spans[0]);
    }

}