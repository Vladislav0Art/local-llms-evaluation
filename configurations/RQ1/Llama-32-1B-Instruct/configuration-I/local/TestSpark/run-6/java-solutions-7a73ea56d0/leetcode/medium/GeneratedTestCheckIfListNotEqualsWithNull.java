package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.Matchers.is;

public class GeneratedTestCheckIfListNotEqualsWithNull {

    @Test
    public void testCheckIfListNotEqualsWithNull() {
        Solution solution = new Solution();
        String[] expected = {"12345", "54321"};
        String[] nullActual = null;
        boolean result = solution.checkIfListEquals(expected, nullActual);
        System.out.println(result); // Should print false
    }

}