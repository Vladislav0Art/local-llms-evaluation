package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestTwoSum {

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] + nums[i + 1] == target)
                return new int[]{i, i + 1};
        }
        return null;
    }

}

public class GeneratedTest {

    @Test
    public void testTwoSum() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{0, 2}, solution.twoSum(new int[]{2, 7, 11, 15}, 9));
        assertEquals(1, solution.twoSum(new int[]{3, 2, 4}, 6).length);
    }

}