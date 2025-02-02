package leetcode.medium;

public class GeneratedTest_max_line_coverage_given_listWithDifferentPrices {

    @Test
    public void test_max_line_coverage_given_listWithDifferentPrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        List<Integer> prices = new ArrayList<>();
        int price1 = 7;
        int price2 = 6;
        onlineStockSpan.list.add(price1);
        onlineStockSpan.list.add(price2);
        int[] expectedSpans = {3, 4};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        compareArrays(expectedSpans, actualSpans);
    }

    private void compareArrays(int[] expected, int[] actual) {
        if (expected.length != actual.length) {
            throw new AssertionError("Expected array length mismatch");
        }
        for (int i = 0; i < expected.length; i++) {
            assertEq(expected[i], actual[i]);
        }
    }

    private void assertEq(int expected, int actual) {
        if (expected != actual) {
            throw new AssertionError("Arrays do not match at index " + expected + ", got " + actual);
        }
    }

}