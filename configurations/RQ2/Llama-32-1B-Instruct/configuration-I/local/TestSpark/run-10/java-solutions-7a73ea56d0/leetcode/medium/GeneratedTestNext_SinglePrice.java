package leetcode.medium;

public class GeneratedTestNext_SinglePrice {

    @Test
    public void testNext_SinglePrice() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.setPrice(1);
        int[] result = onlineStockSpan.next(1);
        assertThat(result).isEqualTo(1);
    }

}