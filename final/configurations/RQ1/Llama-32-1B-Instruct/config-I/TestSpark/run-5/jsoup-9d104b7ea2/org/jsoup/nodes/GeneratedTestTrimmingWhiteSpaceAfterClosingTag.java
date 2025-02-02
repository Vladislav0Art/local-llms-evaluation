package org.jsoup.nodes;

public class GeneratedTestTrimmingWhiteSpaceAfterClosingTag {

    @Test
    public void testTrimmingWhiteSpaceAfterClosingTag() {
        String closingTag = "</p>";
        String expected = "<p>Hello World!</p>";
        String result = trimLeadingWhitespace(closingTag);
        assertEquals(expected, result);
    }

}