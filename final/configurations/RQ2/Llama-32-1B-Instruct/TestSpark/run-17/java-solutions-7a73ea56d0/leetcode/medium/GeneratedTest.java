package leetcode.medium;

public class GeneratedTest {

    public static int onlineStockSpan(int n) {
        if (n == 1) return 1;
        return Math.max(onlineStockSpan(n - 1), 1 + onlineStockSpan(n - 2));
    }

    @Test
    public void testOnlineStockSpan_1() {
        assertEquals(1, onlineStockSpan(1));
    }

    @Test
    public void testOnlineStockSpan_2() {
        assertEquals(2, onlineStockSpan(2));
    }

    @Test
    public void testOnlineStockSpan_3() {
        assertEquals(3, onlineStockSpan(3));
    }

    @Test
    public void testOnlineStockSpan_4() {
        assertEquals(4, onlineStockSpan(4));
    }

    @Test
    public void testOnlineStockSpan_5() {
        assertEquals(5, onlineStockSpan(5));
    }

    @Test
    public void testOnlineStockSpan_6() {
        assertEquals(6, onlineStockSpan(6));
    }

    @Test
    public void testOnlineStockSpan_7() {
        assertEquals(7, onlineStockSpan(7));
    }

    @Test
    public void testOnlineStockSpan_8() {
        assertEquals(8, onlineStockSpan(8));
    }

    @Test
    public void testOnlineStockSpan_9() {
        assertEquals(9, onlineStockSpan(9));
    }

    @Test
    public void testOnlineStockSpan_10() {
        assertEquals(10, onlineStockSpan(10));
    }

    @Test
    public void testOnlineStockSpan_11() {
        assertEquals(11, onlineStockSpan(11));
    }

    @Test
    public void testOnlineStockSpan_12() {
        assertEquals(12, onlineStockSpan(12));
    }

    @Test
    public void testOnlineStockSpan_13() {
        assertEquals(13, onlineStockSpan(13));
    }

    @Test
    public void testOnlineStockSpan_14() {
        assertEquals(15, onlineStockSpan(14));
    }

    @Test
    public void testOnlineStockSpan_15() {
        assertEquals(16, onlineStockSpan(15));
    }

    @Test
    public void testOnlineStockSpan_16() {
        assertEquals(17, onlineStockSpan(16));
    }

    @Test
    public void testOnlineStockSpan_17() {
        assertEquals(18, onlineStockSpan(17));
    }

}