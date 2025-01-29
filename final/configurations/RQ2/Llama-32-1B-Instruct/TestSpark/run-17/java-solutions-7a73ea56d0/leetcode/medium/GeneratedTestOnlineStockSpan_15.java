package leetcode.medium;

public class GeneratedTestOnlineStockSpan_15 {

    public static int onlineStockSpan(int n) {
        if (n == 1) return 1;
        return Math.max(onlineStockSpan(n - 1), 1 + onlineStockSpan(n - 2));
    }

    @Test
    public void testOnlineStockSpan_15() {
        assertEquals(16, onlineStockSpan(15));
    }

}