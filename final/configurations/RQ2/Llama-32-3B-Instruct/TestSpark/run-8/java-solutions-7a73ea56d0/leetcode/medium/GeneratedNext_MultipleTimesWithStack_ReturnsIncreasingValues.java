package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_MultipleTimesWithStack_ReturnsIncreasingValues {

    public List<Integer> calculateSpans() {
        return new ArrayList<>();
    }

    @Mock
    private Stack<Integer> stack;

    @Test
    public void next_MultipleTimesWithStack_ReturnsIncreasingValues() throws Exception {
        stack.add(-5);
        stack.add(3);
        stack.add(1);
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        for (int i : stack) {
            int temp = stockSpan.next(i);
            //do nothing
        }
        assertEquals(2, stockSpan.next(-5));
        assertEquals(3, stockSpan.next(3));
        assertEquals(1, stockSpan.next(1));
    }

}