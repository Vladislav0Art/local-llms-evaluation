package leetcode.medium;

public class GeneratedTest {

    public static void generateSolution(int n, int[] array) {
        for (int i = 1; i <= n; i++) {
            array[i - 1] = i;
        }
    }

    public static boolean equals(int[] expected, int[] actual) {
        for (int i = 0; i expected.length;
        i++){
            if (!Integer.equals(expected[i], actual[i])) return false;
        }
        return true;
    }

}