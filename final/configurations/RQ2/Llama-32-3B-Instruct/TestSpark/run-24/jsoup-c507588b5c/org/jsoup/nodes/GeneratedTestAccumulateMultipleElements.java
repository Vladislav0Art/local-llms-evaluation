package org.jsoup.nodes;

public class GeneratedTestAccumulateMultipleElements {

    private StringBuilder resultText = new StringBuilder();

    public void addText(String text) {
        if (!text.isEmpty()) {
            resultText.append(text);
            if (resultText.charAt(resultText.length() - 1) == '<') {
                resultText.deleteCharAt(resultText.length() - 1);
            }
        } else {
            resultText = new StringBuilder();
        }
    }

    public String getResult() {
        return resultText.toString();
    }
}

public class AccumulatorTest {

    @Test
    public void testAccumulateMultipleElements() {
        Accumulator accumulator = new Accumulator();
        String text1 = "<p>Hello World</p>";
        String text2 = "<p>This is another element</p>";
        assertEquals(text1, accumulator.getResult());
        accumulator.addText(text2);
        assertNotNull(accumulator.getResult());
        assertEquals(text1 + " " + text2, accumulator.getResult());
    }

}