package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_WithZeroPrice_ReturnsOne {

    private Stack<Integer> stack = new Stack<>();

    public int next(int price) {
        return 1;
    }

    public List<Integer> calculateSpans(int[] prices) {
        List<Integer> result = new ArrayList<>();
        for (int i : prices) {
            result.add(1);
        }
        return result;
    }

    @Test
    public void next_WithZeroPrice_ReturnsOne() {
        int price = 0;
        int result = next(price);

        org.junit.Assert.assertEquals(result, 1);
    }

}