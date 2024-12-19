package leetcode.medium;

public class GeneratedTestCalculateSpans {

    @Test
    public void testCalculateSpans() {
        OnlineStockSpan sut = new OnlineStockSpan();
        int[] prices = {10, 5};
        int expected = new int[]{2, 1};
        int[] actual = sut.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

}