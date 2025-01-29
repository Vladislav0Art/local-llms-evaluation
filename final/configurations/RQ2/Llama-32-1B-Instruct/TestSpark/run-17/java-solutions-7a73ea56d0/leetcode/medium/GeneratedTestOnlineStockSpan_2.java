package leetcode.medium;

public class GeneratedTestOnlineStockSpan_2 {

    public static int onlineStockSpan(int n) {
        if (n == 1) return 1;
        return Math.max(onlineStockSpan(n - 1), 1 + onlineStockSpan(n - 2));
    }

    @Test
    public void testOnlineStockSpan_2() {
        assertEquals(2, onlineStockSpan(2));
    }

}