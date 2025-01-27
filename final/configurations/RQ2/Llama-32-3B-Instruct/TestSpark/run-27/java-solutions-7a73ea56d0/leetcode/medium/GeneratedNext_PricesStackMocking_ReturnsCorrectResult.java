package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_PricesStackMocking_ReturnsCorrectResult {

    @Test
    public void next_PricesStackMocking_ReturnsCorrectResult() {
        OnlineStockSpan underTest = new OnlineStockSpan();
        Stack<Integer> stack = Mockito.mock(Stack.class);
        when(stack.push(anyInt())).thenReturn(1);
        int price = 10;
        underTest.price = stack;
        int result = underTest.next(price);
        assertEquals(1, result);
    }

}