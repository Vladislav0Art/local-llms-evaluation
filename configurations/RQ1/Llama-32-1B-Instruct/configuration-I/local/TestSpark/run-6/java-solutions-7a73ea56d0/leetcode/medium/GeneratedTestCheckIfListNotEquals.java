package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.Matchers.is;

public class GeneratedTestCheckIfListNotEquals {

    @Test
    public void testCheckIfListNotEquals() {
        Solution solution = new Solution();
        int[] expected = {3, 2, 1};
        int[] actual = {1, 2, 3};
        boolean result = solution.checkIfListEquals(expected, actual);
        System.out.println(result); // Should print false
    }

}