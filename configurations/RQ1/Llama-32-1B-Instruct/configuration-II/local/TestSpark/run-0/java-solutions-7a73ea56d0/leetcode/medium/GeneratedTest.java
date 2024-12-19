package leetcode.medium;

public class GeneratedTest {

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