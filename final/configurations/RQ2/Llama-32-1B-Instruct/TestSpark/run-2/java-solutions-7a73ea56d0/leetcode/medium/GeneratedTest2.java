package leetcode.medium;

public class GeneratedTest2 {

    public static int[] calculateSpans(int n) {
        return new int[n];
    }
}

public class TestSolution {

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] result = solution.calculateSpans(6);
        assertEquals(4, result[0]);
        assertEquals(5, result[1]);
        assertEquals(6, result[2]);
        assertEquals(7, result[3]);
        assertEquals(8, result[4]);
        assertEquals(9, result[5]);
    }

}