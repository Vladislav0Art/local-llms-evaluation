package leetcode.medium;

public class GeneratedTest {

    @Test
    public void testNext_Proposes_1_Span() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int result = instance.next(100);
        assertEquals(1, result);
    }

    @Test
    public void testNext_Returns_LookingFor_Bigger_Price_Propses_2_Spans() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int price = 90;
        int expected = 3;
        int result = instance.next(price);
        assertEquals(expected, result);
    }

    @Test
    public void testNext_Returns_LookingFor_Bigger_Price_Propses_1_Span() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int price = 80;
        int expected = 2;
        int result = instance.next(price);
        assertEquals(expected, result);
    }

    @Test
    public void testNext_Returns_LookingFor_Bigger_Price_Propses_0_Spans() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int price = 70;
        int expected = 1;
        int result = instance.next(price);
        assertEquals(expected, result);
    }

    @Test
    public void testNext_Returns_LookingFor_Bigger_Price_Propses_2_Spans_CalculatesCorrectly() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int price = 80;
        int expected = 3;
        int[] result = instance.calculateSpans(new int[]{100, 120, 150});
        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + Arrays.toString(result));
    }

    @Test
    public void testNext_Sets_Span_1() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int price = 90;
        int span = instance.next(price);
        assertEquals(1, span);
    }

}