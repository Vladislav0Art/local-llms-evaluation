package org.jsoup.nodes;

public class GeneratedStripLeadingWhitespace_GivenText_ReturnsCorrectString {

    @Test
    public void stripLeadingWhitespace_GivenText_ReturnsCorrectString() {
        String text = "   Hello World  ";
        String result = TextNode.stripLeadingWhitespace(text);
        assertEquals("Hello World", result);
    }

}