package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_MultipleElementsStack_ReturnsPriceMinusOldWhenCurrentIsLarger {

    @InjectMocks
    private OnlineStockSpan stockSpan;

    @Mock
    private Stack<Integer> stack;

    @Test
    public void next_MultipleElementsStack_ReturnsPriceMinusOldWhenCurrentIsLarger() {
        stack.push(2);
        Mockito.when(stack.isEmpty()).thenReturn(false);
        int price = 5;
        int current = stack.pop();
        stockSpan.next(current);
        stack.push(price);
        Mockito.when(stack.isEmpty()).thenReturn(true);
        int result = stockSpan.next(price);
        assert result == price - current;
    }

}