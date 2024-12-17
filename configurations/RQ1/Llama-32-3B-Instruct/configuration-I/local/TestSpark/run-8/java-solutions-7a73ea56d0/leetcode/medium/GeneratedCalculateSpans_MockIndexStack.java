package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_MockIndexStack {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_MockIndexStack() {
        Stack<Integer> indexStack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        when(indexStack.isEmpty()).thenReturn(false);
        when(indexStack.pop()).thenReturn(0);

        onlineStockSpan.list = list;
        onlineStockSpan.indexStack = indexStack;

        int[] result = onlineStockSpan.calculateSpans(new int[]{50, 60});

        assertArrayEquals(new int[]{1, 2}, result);
    }

}