package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedNext_Div5_PriceNegativeIncreasingThenPositiveIncreasing {

    @Test
    public void next_Div5_PriceNegativeIncreasingThenPositiveIncreasing() {
        OnlineStockSpan solution = new OnlineStockSpan();
        for (int i = -5; i <= 0; i++) {
            int result = solution.next(i);
            assertThat(result, is(1));
        }
    }

}