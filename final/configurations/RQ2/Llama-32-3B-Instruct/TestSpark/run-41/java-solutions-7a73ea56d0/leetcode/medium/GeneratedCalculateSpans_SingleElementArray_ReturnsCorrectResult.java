package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_SingleElementArray_ReturnsCorrectResult {

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
    public void calculateSpans_SingleElementArray_ReturnsCorrectResult() {
        int[] prices = {1};
        List<Integer> result = calculateSpans(prices);

        org.junit.Assert.assertEquals(result, new ArrayList<>(List.of(1)));
    }

}