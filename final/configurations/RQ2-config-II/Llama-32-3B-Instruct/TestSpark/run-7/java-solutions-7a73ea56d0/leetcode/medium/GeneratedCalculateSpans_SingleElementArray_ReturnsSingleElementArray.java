package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_SingleElementArray_ReturnsSingleElementArray {

    @InjectMocks
    private OnlineStockSpan stockSpan;

    @Mock
    private Stack<Integer> stack;

    @Test
    public void calculateSpans_SingleElementArray_ReturnsSingleElementArray() {
        int[] prices = {1};
        int[] result = stockSpan.calculateSpans(prices);
        assert Arrays.equals(result, new int[]{2});
    }

}