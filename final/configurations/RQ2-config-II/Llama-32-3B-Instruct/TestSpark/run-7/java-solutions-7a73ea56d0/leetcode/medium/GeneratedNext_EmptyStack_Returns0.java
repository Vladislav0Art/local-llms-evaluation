package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_EmptyStack_Returns0 {

    @InjectMocks
    private OnlineStockSpan stockSpan;

    @Mock
    private Stack<Integer> stack;

    @Test
    public void next_EmptyStack_Returns0() {
        Mockito.when(stack.isEmpty()).thenReturn(true);
        int result = stockSpan.next(5);
        assert result == 0;
    }

}