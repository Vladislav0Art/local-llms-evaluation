package leetcode.medium;

public class GeneratedTestNext_Returns_LookingFor_Bigger_Price_Propses_2_Spans_CalculatesCorrectly {

    @Test
    public void testNext_Returns_LookingFor_Bigger_Price_Propses_2_Spans_CalculatesCorrectly() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int price = 80;
        int expected = 3;
        int[] result = instance.calculateSpans(new int[]{100, 120, 150});
        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + Arrays.toString(result));
    }

}