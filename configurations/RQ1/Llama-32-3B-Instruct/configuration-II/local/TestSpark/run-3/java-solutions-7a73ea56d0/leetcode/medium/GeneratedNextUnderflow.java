package leetcode.medium;

public class GeneratedNextUnderflow {

    @Test
    public void nextUnderflow() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int price = -1;
        try {
            stockSpan.next(price);
            fail("expected exception");
        } catch (Exception e) {
            // expected
        }
    }

}