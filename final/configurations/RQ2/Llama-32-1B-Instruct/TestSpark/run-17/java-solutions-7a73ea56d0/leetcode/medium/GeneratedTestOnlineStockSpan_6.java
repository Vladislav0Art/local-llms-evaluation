package leetcode.medium;

public class GeneratedTestOnlineStockSpan_6 {

    public static int onlineStockSpan(int n) {
        if (n == 1) return 1;
        return Math.max(onlineStockSpan(n - 1), 1 + onlineStockSpan(n - 2));
    }

    @Test
    public void testOnlineStockSpan_6() {
        assertEquals(6, onlineStockSpan(6));
    }

}