package leetcode.medium;

public class GeneratedNext_LowestPriceWithMultipleElements_ReturnsMostSpan {

    @Test
    public void next_LowestPriceWithMultipleElements_ReturnsMostSpan() {
        // given
        List<Integer> prices = Arrays.asList(100, 80, 60);
        OnlineStockSpan stockSpan = new OnlineStack(); // mock

        // when
        int result = stockSpan.next(prices.get(1));

        // then
        assertEquals(2, result); // assume the mock returns 2
    }

}