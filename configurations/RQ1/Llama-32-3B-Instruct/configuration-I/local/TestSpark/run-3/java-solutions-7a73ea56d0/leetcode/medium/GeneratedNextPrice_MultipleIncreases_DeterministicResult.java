package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNextPrice_MultipleIncreases_DeterministicResult {

    @Test
    public void nextPrice_MultipleIncreases_DeterministicResult() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        for (int i = 0; i < 10; i++) {
            int price = 100 + i;
            onlineStockSpan.next(price);
        }
        List<Integer> list = onlineStockSpan.list;
        List<Integer> expectedList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertThat(list, is(expectedList));
    }

}