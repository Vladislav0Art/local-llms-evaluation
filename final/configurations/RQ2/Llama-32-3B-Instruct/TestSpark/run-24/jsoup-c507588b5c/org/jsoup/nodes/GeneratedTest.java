package org.jsoup.nodes;

public class GeneratedTest {

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

    @Test
    public void testAddText() {
        Accumulator accumulator = new Accumulator();
        String originalText = "Hello";
        String newText = "World";
        accumulator.addText(newText);
        assertNotNull(accumulator.getResult());
        assertEquals(originalText + " " + newText, accumulator.getResult());
    }

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

    @Test
    public void testAccumulateEmpty() {
        Accumulator accumulator = new Accumulator();
        assertEquals("", accumulator.getResult());
    }

}