package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_TwoElementArray_ReturnsTwoElementArray {

    @InjectMocks
    private OnlineStockSpan stockSpan;

    @Mock
    private Stack<Integer> stack;

    @Test
    public void calculateSpans_TwoElementArray_ReturnsTwoElementArray() {
        int[] prices = {1, 2};
        int[] result = stockSpan.calculateSpans(prices);
        assert Arrays.equals(result, new int[]{3, 1});
    }

}