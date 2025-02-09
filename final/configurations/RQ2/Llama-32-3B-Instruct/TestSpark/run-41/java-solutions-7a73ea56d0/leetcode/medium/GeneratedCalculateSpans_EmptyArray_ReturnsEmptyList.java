package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_EmptyArray_ReturnsEmptyList {

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
    public void calculateSpans_EmptyArray_ReturnsEmptyList() {
        List<Integer> result = calculateSpans(new int[0]);

        org.junit.Assert.assertTrue(result.isEmpty());
    }

}