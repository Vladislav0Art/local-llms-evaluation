package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Text;
import org.junit.Test;

public class GeneratedTextNodeNormaliseWhitespaceTextIsCorrect {

    @Test
    public void TextNodeNormaliseWhitespaceTextIsCorrect() {
        TextNode textNode = new TextNode("Hello  World");
        String normalizedText = textNode.normaliseWhitespace();
        assertEquals("Hello World", normalizedText);
    }

}