package leetcode.medium;

public class GeneratedTestOnlineStockSpan_16 {

    public static int onlineStockSpan(int n) {
        if (n == 1) return 1;
        return Math.max(onlineStockSpan(n - 1), 1 + onlineStockSpan(n - 2));
    }

    @Test
    public void testOnlineStockSpan_16() {
        assertEquals(17, onlineStockSpan(16));
    }

}