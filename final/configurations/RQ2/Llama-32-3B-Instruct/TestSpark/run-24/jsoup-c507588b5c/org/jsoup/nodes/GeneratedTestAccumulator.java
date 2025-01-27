package org.jsoup.nodes;

public class GeneratedTestAccumulator {

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
    public void testAccumulator() {
        Accumulator accumulator = new Accumulator();
        String accum = "<p>Hello World</p>";
        assertEquals(accum, accumulator.getResult());
    }

}