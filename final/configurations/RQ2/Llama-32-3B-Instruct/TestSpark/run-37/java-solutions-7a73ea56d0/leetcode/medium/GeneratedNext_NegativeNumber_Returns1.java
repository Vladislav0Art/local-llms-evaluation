package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_NegativeNumber_Returns1 {

    @Test
    public void next_NegativeNumber_Returns1() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.next(-1);
        assertThat(result.length, is(1));
        assertThat(result[0], is(1));
    }

}