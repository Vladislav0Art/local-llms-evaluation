package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.Matchers.is;

public class GeneratedTestCheckIfListEquals {

    @Test
    public void testCheckIfListEquals() {
        Solution solution = new Solution();
        int[] expected = {3, 2, 1};
        int[] actual = {2, 3, 1};
        boolean result = solution.checkIfListEquals(expected, actual);
        System.out.println(result); // Should print true
    }

}