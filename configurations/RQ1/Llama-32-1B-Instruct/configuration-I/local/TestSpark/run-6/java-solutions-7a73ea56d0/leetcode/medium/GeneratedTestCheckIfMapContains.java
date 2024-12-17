package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.Matchers.is;

public class GeneratedTestCheckIfMapContains {

    @Test
    public void testCheckIfMapContains() {
        Solution solution = new Solution();
        Map<String, Integer> expected = Map.of("a", 1, "b", 2);
        String key = "a";
        int value = 3;
        boolean result = solution.checkIfMapContains(expected, key, value);
        System.out.println(result); // Should print true
    }

}