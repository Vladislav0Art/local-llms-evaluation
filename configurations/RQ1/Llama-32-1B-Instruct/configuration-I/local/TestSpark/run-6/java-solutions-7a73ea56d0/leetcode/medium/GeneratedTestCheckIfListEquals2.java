package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.Matchers.is;

public class GeneratedTestCheckIfListEquals2 {

    @Test
    public void testCheckIfListEquals2() {
        Solution solution = new Solution();
        String[] expected = {"12345", "54321"};
        String[] actual = {"21345", "54123"};
        boolean result = solution.checkIfListEquals(expected, actual);
        System.out.println(result); // Should print false
    }

}