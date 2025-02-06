package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_ThrowsExceptionWhenPricesIsNegative {

    @Mock
    private Stack<Integer> stack;

    public int[] calculateSpans(int[] prices) {
        return new OnlineStockSpan().calculateSpans(prices);
    }

    @Test
    public void calculateSpans_ThrowsExceptionWhenPricesIsNegative() {
        int[] prices = {-10, -7, -5, -8, -11, -9};
        assertThrows(NullPointerException.class, () -> new OnlineStockSpan().calculateSpans(prices));
    }

}