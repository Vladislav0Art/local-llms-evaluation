package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedGivenPriceIncreasingThenLineCoverageIncreases {

    private final Stack<OnlineStockSpan> stack = new Stack<>();
    private final List<Integer[]> testPrices = new ArrayList<>();

    @Test
    public void givenPriceIncreasingThenLineCoverageIncreases() {
        OnlineStockSpan mockOnlineStockSpan = mock(OnlineStockSpan.class);
        when(mockOnlineStockSpan.next(1)).thenReturn(2);
        testPrices.add(new int[]{10});
        testPrices.add(new int[]{9, 8});
        testPrices.add(new int[]{7, 6, 5});
        testPrices.add(new int[]{4, 3, 2, 1});
        int[] result = stack.calculateSpans(testPrices.toArray(new int[0][]));
        assertEquals(15, result[0]);
    }

}