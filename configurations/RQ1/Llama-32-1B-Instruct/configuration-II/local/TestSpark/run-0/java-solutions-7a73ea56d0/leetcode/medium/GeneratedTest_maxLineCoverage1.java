package leetcode.medium;

public class GeneratedTest_maxLineCoverage1 {

    private OnlineStockSpan onlineStockSpan;

    @Test
    public void test_maxLineCoverage1() {
        List<Integer> prices = new ArrayList<>();
        prices.add(2);
        prices.add(5);
        prices.add(3);
        prices.add(4);

        onlineStockSpan = new OnlineStockSpan();
        int[] spans = onlineStockSpan.calculateSpans(prices);

        assertEquals(4, spans[0]);
        assertEquals(1, spans[1]);
        assertEquals(2, spans[2]);
    }

}