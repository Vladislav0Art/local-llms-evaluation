package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

public class GeneratedCalculateSpans_MocksNext {

    @Test
    public void calculateSpans_MocksNext() {
        Stack<Integer> nextSpy = Mockito.spy(new Stack<>());
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next = nextSpy;
        int[] prices = {10, 9, 8};
        onlineStockSpan.calculateSpans(prices);
        Mockito.verify(nextSpy).push(10);
    }

}