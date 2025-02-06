package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_EmptyArray_ReturnsEmptyArray {

    @InjectMocks
    private OnlineStockSpan stockSpan;

    @Mock
    private Stack<Integer> stack;

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        int[] result = stockSpan.calculateSpans(new int[0]);
        assert result == new int[0];
    }

}