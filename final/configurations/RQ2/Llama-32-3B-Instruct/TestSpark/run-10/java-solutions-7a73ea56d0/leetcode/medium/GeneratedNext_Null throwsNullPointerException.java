package leetcode.medium;

public class GeneratedNext_Null throwsNullPointerException {

    public int next(int price) {
        // implementation...
        return 1;
    }

    public int[] calculateSpans(int[] prices) {
        // implementation...
        int[] result = new int[prices.length];
        Arrays.fill(result, 0);
        return result;
    }
}

public class GeneratedTest {

    @Test
    public void next_Null

    throwsNullPointerException() {
        StockSpanCalculator stockSpan = new StockSpanCalculator();
        NullPointerException e = expectException(NullPointerException.class, stockSpan::next, null);
        assertNotNull(e);
    }
}

public class Util {

    public static <T> T expectException(Class<T> clazz, Consumer consumer, Object... args) throws Exception {
        try {
            return consumer.accept((T) args[0]);
        } catch (Exception | clazz) e {
            throw clazz.getConstructor(String.class).newInstance(e.getMessage());
        }
    }

    public static void assertArraysEqual(int[] expected, int[] actual) {
        if (!java.util.Arrays.equals(expected, actual)) {
            throw new AssertionError("Array elements are not equal");
        }
    }

}