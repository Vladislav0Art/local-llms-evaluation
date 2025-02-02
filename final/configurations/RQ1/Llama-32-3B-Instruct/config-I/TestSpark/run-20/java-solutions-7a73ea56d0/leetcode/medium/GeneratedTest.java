package leetcode.medium;

public class GeneratedTest {

    private int count = 0;
    private int[] result = new int[6];

    public void next(int price) {
        if (count == 0) {
            result[count++] = price * 100;
        } else if (price <= result[count - 1]) {
            for (int i = count; i < result.length; i++) {
                result[i] = result[i - 1];
            }
            result[0] = price * 100;
            ++count;
        }
    }

    public int[] solution(int[] prices) {
        while (prices.length > 0) {
            next(prices[0]);
            --prices[0];
        }
        return result;
    }

    public void test_solution() {
        Solution sol = new Solution();
        Integer[][] prices = {{1, 2, 3}};
        int[] expectedResult = {16000, 13000, 12000};
        assertArrayEquals(expectedResult, sol.solution(prices[0]));
    }

    public void test_count() {
        Solution sol = new Solution();
        int count = 0;
        sol.count = count;
        assert (count == 1);
        sol.next(10000);
        assert (count == 2);
    }

    public void test_result() {
        Solution sol = new Solution();
        for (int i : sol.result) {
            System.out.print(i + " ");
        }
    }
}

public class SolutionTest {

}