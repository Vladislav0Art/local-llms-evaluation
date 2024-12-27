package leetcode.medium;

public class GeneratedTest {

    @Test
    public void newInstance_ReturnsInstance() {
        OnlineStockSpan instance = new OnlineStockSpan();
        assertNotNull(instance);
    }

    @Test
    public void next_BasicCase_ReturnsOne() {
        OnlineStockSpan instance = new OnlineStockSpan();
        assertEquals(1, instance.next(100));
    }

    @Test
    public void next_SamePrice_ReturnsOne() {
        OnlineStockSpan instance = new OnlineStockSpan();
        assertEquals(1, instance.next(100));
    }

    @Test
    public void next_DifferentPrices_ReturnsCorrectSpans() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] result = {2, 4, 3};
        for (int i = 0; i < result.length - 1; i++) {
            assertEquals(result[i + 1] - result[i], instance.next(i));
        }
    }

    @Test
    public void next_SamePrices_DifferentLengths_ReturnsCorrectSpans() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 125};
        int[] result = {3, 2, 1, 4};
        for (int i = 0; i < result.length - 1; i++) {
            assertEquals(result[i + 1] - result[i], instance.next(i));
        }
    }

    @Test
    public void calculateSpans_IndividualPrices_ReturnsCorrectSpans() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 125};
        int[] result = {2, 1, 1, 4};
        assertArrayEquals(result, instance.calculateSpans(prices));
    }

    @Test
    public void calculateSpans_EmptyPricesArray_ReturnsEmptyArray() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {};
        int[] result = {};
        assertArrayEquals(result, instance.calculateSpans(prices));
    }

}