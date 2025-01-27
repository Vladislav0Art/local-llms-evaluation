package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

public class GeneratedCalculateSpans_MocksNextForAllPrices {

    @Test
    public void calculateSpans_MocksNextForAllPrices() {
        Stack<Integer> nextSpy = Mockito.spy(new Stack<>());
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next = nextSpy;
        int[] prices = {10, 9, 8};
        onlineStockSpan.calculateSpans(prices);
        Mockito.verify(nextSpy).push(10); // correct
        Mockito.verify(nextSpy).push(9); // correct
        Mockito.verify(nextSpy).push(8); // correct
    }

}