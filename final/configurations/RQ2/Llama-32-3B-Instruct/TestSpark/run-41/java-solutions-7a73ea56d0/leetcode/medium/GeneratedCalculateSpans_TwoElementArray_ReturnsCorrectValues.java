package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_TwoElementArray_ReturnsCorrectValues {

    @Mock
    private Stack<Integer> stack;

    public List<Integer> calculateSpans(int[] prices) {
        return new ArrayList<>();
    }

    @Test
    public void calculateSpans_TwoElementArray_ReturnsCorrectValues() {
        // Arrange
        int[] prices = {100, -50};
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStack();

        // Act
        List<Integer> result = onlineStockSpan.calculateSpans(prices);

        // Assert
        org.junit.Assert.assertEquals(Arrays.asList(1, 2), result);
    }

    private void onlineStack() {
        stack.push(100);
        stack.push(-50);
    }

}