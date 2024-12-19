package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedNext_Div3_PriceIncreasingThenDecreasingReturnsCorrectValue {

    @Test
    public void next_Div3_PriceIncreasingThenDecreasingReturnsCorrectValue() {
        OnlineStockSpan solution = new OnlineStockSpan();
        for (int i = 0; i < 10; i++) {
            int result = solution.next(i);
            assertThat(result, is(1));
        }
    }

}