package leetcode.medium;

public class GeneratedTest {

    @Test
    public void next_GivenPrice_ReturnsCorrectSpan() {
        // Given
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = 100;

        // When
        int span = onlineStockSpan.next(price);

        // Then
        assertEquals(1, span);
    }

    @Test
    public void next_GivenPrices_ReturnsCorrectSpans() {
        // Given
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 60};

        // When
        for (int i = 0; i < prices.length; i++) {
            onlineStockSpan.next(prices[i]);
        }
        int[] spans = onlineStockSpan.calculateSpans(prices);

        // Then
        assertEquals(1, spans[0]);
        assertEquals(2, spans[1]);
        assertEquals(3, spans[2]);
        assertEquals(4, spans[3]);
    }

    @Test
    public void next_GivenIncreasingPrices_ReturnsCorrectSpan() {
        // Given
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 110, 120};

        // When
        for (int i = 0; i < prices.length; i++) {
            onlineStockSpan.next(prices[i]);
        }
        int[] spans = onlineStockSpan.calculateSpans(prices);

        // Then
        assertEquals(1, spans[0]);
        assertEquals(2, spans[1]);
        assertEquals(3, spans[2]);
    }

    @Test
    public void next_GivenDecreasingPrices_ReturnsCorrectSpan() {
        // Given
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 60};

        // When
        for (int i = 0; i < prices.length; i++) {
            onlineStockSpan.next(prices[i]);
        }
        int[] spans = onlineStockSpan.calculateSpans(prices);

        // Then
        assertEquals(1, spans[0]);
        assertEquals(2, spans[1]);
        assertEquals(3, spans[2]);
    }

    @Test
    public void next_GivenEqualPrices_ReturnsCorrectSpans() {
        // Given
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 100, 100};

        // When
        for (int i = 0; i < prices.length; i++) {
            onlineStockSpan.next(prices[i]);
        }
        int[] spans = onlineStockSpan.calculateSpans(prices);

        // Then
        assertEquals(1, spans[0]);
        assertEquals(2, spans[1]);
        assertEquals(3, spans[2]);
    }

    @Test
    public void calculateSpans_GivenPrices_ReturnsCorrectSpans() {
        // Given
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 60};

        // When
        for (int i = 0; i < prices.length; i++) {
            onlineStockSpan.next(prices[i]);
        }
        int[] spans = onlineStockSpan.calculateSpans(prices);

        // Then
        assertEquals(1, spans[0]);
        assertEquals(2, spans[1]);
        assertEquals(3, spans[2]);
        assertEquals(4, spans[3]);
    }

    @Test
    public void calculateSpans_GivenMultipleSetsOfPrices_ReturnsCorrectSpans() {
        // Given
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices1 = {100, 80, 75, 60};
        int[] prices2 = {110, 120, 130, 140};

        // When
        for (int i = 0; i < prices1.length; i++) {
            onlineStockSpan.next(prices1[i]);
        }
        for (int i = 0; i < prices2.length; i++) {
            onlineStockSpan.next(prices2[i]);
        }
        int[] spans = onlineStockSpan.calculateSpans(new int[]{});

        // Then
        assertTrue(spans == null);
    }

    @Test
    public void calculateSpans_GivenPricesWithEmptyArray_ReturnsCorrectSpans() {
        // Given
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {};

        // When
        for (int i = 0; i < prices.length; i++) {
            onlineStockSpan.next(prices[i]);
        }
        int[] spans = onlineStockSpan.calculateSpans(prices);

        // Then
        assertTrue(spans == null);
    }

}