package leetcode.medium;

public class GeneratedTestOnlineStockSpan_17 {

    public static int onlineStockSpan(int n) {
        if (n == 1) return 1;
        return Math.max(onlineStockSpan(n - 1), 1 + onlineStockSpan(n - 2));
    }

    @Test
    public void testOnlineStockSpan_17() {
        assertEquals(18, onlineStockSpan(17));
    }

}