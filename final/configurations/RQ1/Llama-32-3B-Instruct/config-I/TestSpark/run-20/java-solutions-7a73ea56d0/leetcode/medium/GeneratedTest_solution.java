package leetcode.medium;

public class GeneratedTest_solution {

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
}

public class SolutionTest {

    @Test
    public void test_solution() {
        Solution sol = new Solution();
        Integer[][] prices = {{1, 2, 3}};
        for (int i : sol.solution(prices[0])) {
            System.out.print(i + " ");
        }
    }

}