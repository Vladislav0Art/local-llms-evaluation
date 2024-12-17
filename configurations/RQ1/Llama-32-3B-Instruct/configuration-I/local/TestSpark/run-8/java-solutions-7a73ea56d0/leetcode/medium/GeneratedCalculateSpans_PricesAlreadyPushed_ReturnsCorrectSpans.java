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
public class GeneratedCalculateSpans_PricesAlreadyPushed_ReturnsCorrectSpans {

    @Mock
    private Stack<Integer> indexStack;

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_PricesAlreadyPushed_ReturnsCorrectSpans() {
        Stack<Integer> indexStack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        indexStack.push(0);
        list.add(50);

        onlineStockSpan.list = list;

        int[] result = onlineStockSpan.calculateSpans(new int[]{60});

        assertEquals(2, result[1]);
    }

}