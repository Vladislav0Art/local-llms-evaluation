package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_LessThanCurrentPrice_ReturnsCountFromTop {

    @Test
    public void next_LessThanCurrentPrice_ReturnsCountFromTop() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {2, 1};
        int result = onlineStockSpan.next(1);
        assertThat(result, is(1));
    }

}