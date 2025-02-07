package leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTest_next {

    public List<Integer> next(int price) {
        return next(price, 0);
    }

    @Test
    public void test_next() {
        int[] prices = {1, 2};
        System.out.println(java.util.Arrays.toString(next(1))); // [1]
        System.out.println(java.util.Arrays.toString(next(2))); // []
    }

    public int[] calculateSpans(int[] prices) {
        List<Integer> spans = new ArrayList<>();
        Stack<int[]> stack = new Stack<>();

        for (int price : prices) {
            while (!stack.isEmpty() && stack.peek()[0] <= price) {
                spans.add(stack.pop()[1]);
            }

            spans.add(1);
            stack.push(new int[]{price, span()});
        }

        return spans.toArray(new Integer[spanCount()]);
    }

}