package org.jsoup.nodes;

public class GeneratedStripLeadingWhitespace_returnsCorrect_result_for_test_string {

    @Test
    public void stripLeadingWhitespace_returnsCorrect_result_for_test_string() {
        String testString = "Hello World!";
        assertEquals("World", stripLeadingWhitespace(new StringBuilder(testString)));
    }

    private TextNode createTextNode(String text) {
        return new TextNode(text);
    }

}