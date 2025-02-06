package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class GeneratedNext_[givenPrice10AndNextPrice20]

ShouldReturn2 {

    @Test
    public void next_[ givenPrice10AndNextPrice20]ShouldReturn2() {
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(10);
        int result = solution.next(20);
        assertThat(result, is(2));
    }

}