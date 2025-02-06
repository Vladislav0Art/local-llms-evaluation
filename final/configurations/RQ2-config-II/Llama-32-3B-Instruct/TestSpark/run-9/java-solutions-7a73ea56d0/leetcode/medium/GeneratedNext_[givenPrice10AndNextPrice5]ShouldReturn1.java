package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class GeneratedNext_[givenPrice10AndNextPrice5]

ShouldReturn1 {

    @Test
    public void next_[ givenPrice10AndNextPrice5]ShouldReturn1() {
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(10);
        int result = solution.next(5);
        assertThat(result, is(1));
    }

}