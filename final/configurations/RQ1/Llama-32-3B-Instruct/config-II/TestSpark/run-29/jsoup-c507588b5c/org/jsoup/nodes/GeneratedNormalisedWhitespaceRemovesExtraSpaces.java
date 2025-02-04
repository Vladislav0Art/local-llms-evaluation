package org.jsoup.nodes;

public class GeneratedNormalisedWhitespaceRemovesExtraSpaces {

    @Test
    public void normalisedWhitespaceRemovesExtraSpaces() {
        String text = "   Hello   World  ";
        assertEquals("Hello World", TextNode.normaliseWhitespace(text));
    }

}