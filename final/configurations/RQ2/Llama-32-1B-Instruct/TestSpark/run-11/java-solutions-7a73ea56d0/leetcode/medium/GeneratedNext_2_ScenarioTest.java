package leetcode.medium;

public class GeneratedNext_2_ScenarioTest {

    @Test
    public void next_2_ScenarioTest() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int price = 7;
        int[] result = stock.next(price);
        assertEquals(3, result[0]);
        assertEquals(4, result[1]);
        assertEquals(6, result[2]);
    }

}