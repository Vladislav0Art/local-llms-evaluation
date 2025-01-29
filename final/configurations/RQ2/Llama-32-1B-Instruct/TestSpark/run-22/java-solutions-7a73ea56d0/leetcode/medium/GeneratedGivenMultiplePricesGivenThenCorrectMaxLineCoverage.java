package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedGivenMultiplePricesGivenThenCorrectMaxLineCoverage {

    private final Stack<OnlineStockSpan> stack = new Stack<>();
    private final List<Integer[]> testPrices = new ArrayList<>();

    @Test
    public void givenMultiplePricesGivenThenCorrectMaxLineCoverage() {
        OnlineStockSpan mockOnlineStockSpan = mock(OnlineStockSpan.class);
        when(mockOnlineStockSpan.next(1)).thenReturn(2);
        when(mockOnlineStockSpan.next(2)).thenReturn(3);
        testPrices.add(new int[]{0, 1});
        testPrices.add(new int[]{2, 1, 3});
        int[] result = stack.calculateSpans(testPrices.toArray(new int[0][]));
        assertEquals(4, result[0]);
    }

}