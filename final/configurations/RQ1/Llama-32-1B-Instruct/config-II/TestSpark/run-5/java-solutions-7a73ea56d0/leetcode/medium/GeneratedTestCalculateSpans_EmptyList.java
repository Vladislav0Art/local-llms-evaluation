package leetcode.medium;

public class GeneratedTestCalculateSpans_EmptyList {

    @Test
    public void testCalculateSpans_EmptyList() {
        OnlineStockSpan test = new OnlineStockSpan();
        int[] prices = {};
        try {
            test.calculateSpans(prices);
            fail("Expected an exception to be thrown");
        } catch (Exception e) {
            // expected
        }
    }

}