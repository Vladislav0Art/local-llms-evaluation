package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.Matchers.is;

public class GeneratedTestCheckIfSetEquals {

    @Test
    public void testCheckIfSetEquals() {
        Solution solution = new Solution();
        Set<Integer> expected = new HashSet<>(Collections.of(1, 2, 3));
        Set<Integer> actual = new HashSet<>();
        actual.add(4);
        boolean result = solution.checkIfSetEquals(expected, actual);
        System.out.println(result); // Should print true
    }

}