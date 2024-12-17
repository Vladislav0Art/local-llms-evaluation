package leetcode.medium;

public class GeneratedTestGenerateSolution_WithInvalidInput {

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

    @Test
    public void testGenerateSolution_WithInvalidInput() {
        // Arrange
        int n = -1;
        int[] expected = {};
        int[] result = new int[n];

        // Act
        GenerateSolution.generateSolution(n, result);

        // Assert
        assertTrue(GenerateSolution.equals(expected, result));
    }

}