package leetcode.medium;

public class GeneratedTestOnlineStockSpan_4 {

    public static int onlineStockSpan(int n) {
        if (n == 1) return 1;
        return Math.max(onlineStockSpan(n - 1), 1 + onlineStockSpan(n - 2));
    }

    @Test
    public void testOnlineStockSpan_4() {
        assertEquals(4, onlineStockSpan(4));
    }

}