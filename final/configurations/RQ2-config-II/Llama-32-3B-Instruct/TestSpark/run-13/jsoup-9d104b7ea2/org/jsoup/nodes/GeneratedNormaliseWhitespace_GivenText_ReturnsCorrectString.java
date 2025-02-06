package org.jsoup.nodes;

public class GeneratedNormaliseWhitespace_GivenText_ReturnsCorrectString {

    @Test
    public void normaliseWhitespace_GivenText_ReturnsCorrectString() {
        String text = "   Hello World  ";
        String result = TextNode.normaliseWhitespace(text);
        assertEquals("Hello World", result);
    }

}