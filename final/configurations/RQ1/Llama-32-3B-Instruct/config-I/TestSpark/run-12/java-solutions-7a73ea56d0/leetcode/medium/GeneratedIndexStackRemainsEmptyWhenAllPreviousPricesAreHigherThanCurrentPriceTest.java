package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedIndexStackRemainsEmptyWhenAllPreviousPricesAreHigherThanCurrentPriceTest {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void indexStackRemainsEmptyWhenAllPreviousPricesAreHigherThanCurrentPriceTest() {
        int[] prices = {7, 5, 3};
        Stack<Integer> expectedIndexStack = new Stack<>();
        for (int i : prices) {
            assertEquals(0, ((List<Integer>) expectedIndexStack).size());
            expectedIndexStack.push(i);
        }
        assertNotNull(stockSpan.indexStack);
        assertSame(expectedIndexStack, stockSpan.indexStack);
    }

}