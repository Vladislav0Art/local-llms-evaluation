package leetcode.medium;

public class GeneratedTest {

    @Test
    public void test1() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int expected = 2;
        assertEquals(expected, instance.next(prices[0]));
        assertEquals(1, instance.next(prices[1]));
        assertEquals(2, instance.next(prices[2]));
        assertEquals(2, instance.next(prices[3]));
        assertEquals(3, instance.next(prices[4]));
    }

    @Test
    public void test2() {
        int[] prices = {10, 20, 30};
        int expected = 3;
        assertEquals(expected, instance.next(prices[0]));
        assertEquals(1, instance.next(prices[1]));
        assertEquals(2, instance.next(prices[2]));
    }

    @Test
    public void test3() {
        int[] prices = {7, 6, 5, 4, 3};
        int expected = 5;
        assertEquals(expected, instance.next(prices[0]));
        assertEquals(1, instance.next(prices[1]));
        assertEquals(2, instance.next(prices[2]));
    }

    @Test
    public void test4() {
        int[] prices = {10, 20, 30, 40, 50};
        int expected = 5;
        assertEquals(expected, instance.next(prices[0]));
        assertEquals(3, instance.next(prices[1]));
        assertEquals(4, instance.next(prices[2]));
        assertEquals(6, instance.next(prices[3]));
    }

    @Test
    public void test5() {
        int[] prices = {7, 6, 5, 4};
        int expected = 0;
        assertEquals(expected, instance.next(prices[0]));
        assertEquals(1, instance.next(prices[1]));
        assertEquals(2, instance.next(prices[2]));
    }

}