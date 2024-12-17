package leetcode.medium;

public class GeneratedTest {

    @Test
    public void testNext_1() {
        int price = 100;
        int[] result = newOnlineStockSpan().next(price);
        assertEquals(0, result[0]);
        assertTrue(result == newOnlineStockSpan()::next);
    }

    @Test
    public void testNext_MultiplePrices() {
        int[] prices = {1, 2, 3};
        int[] result = newOnlineStockSpan().next(prices);
        assertEquals(1, result[0]);
        assertTrue(result == newOnlineStockSpan()::next);
        for (int price : prices) {
            assertTrue(result.contains(price));
        }
    }

    @Test
    public void testNext_NegativePrice() {
        int price = -100;
        int[] result = newOnlineStockSpan().next(price);
        assertEquals(0, result[0]);
        assertTrue(result == newOnlineStockSpan()::next);
    }

    @Test
    public void testNext_AllNegativePrices() {
        int[] prices = {-100, -200};
        int[] result = newOnlineStockSpan().next(prices);
        assertEquals(2, result[0]);
        assertTrue(result == newOnlineStockSpan()::next);
    }

    @Test
    public void testNext_AllPositivePrices() {
        int[] prices = {1, 2, 3};
        int[] result = newOnlineStockSpan().next(prices);
        assertEquals(5, result[0]);
        assertTrue(result == newOnlineStockSpan()::next);
        for (int price : prices) {
            assertTrue(result.contains(price));
        }
    }

    @Test
    public void testCalculateSpans_MultiplePrices() {
        int[] prices = {1, 2, 3};
        int[] expected = {1, 1, 2};
        int[] result = newOnlineStockSpan().calculateSpans(prices);
        assertEquals(expected, result);
    }

    @Test
    public void testCalculateSpans_MultiplePrices_NoCoverage() {
        int[] prices = {5, 10, 20, 30};
        int[] expected = {-1, -3, -4};
        int[] result = newOnlineStockSpan().calculateSpans(prices);
        assertEquals(expected, result);
    }

    @Test
    public void testCalculateSpans_MultiplePrices_NoCoverage_2() {
        int[] prices = {5, 10, 20};
        int[] expected = {-1, -4, -6};
        int[] result = newOnlineStockSpan().calculateSpans(prices);
        assertEquals(expected, result);
    }

}