package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(tests.junit4.JUnit4Runner.class)
public class GeneratedTestCalculateSpansWhenPriceIsNegative {

    @Mock
    private Stack<Integer> stack;

    @InjectMocks
    private OnlineStockSpan underTest;

    public void setup() {
        MockitoAnnotations.initMocks(this);
        underTest.price = new int[]{1, 2, 0, -1};
        underTest.next = new int[]{0, 1, 1, 0};
    }

    @Test
    public void testCalculateSpansWhenPriceIsNegative() {
        Stack<Integer> resultStack = Mockito.mock(Stack.class);
        when(stack.isEmpty()).thenReturn(true);
        when(stack.push(anyInt())).thenReturn(null);

        List<Integer> result = underTest.calculateSpans(new int[]{-1, -2});
        assertThat(result.get(0), is(-2));
    }

}