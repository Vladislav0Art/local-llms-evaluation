package org.jsoup.nodes;

public class GeneratedTestAddText {

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
    public void testAddText() {
        Accumulator accumulator = new Accumulator();
        String originalText = "Hello";
        String newText = "World";
        accumulator.addText(newText);
        assertNotNull(accumulator.getResult());
        assertEquals(originalText + " " + newText, accumulator.getResult());
    }

}