package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_SingleElementStack_ReturnsPricePlusOne {

    @InjectMocks
    private OnlineStockSpan stockSpan;

    @Mock
    private Stack<Integer> stack;

    @Test
    public void next_SingleElementStack_ReturnsPricePlusOne() {
        stack.push(1);
        Mockito.when(stack.isEmpty()).thenReturn(false);
        int price = 5;
        int result = stockSpan.next(price);
        assert result == price + 1;
    }

}