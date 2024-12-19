package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_0 {

    @Test
    public void next_0() {
        OnlineStockSpan test = new OnlineStockSpan();
        int result = test.next(0);
        assertEquals(-1, result);

        List<Integer> prices = new ArrayList<>();
        prices.add(10);
        prices.add(20);
        prices.add(30);
        prices.add(40);
        prices.add(50);

        int[] result2 = test.calculateSpans(prices);
        assertArrayEquals(new int[]{}, result2);
    }

}