package leetcode.medium;

public class GeneratedTestOnlineStockSpan_14 {

    public static int onlineStockSpan(int n) {
        if (n == 1) return 1;
        return Math.max(onlineStockSpan(n - 1), 1 + onlineStockSpan(n - 2));
    }

    @Test
    public void testOnlineStockSpan_14() {
        assertEquals(15, onlineStockSpan(14));
    }

}