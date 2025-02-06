package org.jsoup.nodes;

public class GeneratedNormaliseWhitespace_ReturnsCorrectText {

    @Test
    public void normaliseWhitespace_ReturnsCorrectText() {
        assertEquals("Hello World", TextNode.normaliseWhitespace("   Hello World  "));
    }

}