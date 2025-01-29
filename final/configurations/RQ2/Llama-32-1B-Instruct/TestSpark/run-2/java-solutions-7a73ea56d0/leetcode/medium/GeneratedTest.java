package leetcode.medium;

public class GeneratedTest {

    public static int[] calculateSpans(int n) {
        return new int[n];
    }
}

public class TestSolution {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] result = solution.calculateSpans(2);
        assertEquals(3, result[0]);
        assertEquals(4, result[1]);
    }

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

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[] result = solution.calculateSpans(10);
        assertEquals(11, result[0]);
        assertEquals(12, result[1]);
        assertEquals(13, result[2]);
        assertEquals(14, result[3]);
        assertEquals(15, result[4]);
        assertEquals(16, result[5]);
        assertEquals(17, result[6]);
        assertEquals(18, result[7]);
        assertEquals(19, result[8]);
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        int[] result = solution.calculateSpans(21);
        assertEquals(24, result[0]);
    }

    @Test
    public void test5() {
        Solution solution = new Solution();
        int[] result = solution.calculateSpans(35);
        assertEquals(67, result[0]);
    }

    @Test
    public void test6() {
        Solution solution = new Solution();
        int[] result = solution.calculateSpans(77);
        assertEquals(220, result[0]);
    }

    @Test
    public void test7() {
        Solution solution = new Solution();
        int[] result = solution.calculateSpans(265);
        assertEquals(1030, result[0]);
    }

}