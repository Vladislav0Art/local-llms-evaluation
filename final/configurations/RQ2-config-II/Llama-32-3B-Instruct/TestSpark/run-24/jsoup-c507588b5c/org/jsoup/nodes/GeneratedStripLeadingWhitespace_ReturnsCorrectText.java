package org.jsoup.nodes;

public class GeneratedStripLeadingWhitespace_ReturnsCorrectText {

    @Test
    public void stripLeadingWhitespace_ReturnsCorrectText() {
        assertEquals("Hello World", TextNode.stripLeadingWhitespace("   Hello World  "));
    }

}