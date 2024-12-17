package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Stack;
import java.util.List;
import java.util.Collections;

public class GeneratedCalculateSpans_MockitoNext_MockedNextMethodReturnsCorrectResult {

    @Test
    public void calculateSpans_MockitoNext_MockedNextMethodReturnsCorrectResult() {
        OnlineStackSpan onlineStockSpan = Mockito.mock(OnlineStockSpan.class);
        List<Integer> list = new ArrayList<>();
        Mockito.when(onlineStockSpan.list).thenReturn(list);

        int[] prices = {10, 7, 5, 8, 11, 9};
        for (int price : prices) {
            onlineStockSpan.next(price);
        }

        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 3, 4, 6, 7}, result);
    }
}

}