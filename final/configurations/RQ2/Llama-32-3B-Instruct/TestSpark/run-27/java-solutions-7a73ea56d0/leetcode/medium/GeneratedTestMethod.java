package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class GeneratedTestMethod {

    public static void main(String[] args) {
        org.junit.jupiter.api.Test
                .repeat(9, 1, 0)
                .apply(context ->
                        new Solution()
                                .testMethod()
                );
    }
}

class Solution {
    public int[] calculate(int[][] heights) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < heights.length - 1; i++) {
            if (heights[i][1] != heights[i + 1][0]) {
                result.add(heights[i][0]);
            }
        }
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++)
            res[i] = result.get(i);
        return res;
    }

    @Test
    public void testMethod() {
        int[][] heights = {{4, 5}, {2, 6}, {1, 7}, {8, 9}};
        int[] expectedOutput = {8, 9};
        assertArrayEquals(expectedOutput, calculate(heights));
    }

}