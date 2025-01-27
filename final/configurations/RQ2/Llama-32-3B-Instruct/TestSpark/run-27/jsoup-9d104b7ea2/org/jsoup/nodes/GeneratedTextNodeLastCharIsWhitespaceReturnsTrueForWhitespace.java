package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Text;
import org.junit.Test;

public class GeneratedTextNodeLastCharIsWhitespaceReturnsTrueForWhitespace {

    @Test
    public void TextNodeLastCharIsWhitespaceReturnsTrueForWhitespace() {
        TextNode textNode = new TextNode("   ");
        boolean result = textNode.lastCharIsWhitespace();
        assertTrue(result);
    }

}