package leetcode.medium;

public class GeneratedTest {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void testNext() {
        int price = 10;
        assertEquals(1, stockSpan.next(price));
    }

    @Test
    public void testNext_GreaterThanPreviousPrice() {
        int[] prices = {3, 5, 8};
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                stockSpan.next(prices[i + 1]);
            }
        }
        assertEquals(2, stockSpan.next(prices[0]));
    }

    @Test
    public void testNext_NoPreviousPrices() {
        int price = 7;
        stockSpan.reset();
        assertEquals(1, stockSpan.next(price));
    }

    @Test
    public void testCalculateSpans_PositiveIntegers() {
        int[] prices = {100, 80, 75, 70, 60, 70};
        for (int price : prices) {
            stockSpan.reset();
            assertEquals(1, stockSpan.next(price));
        }
        int[] expected = new int[prices.length];
        for (int i = 0; i < prices.length - 1; i++) {
            stockSpan.next(prices[i]);
            if (i + 1 < prices.length) {
                stockSpan.next(prices[i + 1]);
            } else {
                stockSpan.next(0);
            }
        }
        assertEquals(expected, stockSpan.calculateSpans());
    }

    @Test
    public void testCalculateSpans_NegativeIntegers() {
        int[] prices = {-100, -80, -75, -70, -60, -70};
        for (int price : prices) {
            stockSpan.reset();
            assertEquals(1, stockSpan.next(price));
        }
        int[] expected = new int[prices.length];
        for (int i = 0; i < prices.length - 1; i++) {
            stockSpan.next(prices[i]);
            if (i + 1 < prices.length) {
                stockSpan.next(prices[i + 1]);
            } else {
                stockSpan.next(0);
            }
        }
        assertEquals(expected, stockSpan.calculateSpans());
    }

    @Test
    public void testCalculateSpans_MixedIntegers() {
        int[] prices = {-100, -80, 75, 70, 60, 70};
        for (int price : prices) {
            stockSpan.reset();
            assertEquals(1, stockSpan.next(price));
        }
        int[] expected = new int[prices.length];
        for (int i = 0; i < prices.length - 1; i++) {
            stockSpan.next(prices[i]);
            if (i + 1 < prices.length) {
                stockSpan.next(prices[i + 1]);
            } else {
                stockSpan.next(0);
            }
        }
        assertEquals(expected, stockSpan.calculateSpans());
    }

    @Test
    public void testReset() {
        int price = 10;
        stockSpan.reset();
        assertEquals(1, stockSpan.next(price));
    }

    @Test
    public void testNext_EmptyList() {
        stockSpan.reset();
        assertEquals(0, stockSpan.next(null));
    }

}