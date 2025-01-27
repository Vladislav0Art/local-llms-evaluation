package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Text;
import org.junit.Test;

public class GeneratedTextNodeLastCharIsWhitespaceReturnsFalseForNonWhitespace {

    @Test
    public void TextNodeLastCharIsWhitespaceReturnsFalseForNonWhitespace() {
        TextNode textNode = new TextNode("Hello World");
        boolean result = textNode.lastCharIsWhitespace();
        assertTrue(result);
    }

}