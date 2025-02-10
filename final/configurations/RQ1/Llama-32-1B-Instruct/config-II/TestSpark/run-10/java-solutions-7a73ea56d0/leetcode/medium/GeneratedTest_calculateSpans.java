package leetcode.medium;

public class GeneratedTest_calculateSpans {

    @Test
    public void test_calculateSpans() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {7, 6, 5, 4, 3, 2};
        int[] expectedSpans = {1, 1, 2, 1, 1, 1};
        int[] actualSpans = instance.calculateSpans(prices);
        assert arraysEqual(expectedSpans, actualSpans);
    }

    private void assertArraysEqual(int[] expected, int[] actual) {
        for (int i = 0; i < expected.length; i++) {
            if (expected[i] != actual[i])
                throw new RuntimeException("Expected array element at index " + i + ": expected '" + expected[i] + "', got '" + actual[i] + "'");
        }
    }

}