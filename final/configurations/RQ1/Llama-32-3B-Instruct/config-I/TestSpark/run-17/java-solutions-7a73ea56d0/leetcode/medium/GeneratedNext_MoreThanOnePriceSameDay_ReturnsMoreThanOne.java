package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_MoreThanOnePriceSameDay_ReturnsMoreThanOne {

    @Test
    public void next_MoreThanOnePriceSameDay_ReturnsMoreThanOne() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {1, 1};
        int result = onlineStockSpan.next(2);
        assertThat(result, is(2));
    }

}