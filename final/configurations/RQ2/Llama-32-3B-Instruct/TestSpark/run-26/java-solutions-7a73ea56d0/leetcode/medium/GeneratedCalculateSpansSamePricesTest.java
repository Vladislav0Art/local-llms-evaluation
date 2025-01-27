package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.mockito.Mockito;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpansSamePricesTest {

    private Stack<Integer> stack = new java.util.Stack<>();

    public void initializeStack() {
        Mockito.when(stack.isEmpty()).thenReturn(true);
    }

    public void setupStackWithOneElement() {
        stack.push(1);
    }

    @Test
    public void calculateSpansSamePricesTest() {
        setupStackWithOneElement();
        int price = 100;
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[]{price, price});
        assertEquals(new int[]{1}, result);
    }

}