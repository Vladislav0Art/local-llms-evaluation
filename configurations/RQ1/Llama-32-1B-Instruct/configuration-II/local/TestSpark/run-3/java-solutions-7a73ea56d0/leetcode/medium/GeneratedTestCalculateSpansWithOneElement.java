package leetcode.medium;

public class GeneratedTestCalculateSpansWithOneElement {

    @Test
    public void testCalculateSpansWithOneElement() {
        OnlineStockSpan sut = new OnlineStockSpan();
        int[] prices = {10};
        int expected = 0;
        int[] actual = sut.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

}