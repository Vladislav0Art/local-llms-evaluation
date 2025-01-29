package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedGivenPrice1_thenTwoSpans {

    private final Stack<OnlineStockSpan> stack = new Stack<>();
    private final List<Integer[]> testPrices = new ArrayList<>();

    @Test
    public void givenPrice1_thenTwoSpans() {
        OnlineStockSpan mockOnlineStockSpan = mock(OnlineStockSpan.class);
        when(mockOnlineStockSpan.next(1)).thenReturn(2);
        testPrices.add(new int[]{1});
        testPrices.add(new int[]{0});
        int[] result = stack.calculateSpans(testPrices.toArray(new int[0][]));
        assertEquals(3, result[0]);
    }

}