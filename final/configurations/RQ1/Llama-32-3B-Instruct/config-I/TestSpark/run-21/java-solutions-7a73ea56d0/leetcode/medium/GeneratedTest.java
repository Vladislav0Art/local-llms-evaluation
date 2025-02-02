package leetcode.medium;

public class GeneratedTest {

    public int[] next(int[] prices) {
        int[] result = new int[prices.length];
        int index = -1;
        for (int i = 0; i < prices.length; i++) {
            while (index >= 0 && prices[index] < prices[i]) {
                index--;
            }
            if (index == -1) {
                result[i] = 1;
            } else {
                result[i] = i - index;
            }
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] test1 = {-10, -5, 0, 3, 20};
        System.out.println(java.util.Arrays.toString(onlineStockSpan.next(test1)));

        int[] test2 = {10, 7, 4, 9, 2};
        System.out.println(java.util.Arrays.toString(onlineStockSpan.next(test2)));

        int[] test3 = {};
        try {
            java.util.Arrays.toString(onlineStockSpan.next(test3));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        int[] test4 = {1, 2, 0, -1};
        try {
            onlineStockSpan.next(test4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public class GeneratedTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testNext() throws Exception {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpark();
        int[] result1 = {0};
        assertEquals(1, onlineStockSpan.next(result1)[0]);

        int[] result2 = {-10, -5, 0, 3, 20};
        assertArrayEquals(new int[]{1, 5, 1, 4, 1}, onlineStockSpark.next(result2));

        thrown.expectIndexOutOfBoundsException();
        thrown.checkThrownException(() -> onlineStockSpark.next(new int[]{}));

        thrown.expectIndexOutOfBoundsException();
        thrown.checkThrownException(() -> onlineStockSpark.next(new int[]{1}));

        int[] result3 = {10, 7, 4, 9, 2};
        assertArrayEquals(new int[]{1, 3, 2, 6, 1}, onlineStockSpark.next(result3));
    }

}